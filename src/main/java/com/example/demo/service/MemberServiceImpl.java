package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@Service ("memberService")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List <Member> getAllMembers(){
        return memberRepository.findAll();
    }
    @Override
    public Member getMemberById(long id){
        return memberRepository.getOne(id);
    }

}