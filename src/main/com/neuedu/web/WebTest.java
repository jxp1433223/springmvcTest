package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
/*请求的类放到HandleMapping*/
public class WebTest {
    private IUserService service = new UserServiceImpl();
    @RequestMapping("/a.do")
    /*处理哪一个请求*/
    public String web(/*ModelMap map*/){
       /* map.addAttribute("a","skdfsl");*/
        return "a";
    }
    @RequestMapping("/b.do")
    public  String b(@RequestParam("name") String a, String pwd){
        /*接收from表单中的数据*/
        System.out.println(a+" "+pwd);
        return  "b";
    }
    /*处理请求的方法*/
    @RequestMapping("/list.do")
    public String list(ModelMap map){
        List<User> users = service.getLists();
        map.put("users",users);
        return "list";
    }
    @RequestMapping("/addUser.do")
    public String addUser(){
        return "addUser";
    }
    @RequestMapping("/doAddUser.do")
    public String doAddUser(User user){
        service.insert(user);
        System.out.println(user);
        return "redirect:list.do";
    }
    @RequestMapping("/deleteUser.do")
    public String deleteUser(int id){
        service.deleUser(id);
        return "redirect:list.do";
    }
    @RequestMapping("/updateUser.do")
    public String updateUser(ModelMap map, int id){
        User user = service.getOne(id);
        map.put("user", user);
        return "updateUser";
    }
    @RequestMapping("/doUpdateUser.do")
    public String doUpdateUser(User user){
        service.amend(user);
        return "redirect:list.do";
    }
}
