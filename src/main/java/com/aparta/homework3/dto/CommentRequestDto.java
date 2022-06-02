package com.aparta.homework3.dto;


import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class CommentRequestDto {

    private String content;

    public CommentRequestDto(String content) {this.content = content;}
}
