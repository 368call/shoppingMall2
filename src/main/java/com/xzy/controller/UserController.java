package com.xzy.controller;

import com.xzy.model.User;
import com.xzy.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.result.JsonPathResultMatchers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

   @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        System.out.println(user.getUser_name());
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
   //修改,先通过get方法得到一个对象
   @RequestMapping("editStudent")
   public ModelAndView editStudent(User user) {
       User  user1= userService.get(user.getUser_ID());
       List<User> user2=userService.showall();
       System.out.println(user2.get(1).toString());
       ModelAndView mav = new ModelAndView("editStudent");
       mav.addObject("c",user2);
       return mav;
   }
   @RequestMapping("/add")
    public String adduser(int id,String name)
   {
       System.out.println("添加页面。。。。。");
       System.out.println("id:"+id+"name:"+name);
       return "index";
   }
   @RequestMapping("/index")
    public String index(String name){
       System.out.println("跳转到add页面......");
       System.out.println("name:"+name);
       return "Test";
   }
   @RequestMapping("/insert")
    public void insert(User user)
   {
        System.out.println(user.toString());
   }

   @RequestMapping("showList")
    public ModelAndView showList(){
       List<User> userlist=userService.showall();
       ModelAndView mav=new ModelAndView();
       for (User u:userlist) {
           System.out.println(u.toString());
       }
       mav.setViewName("showListview");
       mav.addObject("userlist",userlist);
       return mav;
   }
}
