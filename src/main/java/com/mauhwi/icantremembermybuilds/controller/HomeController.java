package com.mauhwi.icantremembermybuilds.controller;

import com.mauhwi.icantremembermybuilds.model.Classes;
import com.mauhwi.icantremembermybuilds.model.Esoarmor;
import com.mauhwi.icantremembermybuilds.model.Esochar;
import com.mauhwi.icantremembermybuilds.model.Esoweapon;
import com.mauhwi.icantremembermybuilds.repo.ArmorRepository;
import com.mauhwi.icantremembermybuilds.repo.CharRepository;
import com.mauhwi.icantremembermybuilds.repo.WeaponsRepository;
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

    @Autowired
    ArmorRepository armorRepository;

    @Autowired
    WeaponsRepository weaponsRepository;

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
            Esochar newchar = new Esochar("Mistakes Happen", Classes.Nightblade, "Fail.png");
            charRepository.save(newchar);
        }
        return "redirect:/";
    }

    @PostMapping("/additems")
    public String addItems(@RequestParam String setName, @RequestParam String source, Model model) {
        Esoarmor headSlot = new Esoarmor(setName + " Head", "headSlot", source);
        Esoarmor shoulderSlot = new Esoarmor(setName + " Shoulders", "shoulderSlot", source);
        Esoarmor bodySlot = new Esoarmor(setName + " Body", "bodySlot", source);
        Esoarmor waistSlot = new Esoarmor(setName + " Waist", "waistSlot", source);
        Esoarmor handSlot = new Esoarmor(setName + " Hands", "handSlot", source);
        Esoarmor legSlot = new Esoarmor(setName + " Legs", "legSlot", source);
        Esoarmor bootsSlot = new Esoarmor(setName + " Boots", "bootsSlot", source);
        Esoarmor ring = new Esoarmor(setName + " Ring", "ringSlot", source);
        Esoarmor neck = new Esoarmor(setName + " Necklace", "neckSlot", source);

        List<Esoarmor> esoarmorList = Stream.of(headSlot, shoulderSlot, bodySlot, waistSlot,
                handSlot, legSlot, bootsSlot, ring, neck)
                .collect(Collectors.toList());
        armorRepository.saveAll(esoarmorList);

        Esoweapon dagger = new Esoweapon(setName + " Dagger", "1H", source);
        Esoweapon bow = new Esoweapon(setName + " Bow", "2H", source);
        Esoweapon sword = new Esoweapon(setName + " Sword", "1H", source);
        Esoweapon firestaff = new Esoweapon(setName + " Fire Staff", "2H", source);
        Esoweapon lightningstaff = new Esoweapon(setName + " Lightning Staff", "2H", source);
        Esoweapon froststaff = new Esoweapon(setName + " Frost Staff", "2H", source);
        Esoweapon shield = new Esoweapon(setName + " Shield", "1H", source);
        Esoweapon greatsword = new Esoweapon(setName + " Greatsword", "2H", source);

        List<Esoweapon> esoweaponList = Stream.of(dagger, bow, sword, firestaff, lightningstaff,
                froststaff, shield, greatsword)
                .collect(Collectors.toList());
        weaponsRepository.saveAll(esoweaponList);

        return "redirect:/";
    }
}
