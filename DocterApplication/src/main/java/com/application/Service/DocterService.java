package com.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.Entity.Docter;
import com.application.Repository.DocterRepository;


@Service 
public class DocterService {
	
	
	@Autowired
	private DocterRepository docterrepo;
	
	
	
	public Docter saveProduct(Docter docter) {
        return docterrepo.save(docter);
    }
	
	  public List<Docter> DocterList(List<Docter> docters) {
	        return docterrepo.saveAll(docters);
	    }

}
