

/**
 * AuthenticationAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:02:53 UTC)
 */

    package org.wso2.carbon.stub;

    /*
     *  AuthenticationAdmin java interface
     */

    public interface AuthenticationAdmin {
          

        /**
          * Auto generated method signature
          * 
                    * @param loginWithRememberMeOption8
                
             * @throws org.wso2.carbon.stub.LoginWithRememberMeOptionAuthenticationExceptionException : 
         */

         
                     public org.wso2.carbon.core.services.authentication.xsd.RememberMeData loginWithRememberMeOption(

                        java.lang.String username9,java.lang.String password10,java.lang.String remoteAddress11)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.stub.LoginWithRememberMeOptionAuthenticationExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param loginWithRememberMeOption8
            
          */
        public void startloginWithRememberMeOption(

            java.lang.String username9,java.lang.String password10,java.lang.String remoteAddress11,

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getPriority14
                
         */

         
                     public int getPriority(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getPriority14
            
          */
        public void startgetPriority(

            

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isDisabled17
                
         */

         
                     public boolean isDisabled(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isDisabled17
            
          */
        public void startisDisabled(

            

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param loginWithRememberMeCookie20
                
         */

         
                     public boolean loginWithRememberMeCookie(

                        java.lang.String cookie21)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param loginWithRememberMeCookie20
            
          */
        public void startloginWithRememberMeCookie(

            java.lang.String cookie21,

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param login24
                
             * @throws org.wso2.carbon.stub.LoginAuthenticationExceptionException : 
         */

         
                     public boolean login(

                        java.lang.String username25,java.lang.String password26,java.lang.String remoteAddress27)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.stub.LoginAuthenticationExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param login24
            
          */
        public void startlogin(

            java.lang.String username25,java.lang.String password26,java.lang.String remoteAddress27,

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.stub.LogoutAuthenticationExceptionException : 
         */
        public void  logout(
         

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.stub.LogoutAuthenticationExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAuthenticatorName31
                
         */

         
                     public java.lang.String getAuthenticatorName(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAuthenticatorName31
            
          */
        public void startgetAuthenticatorName(

            

            final org.wso2.carbon.stub.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    