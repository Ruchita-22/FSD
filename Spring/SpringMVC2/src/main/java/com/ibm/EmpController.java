package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import javax.swing.text.html.FormSubmitEvent.MethodType;

@Controller
public class EmpController {
	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("spring.xml");
	EmpDAO edao = ctx.getBean(EmpDAO.class);
	
	@GetMapping(path = { "/showemp" })
	public String showAllEmp(ModelMap model) {
		List<Emp> emplist = edao.getEmpDetails();
		System.out.println(emplist.size());
		model.addAttribute("elist", emplist);
	
		return "emp";
	}
	
	@RequestMapping(path = "/saveemp", 
			method = RequestMethod.POST)
	public String addEmp(@RequestParam("id") Integer id,
						 @RequestParam("name") String name) {
		Emp emp = ctx.getBean(Emp.class);
		emp.setId(id);	
		emp.setName(name);
		edao.addEmp(emp);
		return "redirect:showemp";
	}
	
}
