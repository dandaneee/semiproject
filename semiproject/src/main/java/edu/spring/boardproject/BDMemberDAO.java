package edu.spring.boardproject;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BDMemberDAO {
	@Autowired
	SqlSession sqlSession;
		
	//로그인
	public BDMemberVO login(BDMemberVO vo) {
		BDMemberVO log = null; //vo타입 log 를 생성 
		log= sqlSession.selectOne("member.login", vo); 
		return log;
	}
	
	//회원가입
	public int insertUser(BDMemberVO vo) {
		int regi = 0;
		regi= sqlSession.insert("member.register", vo);
		return regi;
	}
	
}
