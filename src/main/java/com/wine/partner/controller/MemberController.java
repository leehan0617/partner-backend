package com.wine.partner.controller;

import com.wine.partner.model.response.MemberResponse;
import com.wine.partner.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponse> getMember(@PathVariable int id) {
        MemberResponse member = memberService.getMember(id);
        return ResponseEntity.ok(member);
    }
}
