package com.algaworks.brewer2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CidadesController {

	@RequestMapping("/cidades/novo")
	public String novo() {
		return "cidade/CadastroCidade";
	}
}
