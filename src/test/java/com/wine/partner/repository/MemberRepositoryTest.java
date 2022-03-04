package com.wine.partner.repository;

import com.wine.partner.model.entity.Authority;
import com.wine.partner.model.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@SpringBootTest(
        properties = {"spring.config.location=classpath:application-test.yml"}
)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private AuthorityRepository authorityRepository;

    @Test
    public void addMemberTest() {
        Member member = new Member();
        member.setUserId("user2");
        member.setPassword("user_passwor2");
        member.setRegDt(new Date());
        memberRepository.save(member);
    }

    @Test
    public void addMemberWithAuthorityTest() {
        Member member = new Member();
        member.setUserId("user3");
        member.setPassword("pass3");
        member.setRegDt(new Date());
        memberRepository.save(member);
        Authority authority = new Authority();
        authority.setMember(member);
        authority.setRole("ROLE_USER");
        authorityRepository.save(authority);
    }
}