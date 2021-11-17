package com.example.sample.controller;

import javax.validation.Valid;

import com.example.sample.PersonForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class FormController {

  @GetMapping("/home")
  public String hello() {
    return "index";
  }

  @GetMapping("/form")
  public String form(Model model, PersonForm personForm) {
    model.addAttribute("person", personForm);
    return "form";
  }

  @PostMapping("/form")
  public String form(@Valid PersonForm personForm, BindingResult result) {
    if (result.hasErrors()) {
      return "form";
    }
    return "redirect:/test/home";
  }
}
