package edu.spring.boardproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BDBoardServiceImpl implements BDBoardService {

	@Autowired
	BDBoardDAO dao;
	
	@Override
	public List<BDBoardVO> selectList() {
		return dao.selectList() ;
	}

	@Override
	public BDBoardVO selectOne(int bd_no) {
		return dao.selectOne(bd_no);
	}

	@Override
	public int insert(BDBoardVO vo) {

		return dao.insert(vo);
	}

	@Override
	public int update(BDBoardVO vo) {

		return dao.update(vo);
	}

	@Override
	public int delete(int bd_no) {

		return dao.delete(bd_no);
	}

}
