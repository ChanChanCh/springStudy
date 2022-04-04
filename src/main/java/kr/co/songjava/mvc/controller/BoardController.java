<<<<<<< HEAD
package kr.co.songjava.mvc.repository;
=======
package kr.co.songjava.mvc.controller;
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.songjava.mvc.domain.Board;
=======
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.repository.BoardRepository;
import kr.co.songjava.mvc.service.BoardService;

/*
 * 게시판 컨트롤러
 * @author Root
 */
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/*
	 * 목록 리턴
	 * @return
	 */
<<<<<<< HEAD
=======
	@GetMapping
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883
	public List<Board> getList() {
		return boardService.getList();
	}

	/*
	 * 상세 정보 리턴
	 * @param boardSeq
	 * @return
	 */
<<<<<<< HEAD
	
	public Board get(int boardSeq) {
=======
	@GetMapping("/{boardSeq}")
	public Board get(@PathVariable int boardSeq) {
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883
		return boardService.get(boardSeq);
	}

	/*
<<<<<<< HEAD
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
	
=======
	 * 등록 / 수정 처리.
	 * @param board
	 */
	@GetMapping ("/save") // 실무에서는 수정 등록 처리하는곳에선 GetMapping을 사용하지 않는다
	public void save(Board board) {
		boardService.save(board);
	}
		
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883
	/*
	 * 삭제 처리
	 * @param boardSeq
	 */
<<<<<<< HEAD
	public void delete(int boardSeq) {
		boardService.delete(boardSeq);
	}
	
}

=======
	@GetMapping ("/delete/{boardSeq}")
	public void delete(@PathVariable int boardSeq) {
		boardService.delete(boardSeq);
	}
	
}
>>>>>>> e9555eb7fe9b95a8dff258defaf7bb8ba7560883
