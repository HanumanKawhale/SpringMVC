package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final String Integer = null;

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home");
		
		model.addAttribute("name","Hanuman");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help");
		ModelAndView modelandView  = new ModelAndView();
		modelandView.addObject("name","Hanuman");
		modelandView.addObject("id",123);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		modelandView.addObject("number",list);
		
		modelandView.setViewName("help");
		
		return modelandView;
	}
}
