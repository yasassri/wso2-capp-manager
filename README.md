# capp-deployer-client
A helper client to wrap Capp management operations

### Unforced Deploy
This will undeploy if there is an Capp already and deploy the new app
java -jar target/capp-client-1.0.0-SNAPSHOT.jar deploy --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car

### Force Deploy
java -jar target/capp-client-1.0.0-SNAPSHOT.jar deploy --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car --force

### Undeploy Capp
java -jar target/capp-client-1.0.0-SNAPSHOT.jar undeploy --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp_1.0.1

### List Apps
java -jar target/capp-client-1.0.0-SNAPSHOT.jar list-apps --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin

## Download CApp
java -jar target/capp-client-1.0.0-SNAPSHOT.jar download --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp_1.0.1 --destination ./

# Instructions for Usage

## Accessing remote WSO2 servers. 

First we need to create trust dtore in JKS format and then import the remote servers public certificate to that trustore.

e.g: keytool -import -alias uoe-dev -file public.cer -storetype JKS -keystore client-truststore.jks

# CApp Naming Convension

cicd-demo-capp_1.0.1-SNAPSHOT.car

# Understanding the output streams
All the output logs are written into a file and to the console STD_ERROR. All the output data is written to the console std out. 
We are writing outputs to the std error because the outputs that should be processable will be written to the stdout. So the output information can be easily processed.
The log file will be created at <Execution_Location>/logs/capp-client.logs

If you only wants the standard error printed in the console you can pipe the std error to a different file.

e.g: java -jar target/capp-client-0.1.2.jar help 2> /dev/null
