package kr.co.songjava.mvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.songjava.mvc.domain.Board;


/*
 * 게시판 Repository
 * @author Root
 */

@Repository
public interface BoardRepository {
	
	//리스트
	List<Board> getList();
	
	//  단건?
	Board get(int boardSeq);
	
	// 등록
	void save(Board board);
	
	// 업데이트
	void update(Board board);
	
	// 삭제
	void delete(int boardSeq);
		
	// 후에 xml과 연결이되 실행이됨
}
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

