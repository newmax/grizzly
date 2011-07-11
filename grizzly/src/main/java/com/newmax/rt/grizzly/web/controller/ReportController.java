package com.newmax.rt.grizzly.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.service.AbonentService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;
import com.newmax.rt.grizzly.web.dto.AbonentDto;

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
     */
    @RequestMapping(value = "/reports.html", method = RequestMethod.GET)
    public ModelAndView show() {
        return new ModelAndView("reports");
    }    
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/report/user/iptv.html", method = RequestMethod.GET)
    public ModelAndView iptvUsersFind() {
        return new ModelAndView("report/iptv-users", "abonentDto", new AbonentDto());
    }
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/report/user/iptv.html", method = RequestMethod.POST)
    public ModelAndView iptvUsersShow(@Valid @ModelAttribute AbonentDto abonentDto,
            						  BindingResult result) {
     	
    	if (result.hasErrors()) {
            return new ModelAndView("report/iptv-users");
        } else {
    	
			try {
				Abonent abonent = abonentService.getByAccount(abonentDto.getAccount());
				
        		return new ModelAndView("report/iptv-users")
    			.addObject("abonentDto", new AbonentDto())
    			.addObject("abonent",abonent);

			} catch (NotFoundException e) {
        		return new ModelAndView("report/iptv-users")
    				.addObject("abonentDto", abonentDto)
    				.addObject("error", e.getMessage()); 
			}        	
        }
    }
}

