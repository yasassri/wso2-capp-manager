
/**
 * ApplicationAdminExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:02:53 UTC)
 */

package org.wso2.carbon.stub;

public class ApplicationAdminExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1665285361903L;
    
    private org.wso2.carbon.application.mgt.stub.ApplicationAdminException faultMessage;

    
        public ApplicationAdminExceptionException() {
            super("ApplicationAdminExceptionException");
        }

        public ApplicationAdminExceptionException(java.lang.String s) {
           super(s);
        }

        public ApplicationAdminExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ApplicationAdminExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.application.mgt.stub.ApplicationAdminException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.application.mgt.stub.ApplicationAdminException getFaultMessage(){
       return faultMessage;
    }
}
    