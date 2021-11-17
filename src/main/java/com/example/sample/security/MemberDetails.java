package com.example.sample.security;

import java.util.Collection;

import com.example.sample.entity.MemberEntity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class MemberDetails implements UserDetails {

  private MemberEntity member;

  public MemberDetails(MemberEntity member) {
    this.member = member;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return AuthorityUtils.createAuthorityList(member.getRole().split(","));
  }

  @Override
  public String getPassword() {
    return member.getPassword();
  }

  @Override
  public String getUsername() {
    return member.getName();
  }

  @Override
  // アカウントが有効期限内であるか
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  // アカウントがロックされていないか
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  // 資格情報が有効期限内であるか
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  // 有効なアカウントであるか
  public boolean isEnabled() {
    return true;
  }

}