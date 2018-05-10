package com.ymmihw.java.patterns.service.locator;

/**
 * Created by Gebruiker on 4/20/2018.
 */
public class EmailService implements MessagingService {

  @Override
  public String getMessageBody() {
    return "email message";
  }

  @Override
  public String getServiceName() {
    return "EmailService";
  }
}
