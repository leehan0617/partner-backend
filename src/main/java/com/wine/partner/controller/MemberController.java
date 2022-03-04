package com.wine.partner.controller;

import com.wine.partner.model.entity.Member;
import com.wine.partner.model.entity.MemberDetail;
import com.wine.partner.model.request.MemberRequest;
import com.wine.partner.model.response.MemberResponse;
import com.wine.partner.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberResponse> signUp(@RequestBody MemberRequest memberRequest) {
        Member member = memberRequest.getMember();
        MemberDetail memberDetail = memberRequest.getMemberDetail();
        MemberResponse response = memberService.createMember(member, memberDetail);
        return ResponseEntity.ok(response);
    }
}
