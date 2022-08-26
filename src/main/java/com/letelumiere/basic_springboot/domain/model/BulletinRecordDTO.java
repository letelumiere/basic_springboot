package com.letelumiere.basic_springboot.domain.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class BulletinRecordDTO {    
    private int views;
    private LocalDate created_time;
    private LocalDate modified_time;
    private LocalDate deleted_time;

    public Bulletin toEntity(){
        return Bulletin.builder().modified_time(modified_time).deleted_time(deleted_time).build();
    }
}
