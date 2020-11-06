package com.kboard.web.board.dao;

import java.util.List;

import com.kboard.web.board.model.BoardVO;

public interface BoardDAO {
	public List<BoardVO> getBoardList() throws Exception;

	public BoardVO getBoardContent(int num) throws Exception;

	public int insertBoard(BoardVO boardVO) throws Exception;

	public int updateBoard(BoardVO boardVO) throws Exception;

	public int deleteBoard(int num) throws Exception;

	public int updateHit(int num) throws Exception;
}
