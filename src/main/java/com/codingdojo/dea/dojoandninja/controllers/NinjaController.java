package com.codingdojo.dea.dojoandninja.controllers;

import org.springframework.ui.Model;
import com.codingdojo.dea.dojoandninja.models.Dojo;
import com.codingdojo.dea.dojoandninja.models.Ninja;
import com.codingdojo.dea.dojoandninja.services.DojoService;
import com.codingdojo.dea.dojoandninja.services.NinjaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {
    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("allDojo", dojoService.allDojo());
        return "home";
    }

    @GetMapping("/ninja")
    public String createNinja(@ModelAttribute ("ninja") Ninja njinja, Model model){
        model.addAttribute("allDojo", dojoService.allDojo());
        return "newNinja";
    }

   @PostMapping("/ninja")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if (result.hasErrors()){
            return "newNinja";
        }
        ninjaService.createNinja(ninja);
   return "redirect:/";
   }
   @GetMapping("/dojo")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo){
        return "newDojo";
   }
   @PostMapping("/dojo")
    public String ncreateDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
        if (result.hasErrors()){
            return "newDojo";
        }
        dojoService.createDojo(dojo);
        return "redirect:/";
   }

   @GetMapping("/details/{id}")
    public String detailsDojo(@PathVariable Long id, Model model){
        model.addAttribute("dojo",dojoService.FindDojo(id));
        return "details";
   }
}
