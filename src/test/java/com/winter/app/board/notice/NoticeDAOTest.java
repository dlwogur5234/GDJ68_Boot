package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.List;

import javax.activation.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.BoardVO;
import com.winter.app.board.notice.NoticeDAO;
import com.winter.app.commons.Pager;
@SpringBootTest
class NoticeDAOTest {
	@Autowired
	private NoticeDAO noticeDAO;

	
	//@Test
	void addTest() throws Exception{
		for(int i=0; i<100; i++) {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardTitle("집가자"+i);
		boardVO.setBoardWriter("나"+i);
		boardVO.setBoardContents("집갈시간입니다"+i);
		int result = noticeDAO.add(boardVO);
		if(i%10 == 0) {
			
		
		Thread.sleep(500);
		}
		}
		System.out.println("FInish");
	}
	
	//@Test
	void getListTest() throws Exception{
		Pager pager = new Pager();
		pager.setStartRow(0L);
		pager.setLastRow(10L);
		pager.setKind("1");
		pager.setSearch("20");
		
		List<BoardVO> ar = noticeDAO.getList(pager);
		assertEquals(1, ar.size());
	}
	//@Test
	void getCount() throws Exception{
		Pager pager = new Pager();
		pager.setKind("1");
		pager.setSearch("20");
		
		Long result = noticeDAO.getCount(pager);
		assertEquals(1, result);
	}
	@Test
	void getDetail() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardNo(6L);
		
		BoardVO result = noticeDAO.getDetail(boardVO);
		
		assertNotEquals(0, result);
		
	}
	//@Test
	void setUpdate() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardContents("123");
		boardVO.setBoardTitle("배고파");
		boardVO.setBoardNo(5L);
		
		int result = noticeDAO.setUpdate(boardVO);
		
		assertEquals(1, result);
	}
	//@Test
	void setDelete() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardNo(6L);
		
		int result = noticeDAO.setDelete(boardVO);
		
		assertEquals(1, result);
	}
	
	

}
