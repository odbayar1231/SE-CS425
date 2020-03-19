package edu.mum.cs.cs425.lab8.task3.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.cs.cs425.lab8.task3.model.Product;
import edu.mum.cs.cs425.lab8.task3.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/edit")
	public String showAddProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "edit";
	}
	
	//RequestMapping(value = "/add", method = RequestMethod.POST)
	@PostMapping("/edit")
	public String addProduct(@Valid @ModelAttribute("product") Product product,
			BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "edit";
		}
		
		productService.save(product);
		return "redirect:/product/list";
	}
	
	@GetMapping(value = {"/", "", "/list"})
	public String showProductList(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "list";
		
	}
}
