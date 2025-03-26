package com.application.courseLibrary.service;

import com.application.courseLibrary.entity.Author;
import com.application.courseLibrary.entity.Publisher;
import com.application.courseLibrary.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
	@Autowired
	private PublisherRepository publisherRepository;

	public List<Publisher> findAllPublishers(){
		return publisherRepository.findAll();

	}

	public Publisher findPublishersById(Long id){
		Publisher publisher;
		publisher=publisherRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
		return publisher;
	}

	public void createPublisher(Publisher publisher){
		publisherRepository.save(publisher);
	}

	public void updatePublisher(Publisher publisher){
		publisherRepository.save(publisher);
	}

	public void deletePublishersById(Long id){
		Publisher publisher;
		publisher=publisherRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
		publisherRepository.deleteById(publisher.getId());
	}





}
