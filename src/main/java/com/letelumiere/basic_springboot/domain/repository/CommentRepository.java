package com.letelumiere.basic_springboot.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letelumiere.basic_springboot.domain.model.Comments;



@Repository
public interface CommentRepository extends JpaRepository<Comments, Long>{

}
    

