package com.iset.web;

import com.iset.dao.OffreRepository;

import com.iset.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository offreRepository;

    @GetMapping
    public List<Offre> getAll() {

        return offreRepository.findAll();

    }
    @GetMapping("/{id}")
    public Offre getbyid(@PathVariable Long id ) {
        return offreRepository.findById(id).get();
    }
    @PostMapping
    public Offre saveoffre(@RequestBody Offre newoffre) {
        return offreRepository.save(newoffre);
    }
    @DeleteMapping("/{id}")
    public void deleteoffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
    }
}
