package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@RestController
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @RequestMapping (path ="/members", method = RequestMethod.GET)
    public List <Member> getAllMembers (){
        return memberService.getAllMembers();}
    @RequestMapping (value ="/member/{id}", method = RequestMethod.GET)
    public Member getMemberById(@PathVariable ("id") long id){
        return memberService.getMemberById(id);}
    }

