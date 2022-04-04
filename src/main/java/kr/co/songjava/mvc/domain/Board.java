package kr.co.songjava.mvc.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Board {
	
	private int boardSeq;
	private String title;
	private String contents;
	private Date regDate;

}
