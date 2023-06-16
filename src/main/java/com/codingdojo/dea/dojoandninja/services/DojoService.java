package com.codingdojo.dea.dojoandninja.services;

import com.codingdojo.dea.dojoandninja.models.Dojo;
import com.codingdojo.dea.dojoandninja.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepository;
    public List<Dojo>allDojo(){
        return dojoRepository.findAll();
    }
    public Dojo createDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }
    public  Dojo FindDojo(Long id){
        return dojoRepository.findById(id).orElse(null);
    }


}
