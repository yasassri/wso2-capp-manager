
/**
 * LoginWithRememberMeOptionAuthenticationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.stub;

public class LoginWithRememberMeOptionAuthenticationExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1665115556587L;
    
    private org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionAuthenticationException faultMessage;

    
        public LoginWithRememberMeOptionAuthenticationExceptionException() {
            super("LoginWithRememberMeOptionAuthenticationExceptionException");
        }

        public LoginWithRememberMeOptionAuthenticationExceptionException(java.lang.String s) {
           super(s);
        }

        public LoginWithRememberMeOptionAuthenticationExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoginWithRememberMeOptionAuthenticationExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionAuthenticationException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionAuthenticationException getFaultMessage(){
       return faultMessage;
    }
}
    