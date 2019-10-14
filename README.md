# SurveyShrike surveyapp

## FrontEnd
Node: 10.16.3</br>
Angular: 5.2.11</br>

Go To Folder **surveyclient**</br>
npm build</br>
ng serve -o</br>
Go To http://localhost:4200</br>

**Uses Google OAUTH for Authentication and Authorization**</br>
>On click of Sign In Using Google, a Google Login Window will appear</br>
 
 **DEV Region** http://ec2-13-233-123-179.ap-south-1.compute.amazonaws.com/surveyapp/</br>

## BackEnd
Backend is a Spring Boot REST API server</br>
Open **com.surveyshrike.surveyapp.BackendApplication**</br>
Run As >> Java Application</br>
</br>
Go To http://localhost:10080/swagger-ui.html</br>

**DEV Region** http://ec2-13-233-13-105.ap-south-1.compute.amazonaws.com/api/swagger-ui.html</br>


## Architecture
![Code Coverage](https://github.com/jprexus/surveyapp/blob/develop/arch.png)


## Build and Deployment
>Build and Deployment is done using local Jenkins pipeline jobs</br>

**Pipeline scripts are available under**</br>
surveyclient --> deploy --> jenkinsfile-deploy</br>

frontend --> deploy</br>
	jenkinsfile-build
	jenkinsfile-deploy</br>
</br>
The Build Jobs create the artefacts and runs the tests</br>
The Deploy Jobs will push the artefacts to AWS EC2 servers</br>

**Sample Pipeline Job**
![Pipeline Job](https://github.com/jprexus/surveyapp/blob/develop/Pipeline%20Job.png)

**JUnit Test Report**
![Test Report](https://github.com/jprexus/surveyapp/blob/develop/Test%20Result.png)

**Code Coverage Report**
![Code Coverage](https://github.com/jprexus/surveyapp/blob/develop/Code%20Coverage.png)


