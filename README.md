# Introduction

Todo in dotty is a production grade project written in dotty. This repo should 
help anyone who wants to start a new project in dotty. It contains following 
components - 

* HTTP server - http4s
* CRUD based application - doobie / slick
* Unit and integration tests
* User logins
* Monitoring with statsD, newrelic
* Docker
* Deploying to cloud

# Create dotty project

You can use the `lampepfl/dotty.g8` template to create a new dotty project. 
Type the following command in console

```scala
sbt new lampepfl/dotty.g8
```

# Project Structure
```
|-- src
      |-- main
      |      |-- scala
      |             |-- com.mountedthoughts      
      |                   |-- repository
      |                   |-- service
      |                   |-- handler
      |                   |-- models
      |-- test
            |-- scala
                    |-- com.mountedthougths
                          |-- repository
                          |-- service
                          |-- handler
                          |-- models            
```