# WSO2 Carbon Application Manager
This is a utility client which is capable of managing carbon application in remote WSO2 servers.

## Supported Operations

### Deploy CApps
The deploy operation allows you to deploy a given carbon application.
````
java -jar capp-client-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car
````
Also you can use the --force option which will undeploy an existing carbon app and deploy the new application. 
```
java -jar target/capp-client-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car --force
```
### Undeploy CApp
This operation allows you to undeploy a specified CApp. You have to specify the carbon application name only. 
````
java -jar target/capp-client-1.0.0.jar undeploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp
````
### List Apps
The list operation allows you to list all the carbon applications that are already deployed in the server.
````
java -jar target/capp-client-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin
````
If you want to get a processable output you can only read the standard out.
````
java -jar target/capp-client-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin 2> /dev/null
````
## Download CApp
The download operation allows you to download the specified carbon application to a given location.
````
java -jar capp-client-1.0.0.jar download --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp --destination ./
````

## Instructions for Usage

### Accessing remote WSO2 servers. 

First we need to create trust dtore in JKS format and then import the remote servers public certificate to that trustore.

````
e.g: keytool -import -alias dev-env -file public.cer -storetype JKS -keystore client-truststore.jks
````

## Understanding the output streams
All the output logs are written into a file and to the console STD_ERROR. All the output data is written to the console std out. 
We are writing outputs to the std error because the outputs that should be processable will be written to the stdout. So the output information can be easily processed.
The log file will be created at <Execution_Location>/logs/capp-client.logs

If you only wants the standard error printed in the console you can pipe the std error to a different file.

````
e.g: java -jar target/capp-client-0.1.2.jar help 2> /dev/null
````