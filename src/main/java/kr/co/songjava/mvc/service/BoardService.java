package kr.co.songjava.mvc.service;

import kr.co.songjava.mvc.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/*
 * 게시판 서비스
 * @author Root
 */


@Slf4j
@Service
public class BoardService {


    /*
     * 목록 리턴
     * @return
     */
    public List<Board> getList() {
        List<Board> boards = new LinkedList<>();
        boards.add(Board.builder().boardSeq(1).contents("내용이여1").title("제목이여1").build());
        boards.add(Board.builder().boardSeq(2).contents("내용이여2").title("제목이여2").build());
        boards.add(Board.builder().boardSeq(3).contents("내용이여3").title("제목이여3").build());
        boards.add(Board.builder().boardSeq(4).contents("내용이여4").title("제목이여4").build());
        boards.add(Board.builder().boardSeq(5).contents("내용이여5").title("제목이여5").build());

        return boards; // return repository.getList();
    }

    /*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     */

    public Board get(int boardSeq) {
        return Board.builder().boardSeq(1).contents("내용이여").title("제목이여").build();
    }

    /*
     * 등록 처리.
     * @param board
     */
    public void save(Board board) {
        log.debug("board={}", board);
//    	repository.save(board);
    }

    /*
     * 업데이트 처리
     * @param board
     */
    public void update(Board board) {
    	// repository.update(board);
    }

    /*
     * 삭제 처리
     * @param boardSeq
     */
    public void delete(int boardSeq) {
        // repository.delete(boardSeq);
    }


}
