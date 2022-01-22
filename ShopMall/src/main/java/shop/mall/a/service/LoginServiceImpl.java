package shop.mall.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mall.a.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao dao;
}
