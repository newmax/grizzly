package com.newmax.rt.grizzly.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newmax.rt.grizzly.service.AbonentService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

@Controller
public class AbonentController {
    private AbonentService abonentService;

    /**
     * Constructor creates MVC controller with specified BranchService
     *
     * @param branchService autowired object from Spring Context
     * @param topicService  autowired object from Spring Context
     */
    @Autowired
    public AbonentController(AbonentService abonentService) {
        this.abonentService = abonentService;
    }

    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/abonent", method = RequestMethod.GET)
    public ModelAndView abonent() throws NotFoundException {
        return new ModelAndView("abonent", "someAbonent", abonentService.getByAccount("165959045631"));
    }
}
