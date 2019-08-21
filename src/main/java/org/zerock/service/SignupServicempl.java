package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.AuthVO;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class SignupServicempl implements SignupService {
	@Setter(onMethod_= @Autowired)
	private MemberMapper mapper;
	
	@Override
	public void signup(MemberVO member) {
		
		log.info("signup...");
		
		mapper.insertUser(member);
	}
	
	@Override
	public void signupAuth(AuthVO auth)
	{
		log.info("auth insert..");
		mapper.insertUserAuth(auth);
	}
}
