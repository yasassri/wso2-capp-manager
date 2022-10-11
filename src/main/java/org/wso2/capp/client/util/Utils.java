package org.wso2.capp.client.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.Main;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.io.InputStream;
import java.security.KeyStore;

public class Utils {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void setUpKeystore(String trustStorePath, String trustStorePassword, boolean insecure) {
        if (insecure) {
            System.setProperty("httpclient.hostnameVerifier", "AllowAll");
        }
        if (!trustStorePath.isEmpty()) {
            System.setProperty("javax.net.ssl.trustStore", trustStorePath);
            System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
            System.setProperty("javax.net.ssl.trustStoreType", "JKS");
            return;
        } else {
            setupDefaultTruststore();
        }
    }

    private static void setupDefaultTruststore() {
        final String keystorePath = "/client-truststore.jks";
        final char[] keystorePassword = "wso2carbon".toCharArray();

        try (InputStream storeStream = Utils.class.getResourceAsStream(keystorePath)) {
            setSSLFactories(storeStream, "JKS", keystorePassword);
        } catch (Exception e) {
            logger.error("Error occured while logging the default keystore " + e);
        }
    }

    private static void setSSLFactories(InputStream keyStream, String keystoreType, char[] keyStorePassword) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(keystoreType);
        keyStore.load(keyStream, keyStorePassword);

        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

        trustManagerFactory.init(keyStore);
        TrustManager[] keyManagers = trustManagerFactory.getTrustManagers();
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, keyManagers, null);
        SSLContext.setDefault(sslContext);
    }

    public static void handleError(Exception e) {
        logger.error("Error while parsing command line arguments.", e);
        System.exit(1);
    }
}
