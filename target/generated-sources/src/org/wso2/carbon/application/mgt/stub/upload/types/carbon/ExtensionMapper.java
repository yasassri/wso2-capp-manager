
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:03:02 UTC)
 */

        
            package org.wso2.carbon.application.mgt.stub.upload.types.carbon;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://upload.application.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UploadedFileItem".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.upload.types.carbon.UploadedFileItem.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    