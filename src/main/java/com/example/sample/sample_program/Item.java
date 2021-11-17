package com.example.sample.sample_program;

import lombok.Data;

@Data
public abstract class Item {

  private String name;
  private int value;

  public Item(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public void use() {
  }
}
