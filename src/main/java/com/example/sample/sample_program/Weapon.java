package com.example.sample.sample_program;

/**
 * 武器のクラス
 */
public class Weapon extends Item {
  public Weapon(String name, int value) {
    super(name, value);
  }

  @Override
  public void use() {
    System.out.println(this.getName() + "で攻撃！！");
    System.out.println("敵に" + this.getValue() + "のダメージ!!");
  }
}
