package com.aparta.homework3.dto;

import lombok.Getter;

@Getter
public class CommentResponseDto {

    private Long commentId;

    private String commentwriter, content;

//    public CommentRequestDto(Comment commentId) {
//        this.commentId = comment.getCommentId();
//        this.commentwriter = comment.getUser().getUsername();
//        this.content = comment.getContent();
//
//    }
}
