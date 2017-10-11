package cx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cx.entity.UserEntity;
import cx.service.UserServiceI;



@Controller//代表是控制层
@RequestMapping("/user") //
public class UserController {

	 @Resource
	 private UserServiceI userService; 
	
	 @RequestMapping("/getEntity")
	 public String getEntity(HttpServletRequest request,Model model){
		 int id = Integer.parseInt(request.getParameter("id"));
		 System.out.println(id);
		 UserEntity entity = userService.getById(id);
		 model.addAttribute("userEntity",entity);
		 return "user";
	 }



	 
	
}
