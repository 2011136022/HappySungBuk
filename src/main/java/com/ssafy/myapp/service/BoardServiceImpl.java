package com.ssafy.myapp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.myapp.dto.Board;
import com.ssafy.myapp.repo.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	@Transactional
	public List<Board> searchAll(Board board) throws SQLException {
		return boardDao.searchAll(board);

	}

	@Override
	public Board boardDetail(int no) {
		return boardDao.boardDeatil(no);
	}

	@Override
	public void updates(Board board) {
		boardDao.updates(board);
	}

	@Override
	public void create(Board board) {
		boardDao.create(board);

	}

	@Override
	public int countArticle() {
		return boardDao.countArticle();
	}

	@Override
	public void deleted(int no) {
		boardDao.deleted(no);
	}

}
