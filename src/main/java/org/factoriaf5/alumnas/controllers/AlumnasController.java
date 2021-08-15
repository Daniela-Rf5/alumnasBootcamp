package org.factoriaf5.alumnas.controllers;


import org.factoriaf5.alumnas.models.Alumna;
import org.factoriaf5.alumnas.services.AlumnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/new")
    public String newAlumna(Model model){
        Alumna alumna = new Alumna();
        model.addAttribute("alumna", alumna);
        model.addAttribute("nombre", "Create new alumna");
        return "alumnas/new";
    }
    @GetMapping("alumnas/edit/{id}")
    public String editAlumna(Model model, @PathVariable Long id){
        Alumna alumna = alumnaService.findById(id);
        model.addAttribute("alumna", alumna);
        model.addAttribute("nombre", "editar alumna");
        return "alumnas/edit";
    }


    @PostMapping("/alumnas/new")
    String addAlumna(@ModelAttribute Alumna alumna){
        alumnaService.save(alumna);
        return "redirect:/alumnas";
    }
    @GetMapping("alumnas/eliminar/{id}")
    public String eliminarAlumna(Model model, @PathVariable Long id){
        Alumna alumna = alumnaService.findById(id);
        model.addAttribute("alumna", alumna);
        model.addAttribute("nombre", "eliminar alumna");
        return "redirect:/alumnas";
}}