package com.letelumiere.basic_springboot.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.modelmapper.ModelMapper;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor 
@Entity(name = "bulletin")
public class Bulletin {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String title;

    @Column(nullable = true)
    private String user;

    @Column(nullable = true)
    private String contents;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private int views;

    @CreationTimestamp
    @Column(nullable = true)
    private LocalDate created_time;

    @UpdateTimestamp
    @Column(nullable = true)
    private LocalDate modified_time;

    @UpdateTimestamp
    @Column(nullable = true)
    private LocalDate deleted_time;
}
