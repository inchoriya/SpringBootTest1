package com.icia.sbt.service;

import com.icia.sbt.dao.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository mrepo;

}