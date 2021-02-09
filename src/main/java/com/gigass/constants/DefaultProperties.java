package com.gigass.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/***
 * baseConfig相关配置参数
 */
@Component
@ConfigurationProperties(prefix = "com.gigass.constants")
public class DefaultProperties {

    public static String myEmailSMTPHost;

    public static String myEmailAccount;

    public static String myEmailPassword;



    @Value("${fast-pickUp-config.my-email-SMTP-host}")
    public void setMyEmailSMTPHost(String myEmailSMTPHost) {
        DefaultProperties.myEmailSMTPHost = myEmailSMTPHost;
    }
    public static String getMyEmailSMTPHost() {
        return myEmailSMTPHost;
    }


    @Value("${fast-pickUp-config.my-email-account}")
    public void setMyEmailAccount(String myEmailAccount) {
        DefaultProperties.myEmailAccount = myEmailAccount;
    }
    public static String getMyEmailAccount() {
        return myEmailAccount;
    }

    @Value("${fast-pickUp-config.my-email-password}")
    public void setMyEmailPassword(String myEmailPassword) {
        DefaultProperties.myEmailPassword = myEmailPassword;
    }
    public static String getMyEmailPassword() {
        return myEmailPassword;
    }

}
