package com.example.finalSpringRadwane.controller;

import com.example.finalSpringRadwane.entity.Coche;
import com.example.finalSpringRadwane.util.CamposCoche;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CarApi {

    @Operation(
            summary = "Retrieve a list of Cars",
            description = "Gets a list of all the tasks in de data-base.",
            tags = {"Get","Cars"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    List<Coche> getCars();

    @Operation(
            summary = "Retrieve a list of Cars Paged",
            description = "Gets a list of all the cars in de data-base. Separated with paged",
            tags = {"Paged"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    List<Coche> getPagedDrivers(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue ="3") Integer pageSize,
                                @RequestParam(required = false) CamposCoche camposCoche,
                                @RequestParam(defaultValue = "ASC") Sort.Direction sortDirection);

    @Operation(
            summary = "Get the fastest car",
            description = "Gets the car with more HP(Horse Power)",
            tags = {"Get"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    Coche getFastestCar();

    @Operation(
            summary = "Add a new Car",
            description = "Adds a new Car to the DataBase",
            tags = {"Add"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    Coche newCar(@RequestParam(name ="Matricula") String matricula,@RequestParam(name ="Marca") String marca,@RequestParam(name ="Modelo") String modelo,@RequestParam(name ="Potencia") Integer potencia);

    @Operation(
            summary = "Retrieve a list of Cars By HP",
            description = "Gets a list of all the cars in de data-base thar have a number of HP over or equal to the parameter",
            tags = {"Horse Power"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    List<Coche> getCarsOverAndEqualHP(@PathVariable("hp") Integer potencia);

    @Operation(
            summary = "Delete a Car",
            description = "Deletes a Car from the Data-Base",
            tags = {"Delete"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    ResponseEntity<String> delete(@PathVariable String matricula);

    @Operation(
            summary = "Update a car by using his plate",
            description = "Update a car Horse Power by using his plate, with the new data",
            tags = {"Update", "Plate"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succes", content = {@Content(schema = @Schema(implementation = Coche.class))}),
            @ApiResponse(responseCode = "404", description = "Error", content = {@Content(schema = @Schema())})
    })
    ResponseEntity<Integer> update(@PathVariable("matricula") String matricula, @PathVariable("potencia") Integer potencia);

}
