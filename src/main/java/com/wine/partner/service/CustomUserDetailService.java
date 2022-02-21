package com.wine.partner.service;

import com.wine.partner.model.entity.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Member member = new Member();
        return makeUser(userId, member);
    }

    private User makeUser(String userId, Member member) {
        if (!member.isActivate()) {
            // TODO. throw 휴면 에러
            throw new RuntimeException(String.format("휴면 ID 입니다. %s", userId));
        }

        List<GrantedAuthority> grantedAuthorityList = member.getAuthorities()
                .stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());

        return new User(member.getUserId(), member.getPassword(), grantedAuthorityList);
    }
}
