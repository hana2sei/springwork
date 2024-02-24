package com.example.demo.cp3.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cp3.entity.Shohin;
import com.example.demo.cp3.repository.ShohinRepository;

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
	
	public void deleteShohin(String id) {
		int count = repository.deleteById(id);
		System.out.println("log:処理件数=" + count);
	}
}
