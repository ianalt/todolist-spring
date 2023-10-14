package br.com.ianalt.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @Column(length = 50)
  private String title;

  private String description;
  private String priority;
  private LocalDateTime startedAt;
  private LocalDateTime finishedAt;

  private UUID userId;

  public void setTitle(String title) throws Exception {
    if (title.length() > 50) {
      throw new Exception("Title must have 50 characters at maximum");
    }

    this.title = title;
  }
}
