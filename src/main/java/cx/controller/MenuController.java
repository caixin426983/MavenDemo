package cx.controller;



import com.alibaba.fastjson.JSON;
import cx.service.MenuServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Controller//代表是控制层
@RequestMapping("/menu") //
public class MenuController {

	@Resource
	private MenuServiceI menuServiceI;
	
	 @RequestMapping("/getMenu")
	 public String getMenu(HttpServletRequest request,Model model){
	 	try{
			List<Map> menus= menuServiceI.getMenu();
			String string = JSON.toJSONString(menus);
			model.addAttribute("menuEntity", string);
		}catch (Exception e){
	 		e.printStackTrace();
		}
		 return "menus";
	 }


	@ResponseBody
	@RequestMapping(value="/postTest", method= RequestMethod.POST)
	public  Object postTest(Map<String,Object> map){
		Object data = map.get("data");
		System.out.println(data);
		return "aaaa";
	}




	 
	
}
