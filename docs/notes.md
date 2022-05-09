# amazon project notes

## notes

- when modeling an app
    - determine features
    - create a user flow
    - specify how flow is operated

- MVC
    - components
        - Controller
            - responsible for handling requests from client
            - manages model and view
        - Model
            - Handles data logic
            - interacts with database
        - View
            - handles data presentation
            - dynamically rendered
    - overall flow
        - client sends controller a request
        - controller asks model for data
        - model provides data to controller
        - controller sends data to view
        - view creates presentation
        - view sends presentation to controller
        - controller sends response to client
- postgres
    - https://www.javaguides.net/2021/08/spring-boot-postgresql-crud-example.html
    - in the commandline, type ```psql -h localhost -U postgres``` to login to postgres after installation
    - use the application.properties file to specify database properties

## questions

### answered

### unanswered

- how did you connect the database?
- How did you model the project?
- how did you implement the MVC design pattern?
- how do you organize the folder structure?
- does the controller handle api calls?
- can i save seraches in a cache?
    - how do I implement a cache?
- How do I play a link to a song file in react
    - i can embed a spotify iframe
- How can I make the server respond to requests
    - create a router
- will the database have to be reset everytime the server is started?

## todo