package com.aparta.homework3.service;

import com.aparta.homework3.domain.Memo;
import com.aparta.homework3.domain.MemoRepository;
import com.aparta.homework3.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public Long update (Long id, MemoRequestDto requestDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지않습니다.")
        );
        memo.update(requestDto);
        return id;
    }
}
