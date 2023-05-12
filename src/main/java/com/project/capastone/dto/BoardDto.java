package com.project.capastone.dto;

import com.project.capastone.domain.entity.BoardEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Integer id;
    private String title;
    private String content;

    public BoardEntity toEntity(){
        BoardEntity write = BoardEntity.builder()
                .id(id)
                .title(title)
                .content(content)
                .build();
        return write;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Builder
    public BoardDto(Integer id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
}
