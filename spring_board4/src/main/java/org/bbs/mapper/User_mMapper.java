package org.bbs.mapper;

import java.util.List;

import org.bbs.model.User_mDTO;

public interface User_mMapper {

	public void mInsert(User_mDTO dto);

	public List<User_mDTO> list_all();

	public User_mDTO list_oneView(String mno);

	public void mDelete(String mno);

	public void mUpdate(User_mDTO dto);

}
