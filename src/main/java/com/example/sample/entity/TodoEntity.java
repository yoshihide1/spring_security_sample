package com.example.sample.entity;

import java.time.LocalDate;

import lombok.Data;

/**
 * DB用
 */
@Data
public class TodoEntity {
  private int id;
  private String memo;
  private LocalDate createDatetime;// 作成日
  private LocalDate endDatetime;// 期限
  private LocalDate finishDatetime;// 完了日
  private int isDone;
}
