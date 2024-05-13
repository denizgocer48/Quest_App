package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="comment")
@Data
public class Comment {
    @Id
    long id;
    long postId;
    long userId;
    @Lob
    @Column(columnDefinition = "text")
    String text;
}
