package com.project.capastone.service;

import com.project.capastone.domain.entity.BoardEntity;
import com.project.capastone.dto.BoardDto;
import com.project.capastone.domain.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
//    public BoardService(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
    @Transactional
    public Integer savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
        // public void write(Board board){

        //   boardRepository.save(board);

    }
//    @Transactional
//    public List<BoardDto> getBoardList() {
//        List<BoardEntity> boardList = boardRepository.findAll();
//        List<BoardDto> boardDtoList = new ArrayList<>();
//
//        for(BoardEntity board : boardList) {
//            BoardDto boardDto = BoardDto.builder()
//                    .id(board.getId())
//                    .title(board.getTitle())
//                    .content(board.getContent())
//                    .build();
//            boardDtoList.add(boardDto);
//        }
//        return boardDtoList;
//  }

}
