package com.example.finalSpringRadwane.controller;


import com.example.finalSpringRadwane.entity.Piloto;
import com.example.finalSpringRadwane.service.PilotoService;
import com.example.finalSpringRadwane.util.CamposPiloto;
import com.example.finalSpringRadwane.util.DriverStyle;
import com.example.finalSpringRadwane.util.Marcas;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "DRIVER TABLE")
@RestController
@RequestMapping("/api")
public class PilotoRestController {

    private final PilotoService pilotoService;

    public PilotoRestController(PilotoService pilotoService) {
        this.pilotoService = pilotoService;
    }

    @GetMapping("/drivers")
    public List<Piloto> getDrivers(){
        return pilotoService.findAll();
    }

    @GetMapping("/driverspaged")
    public List<Piloto> getPagedDrivers(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "3") Integer pageSize,
                                        @RequestParam(required = false) CamposPiloto piloto,
                                        @RequestParam(defaultValue = "ASC") Sort.Direction sortDirection){
        return pilotoService.findAllPaged(pageNo,pageSize,piloto,sortDirection);
    }

    @GetMapping("/driver/{team_name}")
    public List<Piloto> getTeamDriversByName(@PathVariable("team_name") String nombre){
        return pilotoService.findDriversThatBelongToATeam(nombre);
    }

    @GetMapping("/drivers/car/{carlabel}")
    public long getNumberOfDriversThatDriveACarLabel(@PathVariable("carlabel") Marcas marca){
        return pilotoService.countDriversThatDriveCar(marca.getStr());
    }

    @GetMapping("/drivers/style/{style}")
    public List<Piloto> getDriversByStyle(@PathVariable("style") DriverStyle driverStyle){
        return pilotoService.findByStyle(driverStyle.getStr());
    }

    @DeleteMapping("/delete/driver/{dni}")
    public ResponseEntity<String> delete(@PathVariable String dni){
        pilotoService.delete(dni);
        return new ResponseEntity<>("Team deleted successfully", HttpStatus.OK);
    }

}
