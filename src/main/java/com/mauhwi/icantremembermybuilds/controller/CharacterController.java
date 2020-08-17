package com.mauhwi.icantremembermybuilds.controller;

import com.mauhwi.icantremembermybuilds.model.Esoarmor;
import com.mauhwi.icantremembermybuilds.model.Esochar;
import com.mauhwi.icantremembermybuilds.repo.ArmorRepository;
import com.mauhwi.icantremembermybuilds.repo.CharRepository;
import com.mauhwi.icantremembermybuilds.repo.WeaponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Controller
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    CharRepository charRepository;

    @Autowired
    ArmorRepository armorRepository;

    @Autowired
    WeaponsRepository weaponsRepository;

    @GetMapping("/{id}")
    public String charDetails(@PathVariable(value = "id") Integer id, Model model) {
        if (!charRepository.existsById(id)) {
            return "redirect:/home";
        }
        Optional<Esochar> esochar = charRepository.findById(id);
        ArrayList<Esochar> res = new ArrayList<>();
        esochar.ifPresent(res::add);
        model.addAttribute("esochar", res);
        return "character";
    }

    @PostMapping("/{id}/delete")
    public String characterDelete(@PathVariable(value = "id") Integer id, Model model) {
        Esochar esochar = charRepository.findById(id).orElseThrow(() -> new RuntimeException( "No character found" ));
        charRepository.delete(esochar);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editChar(@PathVariable(value = "id") Integer id, Model model) {
        if (!charRepository.existsById(id)) {
            return "redirect:/home";
        }
        Optional<Esochar> esochar = charRepository.findById(id);
        ArrayList<Esochar> res = new ArrayList<>();
        esochar.ifPresent(res::add);
        model.addAttribute("esochar", res);

        model.addAttribute("headSlots", armorRepository.allHeadArmor());
        model.addAttribute("shoulderSlots", armorRepository.allShoulderArmor());
        model.addAttribute("handSlots", armorRepository.allHandArmor());
        model.addAttribute("bodySlots", armorRepository.allBodyArmor());
        model.addAttribute("bootsSlots", armorRepository.allBootsArmor());
        model.addAttribute("legSlots", armorRepository.allLegArmor());
        model.addAttribute("neckSlots", armorRepository.allNeckArmor());
        model.addAttribute("ringSlots", armorRepository.allRingArmor());
        model.addAttribute("waistSlots", armorRepository.allWaistArmor());
        return "character-edit";
    }

}
