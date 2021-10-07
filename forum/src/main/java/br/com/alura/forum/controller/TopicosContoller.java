package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosContoller {
	
	@RequestMapping("/topicos")
	
	public List<TopicoDto> list(){
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring-boot", "Programação"));
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}

}
