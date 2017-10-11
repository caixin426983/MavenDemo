package cx.controller;


import cx.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import java.util.Map;

/**
 * Created by Administrator on 2017-8-17.
 */
@Controller
@RequestMapping("testController")
public class TestController{

    //它们分别表示参数param1 的值必须等于value1 ，
    // 参数param2 必须存在，值无所谓，
    // 参数param3 必须不存在，
    // 只有当请求/testParams.do 并且满足指定的三个参数条件的时候才能访问到该方法。
    // 所以当请求/testParams.do?param1=value1&param2=value2 的时候能够正确访问到该testParams 方法，
    // 当请求/testParams.do?param1=value1&param2=value2&param3=value3 的时候就不能够正常的访问到该方法，
    // 因为在@RequestMapping 的params 参数里面指定了参数param3 是不能存在的。
    @RequestMapping(value = "add",params = {"params=value1","params2","!params3"})
    public String add(){
        return  "aa";
    }

    // TODO: http://127.0.0.1:8080/web-ssm/testController/array.do?name=Tom&name=%E5%BC%A0%E7%8F%8A
    @RequestMapping(value = "array")
    @ResponseBody
    public  String array(String [] name){
        StringBuilder sbf = new StringBuilder();
        for (String item:
             name) {
            sbf.append(item).append(" ");
        }
        return  sbf.toString();
    }


    // TODO: 2017-8-22 同属性的多对象
    //http://127.0.0.1:8080/web-ssm/testController/object.do?name=Tom&age=10
    //UserEntity 和AdminEntity都有name和age属性
    @RequestMapping("object")
    @ResponseBody
    public  String  Object(UserEntity userEntity, AdminEntity adminEntity){
        return  userEntity.toString() + adminEntity.toString();
    }

    @InitBinder("userEntity")
    public void  initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("userEntity.");
    }

    @InitBinder("adminEntity")
    public void  initAdmin(WebDataBinder binder){
        binder.setFieldDefaultPrefix("adminEntity.");
    }


    // TODO: 2017-8-22 http://127.0.0.1:8080/web-ssm/testController/list.do?userEntityList[0].name=Tom&userEntityList[1].name=Lucy 
    // TODO: 2017-8-22 http://127.0.0.1:8080/web-ssm/testController/list.do?userEntityList[0].name=Tom&userEntityList[1].name=Lucy&userEntityList[20].name=sky
    //SpringMVC List数组传参数，如果下标不正确，会导致产生空的对象
    @RequestMapping("list")
    @ResponseBody
    public  String list(UserListForm userListForm){
        return  userListForm.toString();
    }



    @RequestMapping("set")
    @ResponseBody
    public String set(AdminSetForm adminSetForm){
        return adminSetForm.toString();
    }


    @RequestMapping("map")
    @ResponseBody
    public String map(AdminMapForm adminMapForm){
        return adminMapForm.toString();
    }


    @ResponseBody
    @RequestMapping(value="/postTest",method = RequestMethod.POST)
    public  Object postTest(@RequestParam Map<String,Object> map){
        Object data = map.get("data");
        Object name = map.get("name");
        System.out.println(name);
        System.out.println(data);
        return "aaaa";
    }






}
