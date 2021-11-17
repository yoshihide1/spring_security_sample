package com.example.sample.entity.domain;

public class Memo {
  String memo;

  public Memo(String memo) {
    if (memo.length() < 1) {
      throw new IllegalAccessError("空です");
    }
    this.memo = memo;
  }
}
