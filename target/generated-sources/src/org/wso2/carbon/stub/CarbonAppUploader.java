

/**
 * CarbonAppUploader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:02:53 UTC)
 */

    package org.wso2.carbon.stub;

    /*
     *  CarbonAppUploader java interface
     */

    public interface CarbonAppUploader {
          

        /**
          * Auto generated method signature
          * 
                    * @param uploadApp1
                
         */

         
                     public void uploadApp(

                        org.wso2.carbon.application.mgt.stub.upload.types.carbon.UploadedFileItem[] fileItems2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param uploadApp1
            
          */
        public void startuploadApp(

            org.wso2.carbon.application.mgt.stub.upload.types.carbon.UploadedFileItem[] fileItems2,

            final org.wso2.carbon.stub.CarbonAppUploaderCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    