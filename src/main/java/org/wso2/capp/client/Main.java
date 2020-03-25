package org.wso2.capp.client;

import org.wso2.capp.client.executers.ClientExecutor;

public class Main {
    public static void main(String args []) throws Exception {

        System.out.println("Works!!!");
        setSystemProperties("/Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks", "wso2carbon");
        ClientExecutor client = new ClientExecutor("https://localhost:9443", "admin", "admin");
        client.deployCApp("/Users/yasassri/work/services/edinburgh/source/uoe-qsp-cicd/cicd-demo-project/capp/target/cicd-demo-capp_1.0.1-SNAPSHOT.car");

        System.out.println("GET APP List");
        String[] li = client.getExistingApplicationList();

        for (String s : li ) {
            System.out.println("XXXX " + s);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword){
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }
}
