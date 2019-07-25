package controllers;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import repsitory.UserDao;

@Controller
public class UserController {
    @GetMapping("/index")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index", "oh", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
            public ModelAndView login(@ModelAttribute("login") Login login) {
                User user = UserDao.checkLogin(login);
                if (user == null) {
                    ModelAndView modelAndView = new ModelAndView("error");
                    return modelAndView;
                }
                else{
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("a",user);
            return modelAndView;
        }
    }
}
