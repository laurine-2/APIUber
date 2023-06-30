package com.laurine.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurine.uber.entity.EvolutionEntity;
import com.laurine.uber.repository.EvolutionRepository;

@Service
public class EvolutionService {
	private EvolutionRepository evolutionRepository;

    @Autowired
    public EvolutionService(EvolutionRepository evolutionRepository) {
        this.evolutionRepository = evolutionRepository;
    }

    public List<EvolutionEntity> getAllEvolutions() {
        return evolutionRepository.findAll();
    }

    public EvolutionEntity getEvolutionById(Long idEvolution) {
        return evolutionRepository.findById(idEvolution)
                .orElseThrow(() -> new RuntimeException("Evolution not found"));
    }

    public EvolutionEntity addEvolution(EvolutionEntity evolution) {
        return evolutionRepository.save(evolution);
    }

    public EvolutionEntity updateEvolution(Long idEvolution, EvolutionEntity updatedEvolution) {
    	EvolutionEntity existingEvolution = getEvolutionById(idEvolution);
        existingEvolution.setLongitude(updatedEvolution.getLongitude());
        existingEvolution.setLatitude(updatedEvolution.getLatitude());
        return evolutionRepository.save(existingEvolution);
    }

    public void deleteEvolution(Long idEvolution) {
        evolutionRepository.deleteById(idEvolution);
    }

}
