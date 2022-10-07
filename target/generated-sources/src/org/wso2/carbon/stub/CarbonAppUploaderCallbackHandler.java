
/**
 * CarbonAppUploaderCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.stub;

    /**
     *  CarbonAppUploaderCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CarbonAppUploaderCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CarbonAppUploaderCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CarbonAppUploaderCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for uploadApp method
            * override this method for handling normal response from uploadApp operation
            */
           public void receiveResultuploadApp(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from uploadApp operation
           */
            public void receiveErroruploadApp(java.lang.Exception e) {
            }
                


    }
    