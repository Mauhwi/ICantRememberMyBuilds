package com.mauhwi.icantremembermybuilds.controller;

import com.mauhwi.icantremembermybuilds.model.Classes;
import com.mauhwi.icantremembermybuilds.model.Esochar;
import com.mauhwi.icantremembermybuilds.repo.CharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class HomeController {
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

    @PostMapping("/")
    public String addNewChar(@RequestParam String name, @RequestParam String charClass, @RequestParam String imagePath, Model model) {
        Classes inputClass;
        List<Classes> classes = Stream.of(Classes.values())
                .collect(Collectors.toList());
        Optional<Classes> result = classes.stream().filter(e -> e.name().equals(charClass)).findFirst();
        if (result.isPresent()) {
            inputClass  = result.get();
            Esochar newchar = new Esochar(name, inputClass, imagePath);
            charRepository.save(newchar);
        } else {
            Esochar newchar = new Esochar("Mistakes Happen", Classes.Nightblade, "Yeah");
            charRepository.save(newchar);
        }
        return "redirect:/";
    }
}
