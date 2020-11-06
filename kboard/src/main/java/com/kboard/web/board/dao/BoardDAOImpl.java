package com.kboard.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kboard.web.board.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return sqlSession.selectList("com.kboard.web.board.boardMapper.getBoardList");
	}
	
	@Override
	public BoardVO getBoardContent(int num) throws Exception {
		return sqlSession.selectOne("com.kboard.web.board.boardMapper.getBoardContent", num);
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {

		return sqlSession.insert("com.freehoon.web.board.boardMapper.insertBoard", boardVO);

	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {

		return sqlSession.update("com.freehoon.web.board.boardMapper.updateBoard", boardVO);

	}

	@Override
	public int deleteBoard(int num) throws Exception {

		return sqlSession.insert("com.freehoon.web.board.boardMapper.deleteBoard", num);

	}

	@Override
	public int updateHit(int num) throws Exception {

		return sqlSession.update("com.freehoon.web.board.boardMapper.updateViewCnt", num);

	}

}
