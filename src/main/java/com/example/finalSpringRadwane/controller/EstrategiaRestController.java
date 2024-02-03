package com.example.finalSpringRadwane.controller;


import com.example.finalSpringRadwane.entity.Estrategia;
import com.example.finalSpringRadwane.service.EstrategiaService;
import com.example.finalSpringRadwane.util.CamposEstrategia;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "STRATEGY TABLE")
@RestController
@RequestMapping("/api")
public class EstrategiaRestController {

    private final EstrategiaService estrategiaService;

    public EstrategiaRestController(EstrategiaService estrategiaService) {
        this.estrategiaService = estrategiaService;
    }


    @GetMapping("/strats")
    public List<Estrategia> getStrats(){
        return estrategiaService.findAll();
    }

    @GetMapping("/stratsspaged")
    public List<Estrategia> getPagedStrats(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue ="3") Integer pageSize,
                                       @RequestParam(required = false) CamposEstrategia camposEstrategia,
                                       @RequestParam(defaultValue = "ASC") Sort.Direction sortDirection){
        return estrategiaService.findAllSplited(pageNo,pageSize,camposEstrategia,sortDirection);
    }

    @PostMapping("/strat/")
    public Estrategia newStrat(@RequestParam(name = "Tires") String tires,@RequestParam(name = "Fuel") Double fuel){
         Estrategia e =new Estrategia();
         e.setNeumaticos(tires);
         e.setCombustible(fuel);
        return estrategiaService.create(e);
    }






}
