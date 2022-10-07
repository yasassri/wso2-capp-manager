
/**
 * ApplicationAdminCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.stub;

    /**
     *  ApplicationAdminCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ApplicationAdminCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ApplicationAdminCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ApplicationAdminCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for listAllApplications method
            * override this method for handling normal response from listAllApplications operation
            */
           public void receiveResultlistAllApplications(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listAllApplications operation
           */
            public void receiveErrorlistAllApplications(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for downloadCappArchive method
            * override this method for handling normal response from downloadCappArchive operation
            */
           public void receiveResultdownloadCappArchive(
                    javax.activation.DataHandler result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from downloadCappArchive operation
           */
            public void receiveErrordownloadCappArchive(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAppData method
            * override this method for handling normal response from getAppData operation
            */
           public void receiveResultgetAppData(
                    org.wso2.carbon.application.mgt.stub.types.carbon.ApplicationMetadata result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAppData operation
           */
            public void receiveErrorgetAppData(java.lang.Exception e) {
            }
                


    }
    