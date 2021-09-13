package edu.spring.boardproject;

public interface BDMemberService {
	//로그인
	public BDMemberVO login(BDMemberVO vo) ;
	//가입
	public int insertUser(BDMemberVO vo) ;
}
