package com.devSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.dslist.dto.GameMinDTO;
import com.devSuperior.dslist.etities.Game;
import com.devSuperior.dslist.repositories.GameRpository;

@Service
public class GameService {

	@Autowired
	private GameRpository gameRepository; //injetar o repository(criando instancia) para chamar a classe
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();// tolist retorna o stream para a lista
	}
}
