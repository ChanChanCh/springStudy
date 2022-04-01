package kr.co.songjava.mvc.domain;

//import java.sql.Date;

import java.util.Date; // ?


import lombok.Data;

@Data
public class Board {
	
	private int boardseg;
	private String title;
	private String contents;
	private Date regDate;

}
