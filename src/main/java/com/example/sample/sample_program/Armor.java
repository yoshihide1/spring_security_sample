package com.example.sample.sample_program;

/**
 * 防具のクラス
 */
public class Armor extends Item {

  public Armor(String name, int value) {
    super(name, value);
  }

  @Override
  public void use() {
    System.out.println(this.getName() + "を身に着けた");
    System.out.println("守備力が" + this.getValue() + "上がった");
  }
}
