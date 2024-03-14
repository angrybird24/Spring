package com.codehows.service;

import java.util.List;

import com.codehows.domain.BoardVO;

public interface BoardService {
	public void register(BoardVO board);	//글등록
	
	public BoardVO get(Long bno);	//bno 기준 글가져오기
	
	public boolean modify(BoardVO board); // board 객체 안 내용수정
	
	public boolean remove(Long bno);		//삭제
	
	public List<BoardVO> getList();	// 전체내용
}
