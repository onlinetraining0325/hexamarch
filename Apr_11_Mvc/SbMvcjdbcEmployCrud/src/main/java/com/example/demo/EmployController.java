package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping(value="/addemploy")
	public String addEmploy() {
		return "addemploy";
	}
	
	@GetMapping(value="/loginresult")
	public String loginResult(HttpServletRequest request) {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		Login loginFound = loginService.authentication(user, pwd);
		if (loginFound != null) {
			 return "redirect:/employshow"; 
		} else {
			return "login";
		}
	}
	
	
	@GetMapping(value="/saveemploy")
	public String saveEmploy(HttpServletRequest request) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(request.getParameter("gender"));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
		employService.addEmploy(employ);
		 return "redirect:/employshow";  
	}
	
	
	@GetMapping(value="/deleteemploy")
	public String deleteFinal(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		employService.deleteEmploy(empno);
		 return "redirect:/employshow";  
	}
	
	@GetMapping(value="/updatefinal")
	public String updateFinal(HttpServletRequest request) {
		Employ employUpdated = new Employ();
		employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employUpdated.setName(request.getParameter("name"));
		employUpdated.setGender(request.getParameter("gender"));
		employUpdated.setDept(request.getParameter("dept"));
		employUpdated.setDesig(request.getParameter("desig"));
		employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
		employService.updateEmploy(employUpdated);
		 return "redirect:/employshow";  
	}
	
	@GetMapping(value="/updateemploy")
	public String updateEmploy(HttpServletRequest req, Model model) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employFound = employService.searchEmploy(empno);
		model.addAttribute("employFound",employFound);
		return "updateemploy";
	}
	
	@GetMapping(value="/employshow")
	public String showEmploy(Model model) {
		List<Employ> employList = employService.showEmploy();
		model.addAttribute("employList",employList);
		return "employshow";
	}
	
	@GetMapping(value="/")
	public String login() {
		return "login";
	}
}
