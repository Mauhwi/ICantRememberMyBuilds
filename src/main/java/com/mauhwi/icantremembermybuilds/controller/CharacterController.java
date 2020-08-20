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
import java.util.Optional;




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

    @PostMapping("/{id}/edit")
    public String characterEdit(@PathVariable(value = "id") Integer id, @RequestParam int hp, @RequestParam int mp, @RequestParam int sp,
                                @RequestParam Integer headSlot, @RequestParam Integer shoulderSlot, @RequestParam Integer bodySlot,
                                @RequestParam Integer waistSlot, @RequestParam Integer handSlot, @RequestParam Integer bootsSlot,
                                @RequestParam Integer legSlot, @RequestParam Integer leftRing, @RequestParam Integer rightRing,
                                @RequestParam Integer neckSlot, Model model) {
        Esochar esochar = charRepository.findById(id).orElseThrow(() -> new RuntimeException( "No character found" ));
        Esoarmor headSlot1 = armorRepository.findById(headSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor shoulderSlot1 = armorRepository.findById(shoulderSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor bodySlot1 = armorRepository.findById(bodySlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor handSlot1 = armorRepository.findById(handSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor waistSlot1 = armorRepository.findById(waistSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor legSlot1 = armorRepository.findById(legSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor bootsSlot1 = armorRepository.findById(bootsSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor leftRing1 = armorRepository.findById(leftRing).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor rightRing1 = armorRepository.findById(rightRing).orElseThrow(() -> new RuntimeException( "No armor found" ));
        Esoarmor neckSlot1 = armorRepository.findById(neckSlot).orElseThrow(() -> new RuntimeException( "No armor found" ));
        esochar.setAllGear(headSlot1, shoulderSlot1, bodySlot1, handSlot1, waistSlot1, legSlot1, bootsSlot1,leftRing1, rightRing1, neckSlot1);
        charRepository.save(esochar);
        return "redirect:/character/{id}";
    }

}
