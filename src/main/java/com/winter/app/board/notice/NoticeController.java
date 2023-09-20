package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardVO;
import com.winter.app.commons.Pager;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/notice/*")
@Slf4j
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//ModelAndView,void , String
	@GetMapping("list")
	public String getList(Pager pager,Model model) throws Exception{
		
		  List<BoardVO> ar = noticeService.getList(pager); 
		  model.addAttribute("list",ar);
		 
		//error , WARN, INFO , DEBUG , TRACE
		
		return "board/list";
	}
	@GetMapping("add")
	public String add() throws Exception{
		return "board/add";
	}
	@PostMapping("add")
	public String add(NoticeVO noticeVO) throws Exception{
		log.info("NoticeVO : {}",noticeVO );
		int result = noticeService.add(noticeVO);
		return "redirect:./list";
	}
	@GetMapping("detail")
	public String getDetail(NoticeVO noticeVO,Model model) throws Exception{
		BoardVO boardVO = noticeService.getDetail(noticeVO);
		model.addAttribute("noti", boardVO);
		return "board/detail";
	}
	@GetMapping("update")
	public String setUpdate() throws Exception{
		return "board/update";
	}

}
