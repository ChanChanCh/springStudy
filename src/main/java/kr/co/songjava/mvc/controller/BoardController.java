package kr.co.songjava.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.repository.BoardRepository;
import kr.co.songjava.mvc.service.BoardService;

/*
 * 게시판 컨트롤러
 * @author Root
 */


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/*
	 * 목록 리턴
	 * @return
	 */
	public List<Board> getList() {
		return boardService.getList();
	}

	/*
	 * 상세 정보 리턴
	 * @param boardSeq
	 * @return
	 */
	
	public Board get(int boardSeq) {
		return boardService.get(boardSeq);
	}

	/*
	 * 등록 처리.
	 * @param board
	 */
	public void save(Board board) {
		boardService.save(board);
	}
	
	/*
	 * 업데이트 처리
	 * @param board
	 */
	public void update(Board board) {
		boardService.update(board);
	}
	
	/*
	 * 삭제 처리
	 * @param boardSeq
	 */
	public void delete(int boardSeq) {
		boardService.delete(boardSeq);
	}
	
}