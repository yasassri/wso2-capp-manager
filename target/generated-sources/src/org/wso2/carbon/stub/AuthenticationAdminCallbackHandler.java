
/**
 * AuthenticationAdminCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:02:53 UTC)
 */

    package org.wso2.carbon.stub;

    /**
     *  AuthenticationAdminCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AuthenticationAdminCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AuthenticationAdminCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AuthenticationAdminCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for loginWithRememberMeOption method
            * override this method for handling normal response from loginWithRememberMeOption operation
            */
           public void receiveResultloginWithRememberMeOption(
                    org.wso2.carbon.core.services.authentication.xsd.RememberMeData result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginWithRememberMeOption operation
           */
            public void receiveErrorloginWithRememberMeOption(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPriority method
            * override this method for handling normal response from getPriority operation
            */
           public void receiveResultgetPriority(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPriority operation
           */
            public void receiveErrorgetPriority(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isDisabled method
            * override this method for handling normal response from isDisabled operation
            */
           public void receiveResultisDisabled(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isDisabled operation
           */
            public void receiveErrorisDisabled(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loginWithRememberMeCookie method
            * override this method for handling normal response from loginWithRememberMeCookie operation
            */
           public void receiveResultloginWithRememberMeCookie(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginWithRememberMeCookie operation
           */
            public void receiveErrorloginWithRememberMeCookie(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAuthenticatorName method
            * override this method for handling normal response from getAuthenticatorName operation
            */
           public void receiveResultgetAuthenticatorName(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAuthenticatorName operation
           */
            public void receiveErrorgetAuthenticatorName(java.lang.Exception e) {
            }
                


    }
    