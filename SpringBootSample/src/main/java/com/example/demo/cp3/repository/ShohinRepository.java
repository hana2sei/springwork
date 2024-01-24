package com.example.demo.cp3.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShohinRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Map<String , Object> findById(String id) {
		
		// SQLの準備
		String query = "SELECT * ";
		query += "FROM shohin ";
		query += "WHERE shohin_id = ?;";
		
		// SQLの実行
		Map<String, Object> shohin = jdbcTemplate.queryForMap(query, id);
		
		
		return shohin;
		
	}
}
