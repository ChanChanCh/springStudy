package kr.co.songjava.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.songjava.mvc.domain.Board;

@Repository
public interface BoardRepository {
	
	List<Board> getlist();
	

}
