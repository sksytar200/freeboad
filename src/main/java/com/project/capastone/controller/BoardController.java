package com.project.capastone.controller;

import com.project.capastone.dto.BoardDto;
import com.project.capastone.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController{
    private BoardService boardService;
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String list(){
        return "/index.html";
    }
//    public String list(Model model) {
//       List<BoardDto> boardDtoList = boardService.getBoardList();
//        model.addAttribute("postList",boardDtoList);
//        //return "static/capstone0.4/08.free_board.html";
//        return "static/capstone0.4/free_board_th.html";
//    }

    @GetMapping("/writepost")
    public String write() {
        return "/write.html";
    }

    @PostMapping("/writepost")
    public String write(BoardDto boardDto) {
        System.out.println(boardDto.getId());
        System.out.println(boardDto.getTitle());
        System.out.println(boardDto.getContent());
        boardService.savePost(boardDto);
        return "redirect:/";
    }
}