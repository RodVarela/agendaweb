package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TarefasEdicaoController {
	
	@RequestMapping(value = "/tarefas-edicao")
	public ModelAndView cadastro() {
		
		ModelAndView modelAndView = new ModelAndView("tarefas-edicao");
		return modelAndView;
	}

}
