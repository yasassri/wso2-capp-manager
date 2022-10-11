
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:03:02 UTC)
 */

        
            package org.wso2.carbon.application.mgt.stub;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://mgt.application.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Association".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.types.carbon.Association.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.application.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.application.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ApplicationMetadata".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.types.carbon.ApplicationMetadata.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.application.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceGroupMetadata".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.application.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryMetadata".equals(typeName)){
                   
                            return  org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    