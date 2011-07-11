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
public class AbonentController {
    private AbonentService abonentService;

    /**
     * Constructor creates MVC controller with specified BranchService
     *
     * @param abonentService autowired object from Spring Context
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
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search() {
        return new ModelAndView("search", "abonentDto", new AbonentDto());
    }    
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView validate(@Valid @ModelAttribute AbonentDto abonentDto,
            						  BindingResult result) {     	
    	if (result.hasErrors()) {
            return new ModelAndView("search");
        } else {    	         
        	return new ModelAndView("redirect:/abonent/" + abonentDto.getAccount() + ".html");       	
        }
    }
    
    /**
     * This method handles GET request and produces JSP page with all topic branches
     *
     * @return {@link ModelAndView} with view name as renderAllBranches
     * @throws NotFoundException 
     */
    @RequestMapping(value = "/abonent/{account}", method = RequestMethod.GET)
    public ModelAndView show(@PathVariable("account") String account) {
		try {
			Abonent abonent = abonentService.getByAccount(account);				
    		return new ModelAndView("abonent","abonent",abonent);

		} catch (NotFoundException e) {
    		return new ModelAndView("search")
				.addObject("abonentDto", AbonentDto.getDtoFor(account))
				.addObject("error", e.getMessage()); 
		} 
	}
}
