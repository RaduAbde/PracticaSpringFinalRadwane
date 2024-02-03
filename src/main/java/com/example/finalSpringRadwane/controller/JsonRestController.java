package com.example.finalSpringRadwane.controller;

import com.example.finalSpringRadwane.entity.Coche;
import com.example.finalSpringRadwane.entity.Equipo;
import com.example.finalSpringRadwane.entity.Estrategia;
import com.example.finalSpringRadwane.entity.Piloto;
import com.example.finalSpringRadwane.service.CocheService;
import com.example.finalSpringRadwane.service.EquipoService;
import com.example.finalSpringRadwane.service.EstrategiaService;
import com.example.finalSpringRadwane.service.PilotoService;
import com.example.finalSpringRadwane.util.Tables;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Tag(name = "JSON OPTION")
@RestController
@RequestMapping("/api")
public class JsonRestController {

    private final PilotoService pilotoService;
    private final CocheService cocheService;
    private final EstrategiaService estrategiaService;
    private final EquipoService equipoService;

    public JsonRestController(PilotoService pilotoService, CocheService cocheService,EstrategiaService estrategiaService, EquipoService equipoService) {
        this.pilotoService = pilotoService;
        this.cocheService = cocheService;
        this.estrategiaService = estrategiaService;
        this.equipoService = equipoService;
    }

    @GetMapping("/json")
    public String getJson(@RequestParam(required = true) Tables table){
        String option = table.getStr();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Path jsonFile = null;
        switch (option){
            case "Coche":

                List<Coche> carList = cocheService.findAll();

                carList.forEach(coche -> coche.setPilotos(null));

                jsonFile = Path.of("./coche.json");


                try {
                    String json = gson.toJson(carList);
                    Files.writeString(jsonFile, json);
                    return jsonFile.getFileName().toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case "Equipo":
                List<Equipo> equipoList = equipoService.findAll();
                equipoList.forEach(equipo -> equipo.setPilotos(null));
                jsonFile = Path.of("./equipo.json");


                try {
                    String json = gson.toJson(equipoList);
                    Files.writeString(jsonFile, json);
                    return jsonFile.getFileName().toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case "Estrategias":
                List<Estrategia> estrategiaList = estrategiaService.findAll();
                jsonFile = Path.of("./estrategia.json");


                try {
                    String json = gson.toJson(estrategiaList);
                    Files.writeString(jsonFile, json);
                    return jsonFile.getFileName().toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case "Piloto":
                List<Piloto> pilotoList = pilotoService.findAll();
                pilotoList.forEach(piloto -> piloto.setEquipo(null));
                pilotoList.forEach(piloto -> piloto.setCoche(null));
                jsonFile = Path.of("./piloto.json");


                try {
                    String json = gson.toJson(pilotoList);
                    Files.writeString(jsonFile, json);
                    return jsonFile.getFileName().toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
        return "";
    }


}
