package com.souvik.org.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.souvik.org.model.Candidate;
import com.souvik.org.repository.CandidateRepository;

@Controller
public class CandidateController {
	@Autowired
	CandidateRepository candidateRepository;
	
	@GetMapping("/")
	public String showFrom(Candidate candidate) {
		return "register";
	}

	@PostMapping("/")
	public String register(@Valid Candidate candidate, Errors error, Model model) {
		if (error.hasErrors()) {
			return "register";
		} else {
			candidateRepository.save(candidate);
			model.addAttribute("message", "Registration Successfull Note Down The Id: " + candidate.getId());
			return "register";
		}
	}
}
