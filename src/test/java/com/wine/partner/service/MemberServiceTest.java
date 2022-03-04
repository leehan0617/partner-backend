package com.wine.partner.service;

import com.wine.partner.model.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest(
        properties = {"spring.config.location=classpath:application-test.yml"}
)
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @Test
    public void getMember() {
        int id = 3;
        memberService.getMember(id);
    }

    @Test
    public void createMemberTest() {
        Member member = new Member();
        member.setUserId("userIdtest");
        member.setPassword("userPassword");
        member.setRegDt(new Date());
    }
}