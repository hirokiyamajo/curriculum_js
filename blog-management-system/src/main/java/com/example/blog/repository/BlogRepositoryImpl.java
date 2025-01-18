package com.example.blog.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.blog.entity.Blog;

@Repository
public abstract class BlogRepositoryImpl implements BlogRepository{

    public List<Blog> findALL(){
        
       List<Blog> blogs = new ArrayList<>();
        
       String sql = "SELECT blog_id, title, content, created_at, updated_at, deleted_at " +
                    "FROM Blog WHERE deleted_at IS NULL ORDER BY blog_id DESC";
        
        return null;
        
    }
}
