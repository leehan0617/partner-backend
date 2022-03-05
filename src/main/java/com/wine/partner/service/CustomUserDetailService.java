package com.wine.partner.service;

import com.wine.partner.model.entity.Member;
import com.wine.partner.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) {
        memberRepository.findByUserId(userId);
        Member member = memberRepository.findByUserId(userId)
                .orElseThrow(() -> {
                    log.info("not found userid error");
                    return new UsernameNotFoundException("Not Found UserId");
                });
        return makeUser(member);
    }

    private User makeUser(Member member) {
        List<GrantedAuthority> grantedAuthorityList = member.getAuthorities()
                .stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRole()))
                .collect(Collectors.toList());
        return new User(member.getUserId(), member.getPassword(), grantedAuthorityList);
    }
}
