package com.wine.partner.service;

import com.wine.partner.model.entity.Authority;
import com.wine.partner.model.entity.Member;
import com.wine.partner.model.entity.MemberDetail;
import com.wine.partner.model.response.MemberResponse;
import com.wine.partner.repository.AuthorityRepository;
import com.wine.partner.repository.MemberDetailRepository;
import com.wine.partner.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberDetailRepository memberDetailRepository;
    private final AuthorityRepository authorityRepository;

    public MemberResponse createMember(Member member, MemberDetail memberDetail) {
        memberRepository.save(member);
        Authority authority = new Authority();
        authority.setMember(member);
        authority.setRole("ROLE_USER");
        authorityRepository.save(authority);
        member.addAuthority(authority);
        memberDetail.setMemberId(member.getId());
        memberDetailRepository.save(memberDetail);
        return new MemberResponse(member, memberDetail, List.of(authority));
    }

    public MemberResponse getMember(int id) {
        Optional<Member> maybeMember = memberRepository.findById(id);
        // TODO. make custom exception
        Member member = maybeMember.orElseThrow();
        MemberDetail memberDetail = memberDetailRepository.findByMemberId(id);
        List<Authority> authorities = member.getAuthorities();
        return new MemberResponse(member, memberDetail, authorities);
    }
}
