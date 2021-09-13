package edu.spring.boardproject;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BDBoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	//게시판 불러오기
	public List<BDBoardVO> selectList(){ 
		List<BDBoardVO> list =new ArrayList<BDBoardVO>();
		list=sqlSession.selectList("board.selectlist"); 
		return list;	
	}
	//게시글 읽기
	public BDBoardVO selectOne(int bd_no) {
		BDBoardVO vo = null;
		vo =sqlSession.selectOne("board.selectOne" , bd_no);
		return vo;
	}
	//게시글 작성
	public int insert(BDBoardVO vo) {
		int ins= 0;
		ins=sqlSession.insert("board.insert", vo);
		return ins;
	}
	//게시글 수정
	public int update(BDBoardVO vo) {
		int up= 0;
		up = sqlSession.update("board.update", vo);
		return up;
	}
	//게시글 삭제 
	public int delete(int bd_no) {
		int del=0;
		del=sqlSession.delete("board.delete" , bd_no);
		return del;
	}
	
	
}
