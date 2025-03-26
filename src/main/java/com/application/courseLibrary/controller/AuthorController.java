package com.application.courseLibrary.controller;

import com.application.courseLibrary.entity.Author;
import com.application.courseLibrary.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zoetian
 * @create 2022/11/12
 */
@Controller
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@GetMapping("/authors")
	private String listAuthors(Model model){
		model.addAttribute("authors",authorService.findAllAuthors());
		return "authors";
	}

	@GetMapping("/remove-author/{id}")
	public String removeAuthorById(@PathVariable Long id,Model model){
		authorService.deleteAuthor(id);
		model.addAttribute("authors",authorService.findAllAuthors());
		return "authors";
	}
	@GetMapping("/update-author/{id}")
	public String updateAuthor(@PathVariable Long id,Model model){
		model.addAttribute("author",authorService.findAuthorsById(id));
		return "update-author";

	}

	@PostMapping("/update-author/{id}")
	public String saveUpdateAuthor(@PathVariable Long id, Model model, Author author, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "update-author";
		}
		authorService.updateAuthor(author);
		model.addAttribute("authors",authorService.findAllAuthors());
		return "redirect:/authors";
	}

	@GetMapping("/add-author")
	public String createAuthor(Author author){
		return "add-author";
	}

	@PostMapping("/save-author")
	public String saveAuthor(Author author,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			return "add-author";
		}
		authorService.createAuthors(author);
		model.addAttribute("authors",authorService.findAllAuthors());
		return "redirect:/authors";
	}
}