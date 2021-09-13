package edu.spring.boardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BDMemberServiceImpl implements BDMemberService {

	@Autowired
	BDMemberDAO dao;
	
	@Override
	public BDMemberVO login(BDMemberVO vo) {
		return dao.login(vo);
	}

	@Override
	public int insertUser(BDMemberVO vo) {
		return dao.insertUser(vo);
	}
	

}
