package com.devSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.dslist.dto.GameListDTO;
import com.devSuperior.dslist.etities.GameList;
import com.devSuperior.dslist.repositories.GameListRpository;

@Service
public class GameListService {

	@Autowired
	private GameListRpository gameListRepository; //injetar o repository(criando instancia) para chamar a classe
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();// tolist retorna o stream para a lista
	}
}
