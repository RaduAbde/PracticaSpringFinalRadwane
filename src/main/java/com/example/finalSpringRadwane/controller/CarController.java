package com.example.finalSpringRadwane.controller;


import com.example.finalSpringRadwane.entity.Coche;
import com.example.finalSpringRadwane.service.CocheService;
import com.example.finalSpringRadwane.service.EquipoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/view")
public class CarController {
    private final CocheService cocheService;


    public CarController(CocheService cocheService, EquipoService equipoService) {
        this.cocheService = cocheService;

    }

    @GetMapping()
    public String homePage(){
        return "index";
    }

    @GetMapping("/cars")
    public String getCarsView(Model model){
        //primero el nombre del atributo y luego eol metodo
        model.addAttribute("cars",cocheService.findAll());
        return "car/cars";
    }

    @GetMapping("/update/{matricula}")
    public String update(@PathVariable("matricula") String matricula, Model model){
        Coche c = cocheService.findByMatricula(matricula);
        model.addAttribute("car",c);
        return "car/update";
    }

    @GetMapping("/delete/{matricula}")
    public String deleteById(@PathVariable("matricula")String matricula){
        cocheService.delete(matricula);
        return "redirect:/view/cars";
    }

    @GetMapping("car/create")
    public String addNewCar(Model model){
        model.addAttribute("c",new Coche());
        return "car/add";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute("c")Coche coche){
        cocheService.create(coche);
        return "redirect:/view/cars";
    }


}
