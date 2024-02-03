package com.example.finalSpringRadwane.service;


import com.example.finalSpringRadwane.entity.Coche;
import com.example.finalSpringRadwane.repository.CocheRepository;
import com.example.finalSpringRadwane.util.CamposCoche;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CocheService {
    @Autowired
    private final CocheRepository cocheRepository;

    public CocheService(CocheRepository cocheRepository) {
        this.cocheRepository = cocheRepository;
    }

    public List<Coche> findAll(){
        return cocheRepository.findAll();
    }

    public Coche create(Coche c){
        return cocheRepository.save(c);
    }

    public int updatePotenciaByMatricula(int potencia,String matricula){
        return cocheRepository.updatePotenciaByMatricula(potencia,matricula);
    }

    public void delete(String matricula){
        cocheRepository.deleteById(matricula);
    }

    public Coche findByMatricula(String matricula){
        return cocheRepository.findByMatricula(matricula);
    }
    public List<Coche> findAllSplited(Integer pageNo, Integer pageSize, CamposCoche camposCoche, Sort.Direction sortDirection){
        //Pageable pageable = PageRequest.of(pageNo - 1,pageSize);
        Pageable pageable = PageRequest.of(pageNo - 1,pageSize, Sort.by(sortDirection,camposCoche.getStr()));
        return cocheRepository.findAll(pageable).getContent();
    }

    public List<Coche> getCarsOverOrEqualHP(Integer potencia){
        return cocheRepository.findByPotenciaGreaterThanEqual(potencia);
    }

    public Coche findFastest(){
        return cocheRepository.findFirstByOrderByPotenciaDesc();
    }
}
