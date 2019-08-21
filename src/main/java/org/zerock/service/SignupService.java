package org.zerock.service;

import org.zerock.domain.AuthVO;
import org.zerock.domain.MemberVO;

public interface SignupService {
	public void signup(MemberVO member);
	
	public void signupAuth(AuthVO auth);

}
