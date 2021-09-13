package edu.spring.boardproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.spring.boardproject.BDBoardService;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
		BDBoardService service;
	//메인페이지
	@RequestMapping(value = "/" )
	public String Start(Model model) {
		logger.info("START PAGE");
		return "home";
	}
	//게시판이동
	@RequestMapping(value = "/list.do")
		public String main(Model model) {
			logger.info("MAIN PAGE");
			
			model.addAttribute( "list", service.selectList() ); //model에 
			return "main";
	}//list end
	
	//게시글 조회 
	@RequestMapping("/one.do")
	public String one(Model model, int bd_no) {
		logger.info("SELECT ONE");
		
		model.addAttribute("vo" ,service.selectOne(bd_no) );
		return "selectone";
	}//select end
	
	//게시글 작성 화면
	@RequestMapping("/insert.do")
	public String insert() {
		logger.info("INSERT PAGE");
		return "insert";
	}//insert end
	
	//게시글 작성
	@RequestMapping("/bdinsert.do")
	public String insertBoard(BDBoardVO vo) {
		logger.info("INSERT");
		int ins= service.insert(vo);
		
		if(ins>0) { //ins값이 1이면 작성화면으로,  
			return "redirect:list.do";
		} else {
			return "redirect:insert.do";
		}//else end
		
	}//insertbd end
	
	//게시글 수정 화면
	@RequestMapping("/update.do")
	public String update(Model model,int bd_no) {
		logger.info("UPDATE PAGE");
		model.addAttribute("vo", service.selectOne(bd_no));
		return "update";
	}//update end
	
	//게시글 수정
	@RequestMapping("/bdupdate.do")
	public String updateBoard(BDBoardVO vo) {
		logger.info("UPDATE");
		int up=service.update(vo);
		
		if(up>0) {
			return "redirect:one.do?bd_no=" + vo.getBd_no();
		} else {
			return "redirect:update.do?bd_no="+vo.getBd_no() ;
		}//else end
	}//updatebd end
	
	//게시글 삭제 
	@RequestMapping("/delete.do")
	public String delect(int bd_no) {
		logger.info("DELETE");
		int del=service.delete(bd_no);
		
		if(del>0) {
			return "redirect:list.do";
		} else {
			return "redirect:one.do?bd_no="+bd_no ;
		}//else end
	}

}
