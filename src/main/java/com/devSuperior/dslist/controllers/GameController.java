package com.devSuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.dslist.dto.GameMinDTO;
import com.devSuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService; // injeta o service
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
