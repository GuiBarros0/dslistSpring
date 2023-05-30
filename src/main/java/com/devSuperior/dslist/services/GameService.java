package com.devSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.dslist.dto.GameDTO;
import com.devSuperior.dslist.dto.GameMinDTO;
import com.devSuperior.dslist.etities.Game;
import com.devSuperior.dslist.projections.GameMinProjection;
import com.devSuperior.dslist.repositories.GameRpository;

@Service
public class GameService {

	@Autowired
	private GameRpository gameRepository; //injetar o repository(criando instancia) para chamar a classe
	
	@Transactional(readOnly = true) // asegurar que não vamos fazer operacao escrita, transactional garante o principo das transsaçoes o ASSID(atomica consistente...)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get(); // get para pegar o dado dentro do tipo option(valor dentro do id)
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();// tolist retorna o stream para a lista
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();// tolist retorna o stream para a lista
	}
}
