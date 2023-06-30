package com.laurine.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.EvolutionEntity;
import com.laurine.uber.service.EvolutionService;

@RestController
@RequestMapping("/evolution") // Correction de l'annotation RequestMapping
public class EvolutionController {
    private EvolutionService evolutionService;

    @Autowired
    public EvolutionController(EvolutionService evolutionService) {
        this.evolutionService = evolutionService;
    }

    @GetMapping
    public List<EvolutionEntity> getAllEvolutions() {
        return evolutionService.getAllEvolutions();
    }

    @GetMapping("/{id}")
    public EvolutionEntity getEvolutionById(@PathVariable Long idEvolution) {
        return evolutionService.getEvolutionById(idEvolution);
    }

    @PostMapping
    public EvolutionEntity addEvolution(@RequestBody EvolutionEntity evolution) {
        return evolutionService.addEvolution(evolution);
    }

    @PutMapping("/{id}")
    public EvolutionEntity updateEvolution(@PathVariable Long idEvolution, @RequestBody EvolutionEntity updatedEvolution) {
        return evolutionService.updateEvolution(idEvolution, updatedEvolution);
    }

    @DeleteMapping("/{id}")
    public void deleteEvolution(@PathVariable Long idEvolution) {
        evolutionService.deleteEvolution(idEvolution);
    }
}
