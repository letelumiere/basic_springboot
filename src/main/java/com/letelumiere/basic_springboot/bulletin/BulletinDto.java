package com.letelumiere.basic_springboot.bulletin;

import java.time.LocalDate;

import lombok.*;
//DTO(Data Transfer Object)로서 계층(Layer)간 데이터 교환을 위해 사용하는 객체이다.
//데이터 교환만을 위해 사용하므로 로직을 갖지 않고, getter/setter 메소드만 갖는다.

@Getter @Setter
public class BulletinDto {
    private Long id;
    private String title;
    private String user;
    private String contents;
    private String password;
    private int views;
    private LocalDate created_time;
    private LocalDate modified_time;
    private LocalDate deleted_time;
}
