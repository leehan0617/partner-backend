package com.wine.partner.service;

import com.wine.partner.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ContentService {

    private final MemberRepository memberRepository;

    public void getMainContent(String userId) {
        memberRepository.findByUserId(userId)
                .ifPresent(member -> {
                    int id = member.getId();
                });
    }
}
