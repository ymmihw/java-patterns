package com.ymmihw.java.patterns.service.locator;

/**
 * Created by Gebruiker on 4/20/2018.
 */
public class SMSService implements MessagingService {

  @Override
  public String getMessageBody() {
    return "sms message";
  }

  @Override
  public String getServiceName() {
    return "SMSService";
  }
}
