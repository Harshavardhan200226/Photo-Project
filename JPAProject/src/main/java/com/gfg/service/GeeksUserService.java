package com.gfg.service;
import com.gfg.model.GeeksUserRecord;
import com.gfg.repository.GeeksUserRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class GeeksUserService {
	private final GeeksUserRepository repository;
	public GeeksUserService(GeeksUserRepository repository) {
		this.repository=repository;
	}
	public List<GeeksUserRecord> getAllGeeksUsers(){
		return repository.findAll();
	}
	public GeeksUserRecord addGeeksUser(GeeksUserRecord userRecord) {
		return repository.save(userRecord);
	}
}
