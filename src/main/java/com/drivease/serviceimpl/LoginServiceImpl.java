package com.drivease.serviceimpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.drivease.dao.AdminDao;
import com.drivease.model.Admin;
import com.drivease.service.LoginService;
import com.drivease.util.PasswordEncode;


@Service("loginservice")
@Transactional
@SessionAttributes("admin")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	AdminDao admindao;
	
	@Autowired
	HttpSession session;

	public Admin login(Admin admin) {
		String password = admin.getPassword();
		admin.setPassword(PasswordEncode.passwordEncode(password));
		return admindao.loginCheck(admin);
	}
	
}
