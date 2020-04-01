package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.Manager;
import com.example.demo.vo.MemberVo;

@Repository
public class LoginDao {
	
	public static MemberVo login(MemberVo m) {
		System.out.println("다오 동작");
		return Manager.login(m);
	}
}
