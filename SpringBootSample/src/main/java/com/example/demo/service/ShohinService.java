package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Shohin;
import com.example.demo.repository.ShohinRepository;

@Service
public class ShohinService {

	@Autowired
	private ShohinRepository repository;
	
	public Shohin getShohin(String id) {
		Map<String, Object> map = repository.findById(id);
		
		Shohin shohin = new Shohin();
		shohin.setShohinId((String)map.get("shohin_id"));
		shohin.setShohinMei((String)map.get("shohin_mei"));
		shohin.setShohinBunrui((String)map.get("shohin_bunrui"));
		shohin.setHanbaiTanka((Integer)map.get("hanbai_tanka"));
		shohin.setShiireTanka((Integer)map.get("shiire_tanka"));
		
		return shohin;
	}
}
