package shop.mall.a.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.mall.a.controller.LoginController;
import shop.mall.a.service.LoginService;

@Controller
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main() {
		logger.info("LoginController login() " + new Date());
		return "main";
	}
}
