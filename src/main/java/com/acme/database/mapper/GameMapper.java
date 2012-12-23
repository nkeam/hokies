package com.acme.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.acme.model.Game;

public class GameMapper implements RowMapper<Game>{
	@Override
	public Game mapRow(ResultSet resultSet,int line) throws SQLException{
		Game game = new Game();
		game.setId(resultSet.getInt("id"));
		game.setRank(resultSet.getInt("rank"));
		game.setOpponent(resultSet.getString("opponent"));
		game.setHokieScore(resultSet.getInt("hokiescore"));
		game.setOppScore(resultSet.getInt("oppscore"));
		game.setWinLoss(resultSet.getString("wl"));
		game.setTv(resultSet.getString("tv"));
		game.setLocation(resultSet.getString("location"));
		game.setDate(resultSet.getString("date"));
		
		return game;
	}
}