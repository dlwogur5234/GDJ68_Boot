package com.winter.app.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;

@Repository //써도되고 안써도 됨
@Mapper // 꼭 써야함 
public interface NoticeDAO extends BoardDAO{

}
