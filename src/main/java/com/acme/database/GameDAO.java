package com.acme.database;

import java.util.List;

import com.acme.model.Game;


public interface GameDAO{
	/**
	 * 
	 * 
	 * @return Game
	 * @author Nicholas Keam
	 * since 12/21/2012
	 * 
	 */
	List<Game> getGames();
	

}