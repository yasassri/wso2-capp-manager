

/**
 * ApplicationAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.stub;

    /*
     *  ApplicationAdmin java interface
     */

    public interface ApplicationAdmin {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.stub.ApplicationAdminExceptionException : 
         */
        public void  deleteApplication(
         java.lang.String appName4

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.stub.ApplicationAdminExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listAllApplications5
                
             * @throws org.wso2.carbon.stub.ApplicationAdminExceptionException : 
         */

         
                     public java.lang.String[] listAllApplications(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.stub.ApplicationAdminExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param listAllApplications5
            
          */
        public void startlistAllApplications(

            

            final org.wso2.carbon.stub.ApplicationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param downloadCappArchive8
                
             * @throws org.wso2.carbon.stub.ApplicationAdminExceptionException : 
         */

         
                     public javax.activation.DataHandler downloadCappArchive(

                        java.lang.String fileName9)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.stub.ApplicationAdminExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param downloadCappArchive8
            
          */
        public void startdownloadCappArchive(

            java.lang.String fileName9,

            final org.wso2.carbon.stub.ApplicationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAppData12
                
             * @throws org.wso2.carbon.stub.ApplicationAdminExceptionException : 
         */

         
                     public org.wso2.carbon.application.mgt.stub.types.carbon.ApplicationMetadata getAppData(

                        java.lang.String appName13)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.stub.ApplicationAdminExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAppData12
            
          */
        public void startgetAppData(

            java.lang.String appName13,

            final org.wso2.carbon.stub.ApplicationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    