package com.jeevan.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.CustomerDetails;

@Controller
public class UserProfileViewController {
    @RequestMapping(value = "/usersProfile", method = RequestMethod.GET)
    public ModelAndView loginpage(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        UserDao ud = new UserDao();
        HttpSession session = request.getSession();
        if(session == null )
            return new ModelAndView("LoginPage");
        String userName = (String)session.getAttribute("userName") ;
        Integer userId = ud.findID(userName);
        System.out.println("Fetching User Details For "+userName+" UserID "+userId);
        CustomerDetails profile = ud.findByuserId(userId);
        return new ModelAndView("usersProfile", "profile", profile);
    }

    @RequestMapping("/profile/{id}")
    public String detail(@PathVariable(value = "id") Integer userId, ModelMap model) {
        UserDao ud = new UserDao();
        /*HttpSession session = request.getSession();
        if(session == null )
            return "redirect:/login.htm";
        Integer userId = (Integer)session.getAttribute("userName");*/
        CustomerDetails profile = ud.findByuserId(userId);
        model.put("profile", profile);
        return "usersProfile";
    }
}