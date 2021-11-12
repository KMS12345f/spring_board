package org.bbs.service;

import java.util.List;

import org.bbs.model.User_mDTO;

public interface User_mService {

	public void insert(User_mDTO dto);

	public List<User_mDTO> list_all();

	public User_mDTO oneview(String mno);

	public void mDelete(String mno);

	public void mUpdate(User_mDTO dto);


}
