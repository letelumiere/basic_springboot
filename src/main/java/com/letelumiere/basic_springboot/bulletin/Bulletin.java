package com.letelumiere.basic_springboot.bulletin;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


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

    @Column(nullable = true)
    private LocalDate created_time;

    @Column(nullable = true)
    private LocalDate modified_time;

    @Column(nullable = true)
    private LocalDate deleted_time;
}
