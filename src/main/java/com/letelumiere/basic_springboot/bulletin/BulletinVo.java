package com.letelumiere.basic_springboot.bulletin;

import java.time.LocalDate;

import lombok.AllArgsConstructor;

//    VO(Value Object)는 값 그 자체를 표현하는 객체이다.
//로직을 포함할 수 있으며, 객체의 불변성(객체의 정보가 변경하지 않음)을 보장한다.

public class BulletinVo {
    private Long id;
    private String title;
    private String user;
    private String contents;
    private String password;
    private int views;
    private LocalDate created_time;
    private LocalDate modified_time;
    private LocalDate deleted_time;

    public BulletinVo(Long id, String title, String user, String contents, String password, int views,
            LocalDate created_time, LocalDate modified_time, LocalDate deleted_time) {
        this.id = id;
        this.title = title;
        this.user = user;
        this.contents = contents;
        this.password = password;
        this.views = views;
        this.created_time = created_time;
        this.modified_time = modified_time;
        this.deleted_time = deleted_time;
    }

    public static BulletinVo of(Long id, String title, String user, String contents, String password, int views,
            LocalDate created_time, LocalDate modified_time, LocalDate deleted_time) {

        return new BulletinVo(id, title, user, contents, password, views, created_time, modified_time, deleted_time);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
