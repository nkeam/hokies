package com.acme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acme.database.GameDAO;
import com.acme.model.Game;

@Controller
@RequestMapping("/schedule") 
public class ScheduleController{
	@Autowired
	private GameDAO gameDAO;

	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model){
		List<Game>gameList=gameDAO.getGames();
		model.addAttribute("gameList",gameList);
		return "schedule";
	}
	public GameDAO getGameDAO() {
		return gameDAO;
	}
	public void setGameDAO(GameDAO gameDAO) {
		this.gameDAO = gameDAO;
	}
}