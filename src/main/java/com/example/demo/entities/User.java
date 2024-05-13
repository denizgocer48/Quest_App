package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="user")
@Entity
public class User {
    @Id
    Long id;
    String name;
    String password;
}
