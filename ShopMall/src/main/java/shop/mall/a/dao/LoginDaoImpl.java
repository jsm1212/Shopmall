package shop.mall.a.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	SqlSession session;
	String ns = "Login.";
}
