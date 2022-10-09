# WSO2 Carbon Application Manager
This is a utility client which is capable of managing carbon application in remote WSO2 servers.

## Supported Operations

### Deploy CApps
The deploy operation allows you to deploy a given carbon application.
````
java -jar capp-manager-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car
````
Also you can use the --force option which will undeploy an existing carbon app and deploy the new application. 
```
java -jar capp-manager-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car --force
```
### Undeploy CApp
This operation allows you to undeploy a specified CApp. You have to specify the carbon application name only. 
````
java -jar capp-manager-1.0.0.jar undeploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp
````
### List Apps
The list operation allows you to list all the carbon applications that are already deployed in the server.
````
java -jar capp-manager-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin
````
If you want to get a processable output you can only read the standard out.
````
java -jar capp-manager-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin 2> /dev/null
````
### Download CApp
The download operation allows you to download the specified carbon application to a given location.
````
java -jar capp-manager-1.0.0.jar download --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp --destination ./
````

### Insecure Connection
You can connect to the remote server insecurely as well. For this you can specify the `-K` or `--unsecure` option. In this case you can ommit using the `--trustore-location` option as well. Example below.

```
java -jar capp-manager-0.1.2.jar list-apps --server https://localhost:9443 --username admin --password admin -K
```

## Instructions for Usage
### Building the client
First clone the source code and then execute `mvn clean install` which will generate the executable uber Jar in the target directory.

### Importing certificates to access remote servers. 

First we need to create a java keystore in JKS format and then import the remote servers public certificate to that keystore.

````
e.g: keytool -import -alias dev-env -file public.cer -storetype JKS -keystore client-truststore.jks
````

After that you can execute any operation referring the above example section. 

## Understanding the output streams
All the output logs are written into a file and to the console STD_ERROR. All the output data is written to the console std out. 
We are writing outputs to the std error because the outputs that should be processable will be written to the stdout. So the output information can be easily processed.
The log file will be created at <Execution_Location>/logs/capp-client.logs

If you only wants the standard error printed in the console you can pipe the std error to a different file.

````
e.g: java -jar capp-manager-0.1.2.jar help 2> /dev/null
````