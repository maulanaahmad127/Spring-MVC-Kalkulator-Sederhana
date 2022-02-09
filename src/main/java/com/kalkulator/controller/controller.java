package com.kalkulator.controller;

import com.kalkulator.model.NumberKalku;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    
    @GetMapping
    public String home(Model model){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", new NumberKalku());
        return "index";
    }
    @PostMapping("/reset")
    public String reset(Model model){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", new NumberKalku());
        return "redirect:/";
    }

    @PostMapping("/add")
    public String tambah(Model model, NumberKalku number){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", number);
        model.addAttribute("result", number.sum());
        return "index";
    }

    @PostMapping("/sub")
    public String kurang(Model model, NumberKalku number){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", number);
        model.addAttribute("result", number.sub());
        return "index";
    }

    @PostMapping("/mul")
    public String kali(Model model, NumberKalku number){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", number);
        model.addAttribute("result", number.mul());
        return "index";
    }

    @PostMapping("/div")
    public String bagi(Model model, NumberKalku number){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", number);
        if(number.getNum2() == 0){
            model.addAttribute("result", "pembagian tidak bisa dilakukan");
        }else{
            model.addAttribute("result", number.div());
        }
        
        return "index";
    }

    
}
