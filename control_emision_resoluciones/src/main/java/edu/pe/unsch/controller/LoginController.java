package edu.pe.unsch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pe.unsch.entity.UsuarioEntity;
import edu.pe.unsch.service.UsuarioLoginService;

@Controller
public class LoginController {
	
	@Autowired
	UsuarioLoginService loginService;
	
	@GetMapping({"/", "/login"})
	public String index(Model model) {
		
		model.addAttribute("fail", false);
		
		return "/admin/login/index";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpSession session, Model model) {
		
		UsuarioEntity usuario = this.loginService.login(
								request.getParameter("email"), 
								request.getParameter("password")
								);
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("fail", true);
		
		return usuario == null? "redirect:/login" : "redirect:/admin/home";
		
	}
}
