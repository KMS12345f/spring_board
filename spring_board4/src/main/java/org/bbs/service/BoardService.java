package org.bbs.service;

import java.util.List;

import org.bbs.model.BoardDTO;
import org.bbs.page.Criteria;

public interface BoardService {

	public void insert(BoardDTO dto);

	public List<BoardDTO> list_all();
	
	public List<BoardDTO> getListPageing(Criteria cri);
	public int getTotal();

	public void delete(Long bno);

	public BoardDTO oneview(Long bno);

	public void update(BoardDTO dto);

}
