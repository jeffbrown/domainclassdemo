= Domain Class Library

The project defined in `domain/` contains a domain class.

The project defined in `nonwebapp/` is a non-Grails application.

the project defined in `webapp/` is a Grails application.

To run the non-Grails application:

    ./gradlew nonwebapp:run
    
To run the Grails application:

    ./gradlew webapp:bootRun
    
Both of those apps use the domain class defined in `domain/`.

One could publish the library defined in `domain/` and consume that
from Grails apps as well as non-Grails apps.
