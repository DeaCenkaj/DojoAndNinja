package com.codingdojo.dea.dojoandninja.services;

import com.codingdojo.dea.dojoandninja.models.Ninja;
import com.codingdojo.dea.dojoandninja.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> allNinja(){
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }
}