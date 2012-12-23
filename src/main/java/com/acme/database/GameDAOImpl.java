package com.acme.database;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.database.mapper.GameMapper;
import com.acme.model.Game;


public class GameDAOImpl implements GameDAO{
	private DataSource dataSource;
	
	@Override
	public List<Game>getGames(){
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql="select*from schedule order by id asc";
		return template.query(sql,new GameMapper());
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}