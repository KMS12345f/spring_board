package org.bbs.service;

import java.util.List;

import org.bbs.mapper.User_mMapper;
import org.bbs.model.User_mDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_mServiceImpl implements User_mService {
	
	@Autowired
	private User_mMapper mapper;

	@Override
	public void insert(User_mDTO dto) {
		
		mapper.mInsert(dto);
	}

	@Override
	public List<User_mDTO> list_all() {
		return mapper.list_all();
	}

	@Override
	public User_mDTO oneview(String mno) {
		return mapper.list_oneView(mno);
	}

	@Override
	public void mDelete(String mno) {
		
		mapper.mDelete(mno);
	}

	@Override
	public void mUpdate(User_mDTO dto) {
		
		mapper.mUpdate(dto);
	}
	
	
	
}
