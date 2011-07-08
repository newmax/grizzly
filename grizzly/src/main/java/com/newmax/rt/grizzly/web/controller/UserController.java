package com.newmax.rt.grizzly.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newmax.rt.grizzly.service.UserService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

@Controller
public class UserController {
	private UserService userService;
	
    /**
     * Constructor creates MVC controller with specified BranchService
     *
     * @param userService autowired object from Spring Context
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/user/{name}.html", method = RequestMethod.GET)
    public ModelAndView user(@PathVariable("name") String name) throws NotFoundException {
        return new ModelAndView("user", "user", userService.getByName(name));
    }
}
