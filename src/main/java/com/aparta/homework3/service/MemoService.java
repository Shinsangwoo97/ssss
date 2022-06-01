package com.aparta.homework3.service;

import com.aparta.homework3.domain.Memo;
import com.aparta.homework3.repository.MemoRepository;
import com.aparta.homework3.dto.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public Long update (Long memoId, MemoRequestDto requestDto){
        Memo memo = memoRepository.findById(memoId).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지않습니다.")
        );
        memo.update(requestDto);
        return memoId;
    }
}
