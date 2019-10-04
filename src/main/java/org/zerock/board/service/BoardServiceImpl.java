package org.zerock.board.service;

import java.util.List;

import javax.inject.Inject;

import org.zerock.board.dao.BoardDAO;
import org.zerock.board.model.BoardVO;

public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}

}
