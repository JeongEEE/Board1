package org.zerock.mapper;

import org.zerock.domain.AuthVO;
import org.zerock.domain.MemberVO;

public interface MemberMapper {

	public MemberVO read(String userid);
	
	public void insertUser(MemberVO member);
	
	public void insertUserAuth(AuthVO auth);
	
	
}
