
/**
 * ApplicationMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */

            
                package org.wso2.carbon.application.mgt.stub.types.carbon;
            

            /**
            *  ApplicationMetadata bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ApplicationMetadata
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ApplicationMetadata
                Namespace URI = http://mgt.application.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AppName
                        */

                        
                                    protected java.lang.String localAppName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppNameTracker = false ;

                           public boolean isAppNameSpecified(){
                               return localAppNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAppName(){
                               return localAppName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AppName
                               */
                               public void setAppName(java.lang.String param){
                            localAppNameTracker = true;
                                   
                                            this.localAppName=param;
                                    

                               }
                            

                        /**
                        * field for AppVersion
                        */

                        
                                    protected java.lang.String localAppVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppVersionTracker = false ;

                           public boolean isAppVersionSpecified(){
                               return localAppVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAppVersion(){
                               return localAppVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AppVersion
                               */
                               public void setAppVersion(java.lang.String param){
                            localAppVersionTracker = true;
                                   
                                            this.localAppVersion=param;
                                    

                               }
                            

                        /**
                        * field for RegistryArtifacts
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[] localRegistryArtifacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryArtifactsTracker = false ;

                           public boolean isRegistryArtifactsSpecified(){
                               return localRegistryArtifactsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[]
                           */
                           public  org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[] getRegistryArtifacts(){
                               return localRegistryArtifacts;
                           }

                           
                        


                               
                              /**
                               * validate the array for RegistryArtifacts
                               */
                              protected void validateRegistryArtifacts(org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RegistryArtifacts
                              */
                              public void setRegistryArtifacts(org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[] param){
                              
                                   validateRegistryArtifacts(param);

                               localRegistryArtifactsTracker = true;
                                      
                                      this.localRegistryArtifacts=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata
                             */
                             public void addRegistryArtifacts(org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata param){
                                   if (localRegistryArtifacts == null){
                                   localRegistryArtifacts = new org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[]{};
                                   }

                            
                                 //update the setting tracker
                                localRegistryArtifactsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegistryArtifacts);
                               list.add(param);
                               this.localRegistryArtifacts =
                             (org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[])list.toArray(
                            new org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[list.size()]);

                             }
                             

                        /**
                        * field for RegistryFilters
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRegistryFilters ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryFiltersTracker = false ;

                           public boolean isRegistryFiltersSpecified(){
                               return localRegistryFiltersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRegistryFilters(){
                               return localRegistryFilters;
                           }

                           
                        


                               
                              /**
                               * validate the array for RegistryFilters
                               */
                              protected void validateRegistryFilters(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RegistryFilters
                              */
                              public void setRegistryFilters(java.lang.String[] param){
                              
                                   validateRegistryFilters(param);

                               localRegistryFiltersTracker = true;
                                      
                                      this.localRegistryFilters=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRegistryFilters(java.lang.String param){
                                   if (localRegistryFilters == null){
                                   localRegistryFilters = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRegistryFiltersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegistryFilters);
                               list.add(param);
                               this.localRegistryFilters =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RegistryHandlers
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRegistryHandlers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryHandlersTracker = false ;

                           public boolean isRegistryHandlersSpecified(){
                               return localRegistryHandlersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRegistryHandlers(){
                               return localRegistryHandlers;
                           }

                           
                        


                               
                              /**
                               * validate the array for RegistryHandlers
                               */
                              protected void validateRegistryHandlers(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RegistryHandlers
                              */
                              public void setRegistryHandlers(java.lang.String[] param){
                              
                                   validateRegistryHandlers(param);

                               localRegistryHandlersTracker = true;
                                      
                                      this.localRegistryHandlers=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRegistryHandlers(java.lang.String param){
                                   if (localRegistryHandlers == null){
                                   localRegistryHandlers = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRegistryHandlersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegistryHandlers);
                               list.add(param);
                               this.localRegistryHandlers =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for ServiceGroups
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[] localServiceGroups ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceGroupsTracker = false ;

                           public boolean isServiceGroupsSpecified(){
                               return localServiceGroupsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[]
                           */
                           public  org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[] getServiceGroups(){
                               return localServiceGroups;
                           }

                           
                        


                               
                              /**
                               * validate the array for ServiceGroups
                               */
                              protected void validateServiceGroups(org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ServiceGroups
                              */
                              public void setServiceGroups(org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[] param){
                              
                                   validateServiceGroups(param);

                               localServiceGroupsTracker = true;
                                      
                                      this.localServiceGroups=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata
                             */
                             public void addServiceGroups(org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata param){
                                   if (localServiceGroups == null){
                                   localServiceGroups = new org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[]{};
                                   }

                            
                                 //update the setting tracker
                                localServiceGroupsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localServiceGroups);
                               list.add(param);
                               this.localServiceGroups =
                             (org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[])list.toArray(
                            new org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://mgt.application.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ApplicationMetadata",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ApplicationMetadata",
                           xmlWriter);
                   }

               
                   }
                if (localAppNameTracker){
                                    namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "appName", xmlWriter);
                             

                                          if (localAppName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAppName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAppVersionTracker){
                                    namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "appVersion", xmlWriter);
                             

                                          if (localAppVersion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAppVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRegistryArtifactsTracker){
                                       if (localRegistryArtifacts!=null){
                                            for (int i = 0;i < localRegistryArtifacts.length;i++){
                                                if (localRegistryArtifacts[i] != null){
                                                 localRegistryArtifacts[i].serialize(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryArtifacts"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "registryArtifacts", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "registryArtifacts", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRegistryFiltersTracker){
                             if (localRegistryFilters!=null) {
                                   namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRegistryFilters.length;i++){
                                        
                                            if (localRegistryFilters[i] != null){
                                        
                                                writeStartElement(null, namespace, "registryFilters", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryFilters[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "registryFilters", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "registryFilters", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localRegistryHandlersTracker){
                             if (localRegistryHandlers!=null) {
                                   namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRegistryHandlers.length;i++){
                                        
                                            if (localRegistryHandlers[i] != null){
                                        
                                                writeStartElement(null, namespace, "registryHandlers", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryHandlers[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "registryHandlers", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "registryHandlers", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localServiceGroupsTracker){
                                       if (localServiceGroups!=null){
                                            for (int i = 0;i < localServiceGroups.length;i++){
                                                if (localServiceGroups[i] != null){
                                                 localServiceGroups[i].serialize(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","serviceGroups"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "serviceGroups", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "serviceGroups", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://mgt.application.carbon.wso2.org/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAppNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                      "appName"));
                                 
                                         elementList.add(localAppName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
                                    } if (localAppVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                      "appVersion"));
                                 
                                         elementList.add(localAppVersion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppVersion));
                                    } if (localRegistryArtifactsTracker){
                             if (localRegistryArtifacts!=null) {
                                 for (int i = 0;i < localRegistryArtifacts.length;i++){

                                    if (localRegistryArtifacts[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "registryArtifacts"));
                                         elementList.add(localRegistryArtifacts[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "registryArtifacts"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "registryArtifacts"));
                                        elementList.add(localRegistryArtifacts);
                                    
                             }

                        } if (localRegistryFiltersTracker){
                            if (localRegistryFilters!=null){
                                  for (int i = 0;i < localRegistryFilters.length;i++){
                                      
                                         if (localRegistryFilters[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryFilters"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryFilters[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryFilters"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryFilters"));
                                    elementList.add(null);
                                
                            }

                        } if (localRegistryHandlersTracker){
                            if (localRegistryHandlers!=null){
                                  for (int i = 0;i < localRegistryHandlers.length;i++){
                                      
                                         if (localRegistryHandlers[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryHandlers"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryHandlers[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryHandlers"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "registryHandlers"));
                                    elementList.add(null);
                                
                            }

                        } if (localServiceGroupsTracker){
                             if (localServiceGroups!=null) {
                                 for (int i = 0;i < localServiceGroups.length;i++){

                                    if (localServiceGroups[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "serviceGroups"));
                                         elementList.add(localServiceGroups[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "serviceGroups"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "serviceGroups"));
                                        elementList.add(localServiceGroups);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ApplicationMetadata parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ApplicationMetadata object =
                new ApplicationMetadata();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ApplicationMetadata".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ApplicationMetadata)org.wso2.carbon.application.mgt.stub.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","appName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAppName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","appVersion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAppVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryArtifacts").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryArtifacts").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRegistryArtifacts((org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.application.mgt.stub.types.carbon.RegistryMetadata.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryFilters").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list4.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list4.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryFilters").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list4.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRegistryFilters((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryHandlers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list5.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list5.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","registryHandlers").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list5.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRegistryHandlers((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","serviceGroups").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","serviceGroups").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setServiceGroups((org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.application.mgt.stub.types.carbon.ServiceGroupMetadata.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    