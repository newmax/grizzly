package com.newmax.rt.grizzly.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.service.AbonentService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

@Controller
public class ReportController {
	private AbonentService abonentService;
	
    /**
     * Constructor creates MVC controller with specified BranchService
     *
     * @param abonentService autowired object from Spring Context
     */
    @Autowired
    public ReportController(AbonentService abonentService) {
        this.abonentService = abonentService;
    }
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/report/user/iptv.html", method = RequestMethod.GET)
    public ModelAndView iptvUsersFind() throws NotFoundException {
        return new ModelAndView("iptv-users");
    }
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/report/user/iptv.html", method = RequestMethod.POST)
    public ModelAndView iptvUsersShow(@PathVariable("account") String account) throws NotFoundException {
    	
    	Abonent abonent = abonentService.getByAccount(account);
    	
        return new ModelAndView("iptv-users","abonent",abonent);
    }
}

