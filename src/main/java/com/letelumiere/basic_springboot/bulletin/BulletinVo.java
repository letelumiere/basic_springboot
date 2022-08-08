package com.letelumiere.basic_springboot.bulletin;

import java.time.LocalDate;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
class BulletinVo {
    private String id;
    private String title;
    private String user;
    private String password;
    private String contents;
    private int views;
    private LocalDate created_time;
    
}
