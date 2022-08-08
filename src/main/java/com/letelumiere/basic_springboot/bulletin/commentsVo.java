package com.letelumiere.basic_springboot.bulletin;

import java.time.LocalDate;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class commentsVo {
    private String id;
	private String title;
	private String contents;
	private String user;
	private String password;
	private LocalDate time_created;
}
