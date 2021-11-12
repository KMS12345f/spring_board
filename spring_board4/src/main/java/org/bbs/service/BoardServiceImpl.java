package org.bbs.service;

import java.util.List;

import org.bbs.mapper.BoardMapper;
import org.bbs.model.BoardDTO;
import org.bbs.page.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void insert(BoardDTO dto) {
		
		mapper.insert(dto);
	}
	
	@Override
	public List<BoardDTO> list_all(){
		return mapper.list_all();
	}

	@Override
	public void delete(Long bno) {
		
		mapper.delete(bno);	
	}

	@Override
	public BoardDTO oneview(Long bno) {
		
		return mapper.list_oneView(bno);
	}

	@Override
	public void update(BoardDTO dto) {
		
		mapper.update(dto);
	}

	@Override
	public List<BoardDTO> getListPageing(Criteria cri) {
		
		return mapper.getListPageing(cri);
	}

	@Override
	public int getTotal() {
		
		return mapper.getTotal();
	}

}
