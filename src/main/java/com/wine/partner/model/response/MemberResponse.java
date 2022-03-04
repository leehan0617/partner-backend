package com.wine.partner.model.response;

import com.wine.partner.model.entity.Authority;
import com.wine.partner.model.entity.Member;
import com.wine.partner.model.entity.MemberDetail;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class MemberResponse {
    private int id;
    private String userId;
    private Set<String> authorities;
    private String name;

    public MemberResponse(Member member, MemberDetail memberDetail, List<Authority> authority) {
        this.id = member.getId();
        this.userId = member.getUserId();
        this.authorities = authority.stream()
                .map(Authority::getRole)
                .collect(Collectors.toSet());
        this.name = memberDetail.getName();
    }
}
