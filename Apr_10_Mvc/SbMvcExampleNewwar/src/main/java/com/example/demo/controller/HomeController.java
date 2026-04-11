package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@GetMapping("/loginresult")
	public String loginResult(HttpServletRequest req, RedirectAttributes redirectAttributes) {
	    String user = req.getParameter("userName");
	    String pwd = req.getParameter("passCode");

	    if ("Sivahari".equals(user) && "Sivahari".equals(pwd)) {
	        return "home";
	    } else {
	        redirectAttributes.addFlashAttribute("error", "Invalid Credentials...");
	        return "redirect:/";
	    }
	}
	
	@GetMapping(value="/home")
	public String home() {
		return "home";
	}
	
	@GetMapping(value="/")
	public String login() {
		return "login";
	}
	
	@GetMapping(value="/lingeshwar")
	public String lingeshwar() {
		return "lingeshwar";
	}
	
	@GetMapping(value="/calcresult")
	public String calcResult(HttpServletRequest req, Model model) {
		int firstNo = Integer.parseInt(req.getParameter("firstNo"));
		int secondNo = Integer.parseInt(req.getParameter("secondNo"));
		int sum = firstNo + secondNo;
		int sub = firstNo - secondNo;
		int mult = firstNo * secondNo;
		model.addAttribute("firstNo",firstNo);
		model.addAttribute("secondNo",secondNo);
		model.addAttribute("sum",sum);
		model.addAttribute("sub",sub);
		model.addAttribute("mult",mult);
		return "calcresult";
	}
	
	@GetMapping(value="/calcinput")
	public String calcInput(HttpServletRequest req, Model model) {
		return "calcinput";
	}
	
	@GetMapping(value="/nameresult")
	public String nameResult(HttpServletRequest req, Model model) {
		String firstName = req.getParameter("firstName");
		String lastName =req.getParameter("lastName");
		String fullName = firstName + " " +lastName;
		model.addAttribute("firstName",firstName);
		model.addAttribute("lastName",lastName);
		model.addAttribute("fullName",fullName);
		return "nameresult";
	}
	
	@GetMapping(value="/name")
	public String namePage(HttpServletRequest req, Model model) {
		return "name";
	}
	
	@GetMapping(value="/demoresult")
	public String demoResult(HttpServletRequest req, Model model) {
		String sname = req.getParameter("sname");
		model.addAttribute("sname",sname);
		return "demoresult";
	}
	
	@GetMapping(value="/demo")
	public String demo() {
		return "demo";
	}
	
	
	@GetMapping(value="/siva")
	public String siva() {
		return "siva";
	}
	
	@GetMapping(value="/durga")
	public String durga() {
		return "durga";
	}
}
