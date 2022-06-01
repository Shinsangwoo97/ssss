package com.aparta.homework3.controller;

import com.aparta.homework3.domain.Memo;
import com.aparta.homework3.repository.MemoRepository;
import com.aparta.homework3.dto.MemoRequestDto;
import com.aparta.homework3.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {
    private  final MemoRepository memoRepository;
    private  final MemoService memoService;

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }

    @GetMapping("/api/memos")
    public List<Memo> readMemo() {
        LocalDateTime start = LocalDateTime.now().minusDays(1);
        LocalDateTime end = LocalDateTime.now();
        return memoRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(start, end);
    }

    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long memoId, @RequestBody MemoRequestDto requestDto) {
        memoService.update(memoId,requestDto);
        return memoId;
    }

    @DeleteMapping("/api/memos/{memoId}")
    public Long deleteMemo(@PathVariable Long memoId) {
        memoRepository.deleteById(memoId);
        return memoId;
    }

    @GetMapping("/api/memos/{memoId}")
    public String checkMemo(@PathVariable Long memoId) {
        Memo memo = memoRepository.findById(memoId).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지않습니다.")
        );
        return memo.getPassword();
    }
}
