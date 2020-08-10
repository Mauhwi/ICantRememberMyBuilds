package com.mauhwi.icantremembermybuilds.controller;

import com.mauhwi.icantremembermybuilds.model.Classes;
import com.mauhwi.icantremembermybuilds.model.Esochar;
import com.mauhwi.icantremembermybuilds.repo.CharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class CharactersController {
    @Autowired
    CharRepository charRepository;


    @GetMapping("/")
    public String home(Model model) {
        Iterable<Esochar> esochar = charRepository.findAll();
        model.addAttribute("esochar", esochar);
        List<String> classes = Stream.of(Classes.values())
                .map(Classes::name)
                .collect(Collectors.toList());
        model.addAttribute("classes", classes);
        return "home";
    }
}
