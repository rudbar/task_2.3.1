package webpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import webpackage.model.User;
import webpackage.service.UserService;

import javax.enterprise.inject.Model;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        List<User> listUser = userService.getAllUsers();

        mv.addObject("listUser", listUser);
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/new")
    public String newUserForm(Map<String, Object> model) {
        model.put("user", new User());
        return "new_user";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
    public ModelAndView displayEditUserForm(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("/editUser");
        User user = userService.getUserById(id);
        mv.addObject("headerMessage", "Edit User Details");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "/editUser/{id}", method = RequestMethod.POST)
    public ModelAndView saveEditedUser(@ModelAttribute User user, BindingResult result) {
        ModelAndView mv = new ModelAndView("redirect:/home");

        if (result.hasErrors()) {
            System.out.println(result.toString());
            return new ModelAndView("error");
        }
        return mv;
    }
}
