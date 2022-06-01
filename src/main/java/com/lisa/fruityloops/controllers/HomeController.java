package com.lisa.fruityloops.controllers;
	
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lisa.fruityloops.models.Item;

import org.springframework.stereotype.Controller;
import java.util.ArrayList;

@Controller
public class HomeController {
	@RequestMapping("/")  
	public String index(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", 0.75));
		
		// Add fruits your view model here
		model.addAttribute("fruitsFromController", fruits);
		
		return "index.jsp";
		
	}
}
