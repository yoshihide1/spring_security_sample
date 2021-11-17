package com.example.sample;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptTest {

  private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

  @Test
  void encode() {
    System.out.println(this.encoder.encode("1234"));
  }

}
