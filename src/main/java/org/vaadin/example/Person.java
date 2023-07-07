package org.vaadin.example;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class Person {
  @NotEmpty
  private String name;
  @Length(min = 3, max = 5)
  private String address;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
}
