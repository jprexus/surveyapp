# SurveyShrike surveyapp

## FrontEnd
Node: 10.16.3
Angular: 5.2.11

Go To Folder **surveyclient**
npm build
ng serve -o
Go To http://localhost:4200

**Uses Google OAUTH for Authentication and Authorization**
On click of Sign In Using Google, a Google Login Window will appear
 
 **DEV Region** http://ec2-13-233-123-179.ap-south-1.compute.amazonaws.com/surveyapp/

## BackEnd
Backend is a Spring Boot REST API server.
Open com.surveyshrike.surveyapp.BackendApplication
Run As >> Java Application
Go To http://localhost:10080/swagger-ui.html

**DEV Region** http://ec2-13-233-13-105.ap-south-1.compute.amazonaws.com/api/swagger-ui.html

## Build and Deployment
Build and Deployment is done using local Jenkins pipeline jobs

**Pipeline scripts are available under**
surveyclient
	|-deploy
		|- jenkinsfile-deploy

frontend
	|-deploy
		|-jenkinsfile-build
		|-jenkinsfile-deploy

The Build Jobs create the artefacts and runs the tests.
The Deploy Jobs will push the artefacts to AWS EC2 servers
**Sample Pipeline Job**

**JUnit Test Report**

**Code Coverage Report**
![Code Coverage](https://github.com/jprexus/surveyapp/blob/develop/Code%20Coverage.png)
