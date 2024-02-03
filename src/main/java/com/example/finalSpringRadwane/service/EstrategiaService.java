package com.example.finalSpringRadwane.service;

import com.example.finalSpringRadwane.entity.Estrategia;
import com.example.finalSpringRadwane.repository.EstrategiaRepository;
import com.example.finalSpringRadwane.util.CamposEstrategia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstrategiaService {

    @Autowired
    private final EstrategiaRepository estrategiaRepository;

    public EstrategiaService(EstrategiaRepository estrategiaRepository) {
        this.estrategiaRepository = estrategiaRepository;
    }

    public List<Estrategia> findAll(){
       return estrategiaRepository.findAll();
    }

    public Estrategia create(Estrategia e){
        return estrategiaRepository.save(e);
    }

    public List<Estrategia> findAllSplited(Integer pageNo, Integer pageSize, CamposEstrategia camposEstrategia, Sort.Direction sortDirection){
        //Pageable pageable = PageRequest.of(pageNo - 1,pageSize);
        Pageable pageable = PageRequest.of(pageNo - 1,pageSize, Sort.by(sortDirection,camposEstrategia.getStr()));
        return estrategiaRepository.findAll(pageable).getContent();
    }




}
