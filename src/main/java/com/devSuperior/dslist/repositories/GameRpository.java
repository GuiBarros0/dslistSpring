package com.devSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dslist.etities.Game;

public interface GameRpository extends JpaRepository<Game, Long>{

}
