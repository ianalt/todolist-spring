package br.com.ianalt.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  

  private String title;
  private String description;
  private LocalDateTime createdAt;
  private LocalDateTime finishedAt;
}
