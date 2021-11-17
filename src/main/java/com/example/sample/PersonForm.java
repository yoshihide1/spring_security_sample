package com.example.sample;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonForm {
  @NotNull
  @Size(min = 1, max = 10)
  private String firstName;

  @NotNull
  @Size(min = 1, max = 10)
  private String lastName;

  @NotNull
  @Max(3)
  @Min(1)
  private int age;

  public String getLastName() {
    return this.lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }
}
