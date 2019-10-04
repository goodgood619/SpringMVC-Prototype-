package org.zerock.board.service;

import org.zerock.board.model.BoardVO;
import java.util.List;

public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
}
