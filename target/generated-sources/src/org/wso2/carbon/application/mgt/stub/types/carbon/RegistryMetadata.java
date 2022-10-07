
/**
 * RegistryMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */

            
                package org.wso2.carbon.application.mgt.stub.types.carbon;
            

            /**
            *  RegistryMetadata bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RegistryMetadata
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RegistryMetadata
                Namespace URI = http://mgt.application.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ArtifactName
                        */

                        
                                    protected java.lang.String localArtifactName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArtifactNameTracker = false ;

                           public boolean isArtifactNameSpecified(){
                               return localArtifactNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getArtifactName(){
                               return localArtifactName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArtifactName
                               */
                               public void setArtifactName(java.lang.String param){
                            localArtifactNameTracker = true;
                                   
                                            this.localArtifactName=param;
                                    

                               }
                            

                        /**
                        * field for Associations
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.application.mgt.stub.types.carbon.Association[] localAssociations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssociationsTracker = false ;

                           public boolean isAssociationsSpecified(){
                               return localAssociationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.application.mgt.stub.types.carbon.Association[]
                           */
                           public  org.wso2.carbon.application.mgt.stub.types.carbon.Association[] getAssociations(){
                               return localAssociations;
                           }

                           
                        


                               
                              /**
                               * validate the array for Associations
                               */
                              protected void validateAssociations(org.wso2.carbon.application.mgt.stub.types.carbon.Association[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Associations
                              */
                              public void setAssociations(org.wso2.carbon.application.mgt.stub.types.carbon.Association[] param){
                              
                                   validateAssociations(param);

                               localAssociationsTracker = true;
                                      
                                      this.localAssociations=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.application.mgt.stub.types.carbon.Association
                             */
                             public void addAssociations(org.wso2.carbon.application.mgt.stub.types.carbon.Association param){
                                   if (localAssociations == null){
                                   localAssociations = new org.wso2.carbon.application.mgt.stub.types.carbon.Association[]{};
                                   }

                            
                                 //update the setting tracker
                                localAssociationsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAssociations);
                               list.add(param);
                               this.localAssociations =
                             (org.wso2.carbon.application.mgt.stub.types.carbon.Association[])list.toArray(
                            new org.wso2.carbon.application.mgt.stub.types.carbon.Association[list.size()]);

                             }
                             

                        /**
                        * field for Collections
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localCollections ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCollectionsTracker = false ;

                           public boolean isCollectionsSpecified(){
                               return localCollectionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getCollections(){
                               return localCollections;
                           }

                           
                        


                               
                              /**
                               * validate the array for Collections
                               */
                              protected void validateCollections(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Collections
                              */
                              public void setCollections(java.lang.String[] param){
                              
                                   validateCollections(param);

                               localCollectionsTracker = true;
                                      
                                      this.localCollections=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addCollections(java.lang.String param){
                                   if (localCollections == null){
                                   localCollections = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localCollectionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCollections);
                               list.add(param);
                               this.localCollections =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Resources
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localResources ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourcesTracker = false ;

                           public boolean isResourcesSpecified(){
                               return localResourcesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getResources(){
                               return localResources;
                           }

                           
                        


                               
                              /**
                               * validate the array for Resources
                               */
                              protected void validateResources(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Resources
                              */
                              public void setResources(java.lang.String[] param){
                              
                                   validateResources(param);

                               localResourcesTracker = true;
                                      
                                      this.localResources=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addResources(java.lang.String param){
                                   if (localResources == null){
                                   localResources = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localResourcesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localResources);
                               list.add(param);
                               this.localResources =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Dumps
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localDumps ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDumpsTracker = false ;

                           public boolean isDumpsSpecified(){
                               return localDumpsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getDumps(){
                               return localDumps;
                           }

                           
                        


                               
                              /**
                               * validate the array for Dumps
                               */
                              protected void validateDumps(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Dumps
                              */
                              public void setDumps(java.lang.String[] param){
                              
                                   validateDumps(param);

                               localDumpsTracker = true;
                                      
                                      this.localDumps=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addDumps(java.lang.String param){
                                   if (localDumps == null){
                                   localDumps = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localDumpsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDumps);
                               list.add(param);
                               this.localDumps =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                           namespacePrefix+":RegistryMetadata",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RegistryMetadata",
                           xmlWriter);
                   }

               
                   }
                if (localArtifactNameTracker){
                                    namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "artifactName", xmlWriter);
                             

                                          if (localArtifactName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localArtifactName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAssociationsTracker){
                                       if (localAssociations!=null){
                                            for (int i = 0;i < localAssociations.length;i++){
                                                if (localAssociations[i] != null){
                                                 localAssociations[i].serialize(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","associations"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "associations", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "associations", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCollectionsTracker){
                             if (localCollections!=null) {
                                   namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localCollections.length;i++){
                                        
                                            if (localCollections[i] != null){
                                        
                                                writeStartElement(null, namespace, "collections", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollections[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "collections", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "collections", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localResourcesTracker){
                             if (localResources!=null) {
                                   namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localResources.length;i++){
                                        
                                            if (localResources[i] != null){
                                        
                                                writeStartElement(null, namespace, "resources", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResources[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "resources", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "resources", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localDumpsTracker){
                             if (localDumps!=null) {
                                   namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localDumps.length;i++){
                                        
                                            if (localDumps[i] != null){
                                        
                                                writeStartElement(null, namespace, "dumps", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDumps[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "dumps", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.application.carbon.wso2.org/xsd", "dumps", xmlWriter);

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

                 if (localArtifactNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                      "artifactName"));
                                 
                                         elementList.add(localArtifactName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArtifactName));
                                    } if (localAssociationsTracker){
                             if (localAssociations!=null) {
                                 for (int i = 0;i < localAssociations.length;i++){

                                    if (localAssociations[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "associations"));
                                         elementList.add(localAssociations[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "associations"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                          "associations"));
                                        elementList.add(localAssociations);
                                    
                             }

                        } if (localCollectionsTracker){
                            if (localCollections!=null){
                                  for (int i = 0;i < localCollections.length;i++){
                                      
                                         if (localCollections[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "collections"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollections[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "collections"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "collections"));
                                    elementList.add(null);
                                
                            }

                        } if (localResourcesTracker){
                            if (localResources!=null){
                                  for (int i = 0;i < localResources.length;i++){
                                      
                                         if (localResources[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "resources"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResources[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "resources"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "resources"));
                                    elementList.add(null);
                                
                            }

                        } if (localDumpsTracker){
                            if (localDumps!=null){
                                  for (int i = 0;i < localDumps.length;i++){
                                      
                                         if (localDumps[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "dumps"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDumps[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "dumps"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd",
                                                                              "dumps"));
                                    elementList.add(null);
                                
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
        public static RegistryMetadata parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RegistryMetadata object =
                new RegistryMetadata();

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
                    
                            if (!"RegistryMetadata".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistryMetadata)org.wso2.carbon.application.mgt.stub.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","artifactName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setArtifactName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","associations").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(org.wso2.carbon.application.mgt.stub.types.carbon.Association.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","associations").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(org.wso2.carbon.application.mgt.stub.types.carbon.Association.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAssociations((org.wso2.carbon.application.mgt.stub.types.carbon.Association[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.application.mgt.stub.types.carbon.Association.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","collections").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list3.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list3.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
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
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","collections").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list3.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setCollections((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","resources").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","resources").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setResources((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","dumps").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://mgt.application.carbon.wso2.org/xsd","dumps").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setDumps((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
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
           
    