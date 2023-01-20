package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.ISpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {
	
	private ISpeakerRepository repository;
	
	public SpeakerServiceImpl() {}
	
	public SpeakerServiceImpl(ISpeakerRepository repository) {
		this.repository = repository;
	}
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}

	public void setSpeakerRepository(ISpeakerRepository repository) {
		this.repository = repository;
	}

	
}
