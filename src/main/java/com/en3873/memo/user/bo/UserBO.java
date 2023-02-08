package com.en3873.memo.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.memo.common.EncryptUtils;
import com.en3873.memo.user.dao.UserDAO;
import com.en3873.memo.user.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public int addUser(
			String loginId
			, String password
			, String name
			, String email) {
		
		// 암호화
		String encryptPassword = EncryptUtils.md5(password);
		
		
		return userDAO.insertUser(loginId, encryptPassword, name, email);
		
	}
	
	public User getUser(
			String loginId
			, String password) {
		
		String encryptPassword = EncryptUtils.md5(password);
		
		return userDAO.selectUser(loginId,  encryptPassword);
		
	}

}
