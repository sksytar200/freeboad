package com.project.capastone.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Entity //테이블을 의미
public class  BoardEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, nullable = false, name = "title")
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false, name="content")
    private String content;

    @Builder
    public BoardEntity(Integer id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
}
