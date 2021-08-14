package org.factoriaf5.alumnas.services;


import org.factoriaf5.alumnas.models.Alumna;
import org.factoriaf5.alumnas.models.AlumnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnaService {

    private final AlumnaRepository alumnaRepository;

    @Autowired
    public AlumnaService(AlumnaRepository alumnaRepository) {
        this.alumnaRepository = alumnaRepository;
    }

    public List<Alumna> allAlumnas() {
        return (List<Alumna>) alumnaRepository.findAll();
    }

    public void save(Alumna alumna) {
        alumnaRepository.save(alumna);
    }

    public Alumna findById(Long id) {
        return alumnaRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        alumnaRepository.deleteById(id);
    }

}