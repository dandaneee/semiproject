package edu.spring.boardproject;

import java.util.List;

public interface BDBoardService {
		
		public List<BDBoardVO> selectList(); //게시글 목록
		public BDBoardVO selectOne(int bd_no);// 게시글 조회
		public int insert(BDBoardVO vo); //게시글 작성
		public int update(BDBoardVO vo); //게시글 수정
		public int delete(int bd_no); //게시글 삭제
}
