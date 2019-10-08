package org.zerock.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.board.service.BoardService;
import org.zerock.controller.HomeController;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Inject
	private BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model) throws Exception {
		try {
			model.addAttribute("boardList", boardService.getBoardList());	
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
		}
		return "board/index";
	}
	
	
}
