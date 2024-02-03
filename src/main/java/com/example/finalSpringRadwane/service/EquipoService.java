package com.example.finalSpringRadwane.service;


import com.example.finalSpringRadwane.entity.Equipo;
import com.example.finalSpringRadwane.repository.EquipoRepository;
import com.example.finalSpringRadwane.util.CamposEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipoService {

    @Autowired
    private final EquipoRepository equipoRepository;

    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public List<Equipo> findAll(){
        return equipoRepository.findAll();
    }

    public List<Equipo> findAllSplited(Integer pageNo, Integer pageSize, CamposEquipo camposEquipo, Sort.Direction sortDirection){
        //Pageable pageable = PageRequest.of(pageNo - 1,pageSize);
        Pageable pageable = PageRequest.of(pageNo - 1,pageSize, Sort.by(sortDirection,camposEquipo.getStr()));
        return equipoRepository.findAll(pageable).getContent();
    }

    public List<Equipo> findByCompeticion(String competicion){
        return equipoRepository.findByCompeticion(competicion);
    }

    public List<Equipo> findByTiresUsed(String neumaticos){
        return equipoRepository.findByEstrategia_Neumaticos(neumaticos);
    }
}
