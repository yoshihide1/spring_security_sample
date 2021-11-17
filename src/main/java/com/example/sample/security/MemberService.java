package com.example.sample.security;

import com.example.sample.repository.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements UserDetailsService {

  @Autowired
  private MemberMapper mapper;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    var member = mapper.findById(username).orElseGet(() -> {
      throw new UsernameNotFoundException(username + "not found");
    });
    return new MemberDetails(member);
  }

}
