package org.factoriaf5.alumnas.controllers;


import org.factoriaf5.alumnas.models.Alumna;
import org.factoriaf5.alumnas.services.AlumnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class  AlumnasController {

    private AlumnaService alumnaService;

    @Autowired
    public AlumnasController(AlumnaService alumnaService) {
        this.alumnaService=alumnaService;
    }

    @GetMapping("/alumnas")
    String listAlumnas(Model model) {
        List<Alumna> alumnas;
          alumnas = (List<Alumna>) alumnaService.allAlumnas();
        model.addAttribute("nombre", "Alumna list");
        model.addAttribute("alumnas", alumnas);
        return "alumnas/all";
    }
}