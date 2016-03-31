package com.rexen.controler;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rexen.model.User;
import com.rexen.service.IUserService;
import com.rexen.util.Constants;

@Controller
public class UserControler {
	@Autowired
	private IUserService usersService;
	
	@RequestMapping(value = "/login_tologin")
	public ModelAndView index(User user) throws Exception{
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value = "/login_login",produces="application/json;charset=UTF-8")
	@ResponseBody
	public ModelMap login(User user) throws Exception{
		User u = usersService.getUserInfo(user);
		u.setUserName("你好");
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("user", u);
		Subject currentUser = SecurityUtils.getSubject();  
		Session session = currentUser.getSession();
		session.setAttribute(com.rexen.util.Const.SESSION_USER, u);
		Subject subject = SecurityUtils.getSubject(); 
	    UsernamePasswordToken token = new UsernamePasswordToken(u.getUserName(), u.getPassword()); 
	    try { 
	        subject.login(token); 
	    } catch (AuthenticationException e) { 
	    	throw e;
	    }
		return modelMap;
	}
}
