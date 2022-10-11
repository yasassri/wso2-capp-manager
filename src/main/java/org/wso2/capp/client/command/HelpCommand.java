package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.util.StringUtil;

/**
 * This class lists the available functions.
 *
 * @since 1.0.0
 */
public class HelpCommand {

    private static final Logger logger = LogManager.getLogger(HelpCommand.class);

    public void execute() throws CommandExecutionException {
        String ls = System.lineSeparator();
        String usageBuilder = StringUtil.concatStrings("\nDeploy CApps\n" +
                "===========" + ls +
                "The deploy operation allows you to deploy a given carbon application.\n" +
                "\n" +
                "java -jar capp-client-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car\n" +
                "Also you can use the --force option which will undeploy an existing carbon app and deploy the new application.\n" +
                "\n" +
                "java -jar target/capp-client-1.0.0.jar deploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --file ./cicd-demo-capp_1.0.1-SNAPSHOT.car --force\n" +
                "\nUndeploy CApp\n" +
                "=============" + ls +
                "This operation allows you to undeploy a specified CApp. You have to specify the carbon application name only.\n" +
                "\n" +
                "java -jar target/capp-client-1.0.0.jar undeploy --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp\n" +
                "\nList Apps\n" + "===========" + ls +
                "The list operation allows you to list all the carbon applications that are already deployed in the server.\n" +
                "\n" +
                "java -jar target/capp-client-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./security/client-truststore.jks --trustore-password wso2carbon --username admin --password admin\n" +
                "If you want to get a processable output you can only read the standard out.\n" +
                "\n" +
                "java -jar target/capp-client-1.0.0.jar list-apps --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin 2> /dev/null\n" +
                "\nDownload CApp\n" + "==============" + ls +
                "The download operation allows you to download the specified carbon application to a given location.\n" +
                "\n" +
                "java -jar capp-client-1.0.0.jar download --server https://localhost:9443 --trustore-location ./client-truststore.jks --trustore-password wso2carbon --username admin --password admin --app-name cicd-demo-capp --destination ./\n");
        System.out.println(usageBuilder);
    }

    /**
     * fixing args4j issue of showing the class id in the help output.
     */
    @Override
    public String toString() {
        return "";
    }
}
