# capp-deployer-client
A helper client to wrap Capp management operations

### Unforced Deploy
java -jar target/capp-client-1.0.0-SNAPSHOT.jar deploy --server https://localhost:9443 --trustore-location /Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file /Users/yasassri/work/services/edinburgh/source/uoe-qsp-cicd/cicd-demo-project/capp/target/cicd-demo-capp_1.0.1-SNAPSHOT.car

### Force Deploy
java -jar target/capp-client-1.0.0-SNAPSHOT.jar deploy --server https://localhost:9443 --trustore-location /Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file /Users/yasassri/work/services/edinburgh/source/uoe-qsp-cicd/cicd-demo-project/capp/target/cicd-demo-capp_1.0.1-SNAPSHOT.car --force

### Undeploy Capp
java -jar target/capp-client-1.0.0-SNAPSHOT.jar undeploy --server https://localhost:9443 --trustore-location /Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp_1.0.1

### List Apps
java -jar target/capp-client-1.0.0-SNAPSHOT.jar list-apps --server https://localhost:9443 --trustore-location /Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin
