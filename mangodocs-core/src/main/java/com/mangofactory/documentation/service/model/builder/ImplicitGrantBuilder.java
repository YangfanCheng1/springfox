package com.mangofactory.documentation.service.model.builder;

import com.mangofactory.documentation.service.model.LoginEndpoint;
import com.mangofactory.documentation.service.model.ImplicitGrant;

import static com.mangofactory.documentation.service.model.builder.BuilderDefaults.*;

public class ImplicitGrantBuilder {
  private LoginEndpoint loginEndpoint;
  private String tokenName;

  public ImplicitGrantBuilder loginEndpoint(LoginEndpoint loginEndpoint) {
    this.loginEndpoint = defaultIfAbsent(loginEndpoint, this.loginEndpoint);
    return this;
  }

  public ImplicitGrantBuilder tokenName(String tokenName) {
    this.tokenName = defaultIfAbsent(tokenName, this.tokenName);
    return this;
  }

  public ImplicitGrant build() {
    return new ImplicitGrant(loginEndpoint, tokenName);
  }
}