package com.example.blog.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Blog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blog_id;
    
    private String title;
    
    private String content;
    
    private LocalDateTime created_DateTime;
    
    private LocalDateTime updated_DateTime;
    
    private String deleted_Datetime;
        
}
