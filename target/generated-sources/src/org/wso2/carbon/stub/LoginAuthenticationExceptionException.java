
/**
 * LoginAuthenticationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v40  Built on : Nov 05, 2019 (05:02:53 UTC)
 */

package org.wso2.carbon.stub;

public class LoginAuthenticationExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1665464843085L;
    
    private org.wso2.carbon.core.services.authentication.LoginAuthenticationException faultMessage;

    
        public LoginAuthenticationExceptionException() {
            super("LoginAuthenticationExceptionException");
        }

        public LoginAuthenticationExceptionException(java.lang.String s) {
           super(s);
        }

        public LoginAuthenticationExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoginAuthenticationExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.core.services.authentication.LoginAuthenticationException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.core.services.authentication.LoginAuthenticationException getFaultMessage(){
       return faultMessage;
    }
}
    