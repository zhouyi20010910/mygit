package com.my.it.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.it.service.DetailService;

@Controller
@RequestMapping("/")
public class DetailController {
   @Autowired
	private  DetailService service=null;
   
   @RequestMapping("/list")
    public String findAll(Model m)
    {
    	m.addAttribute("list",service.findAll());
    	return "list";
    }
    
	   @RequestMapping("/page")
	   public String findList(long sortid,int page,Model m)
	   {
		   	m.addAttribute("list",service.findList(sortid, page, 5, "id desc"));
		   	int rowcount=service.findCount(sortid);
		   	
		   	m.addAttribute("rows",rowcount);
		   	m.addAttribute("pagecount",rowcount%5==0?rowcount/5:(rowcount/5+1));
		   	m.addAttribute("currentpage",page);
		   	
		   	return "list";
	   }
	   @RequestMapping(value="/add",method=RequestMethod.GET)
	   public String add()
	   {
		   return "add";
	   }
	   
	   @RequestMapping(value="/add",method=RequestMethod.POST)
	   public String add(Detail o)
	   {
		   service.add(o);
		   return "redirect:list";
	   }
	   
	   @RequestMapping(value="/edit",method=RequestMethod.GET)
	   public String edit(Long id,Model m)
	   {
		  m.addAttribute("o", service.findOne(id));
		   return "edit";
	   }
	   
	   @RequestMapping(value="/edit",method=RequestMethod.POST)
	   public String edit(Detail o)
	   {
		   service.edit(o);
		   return "redirect:list";
	   }
	   
	   @RequestMapping(value="/del")
	   public String delete(Long id)
	   {
		   service.remove(id);
		   return "redirect:list";
	   }

}





