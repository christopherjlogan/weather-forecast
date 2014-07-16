README.md

Weather Forecast Web Application System
Written by Chris Logan, July 2014

End User Value: The system provides users with a list of weather stations throughout the country from which they see current weather conditions.

Architectural Views
-Use Case
There is one use case for this system - Retrieve Weather Forecast.  The use case begins by the user being presented with a list of weather stations.  After selecting a station from the list, its forecast is displayed to the user.

-System
The solution has 2 physical tiers, the client and server tier.  The client tier is a thin-client web browser that supports HTML 5.  The server tier are REST web services that run on Pivotal Web Services.  The server tier connects to an external data provider site from where it retrieves weather station and forecast data.

-Interface
The client/server interface is based on REST web services, using HTTP GET for requests and returning responses encoded in JSON format.  There are two API calls provided by this service: Retrieve Station List (/regions) and Retrieve Station Forecast (/forecast).

Retrieve Station List has no parameters.  It returns back the entire list of stations for which there are forecasts.  {Describe JSON}.

Retrieve Station Forecast has one parameter named city, which is the name of the station whose forecast is being requested.  This parameter is specified as a query string parameter.

-Software
The client tier of the application uses HTML for page rendering and JQuery for calling the REST APIs and populating the page elements with the responses.

The server tier of the application makes extensive use of the Spring Framework.  The REST API is a Spring Web MVC REST Controller.  The station list and forecast retrieval components are Spring IoC Services that are autowired to the REST controller.  The application itself is a Spring Boot application, requiring minimal skeleton code to implement.

Data retrieval of the station list and forecast data uses JAXB to unmarshal XML data into Java objects, which are then converted by JSON by the Spring Web MVC Framework.

All code is written and compiled to JSE 7 specifications.

-Build, Integration and Deployment
The application is built using the Maven 2 build system.  The output of the build process is a jar file that can be run by Spring Boot within the build process using the Spring Boot parent pom file.  All source code is maintained in a GitHub repository.

Continuous Integration is achieved using the Jenkins CI tool.  Jenkins is configured to build with code retrieved from GitHub.  Automated builds are configured whenever a GitHub checkin occurs.  Success/failure reports are delivered via email.

The application is deployed to a dedicated Pivotal Web Services Cloud Foundry organization.  There is currently one environment - Development.  The packaged application is deployed manually to CF using the CF CLI push command.