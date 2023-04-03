package springmvc.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("hi", "hanuman");
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}	
	
	
	@RequestMapping("/processform")
	public String handlerForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		// this.userService().createUser(user);
		return "success";
	}


	private Object userService() {
		// TODO Auto-generated method stub
		return null;
	}
}

//public String handlerForm(@RequestParam("email") String email,@RequestParam("name") String name,@RequestParam("password") String password ,Model model) {
//	
//	System.out.println(email);
//	System.out.println(name);
//	System.out.println(password);
//	
////	model.addAttribute("password",password);
////	model.addAttribute("name", name);
////	model.addAttribute("email",email);
////	
//	User user = new User();
//	
//	user.setEmail1(email);
//	user.setName(name);
//	user.setPassword(password);
//	
//	model.addAttribute("user",user);
