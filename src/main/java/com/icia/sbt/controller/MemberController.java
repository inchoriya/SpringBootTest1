package com.icia.sbt.controller;

import com.icia.sbt.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService msvc;

}