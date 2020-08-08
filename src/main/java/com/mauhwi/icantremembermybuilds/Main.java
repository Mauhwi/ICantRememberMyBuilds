package com.mauhwi.icantremembermybuilds;

import com.mauhwi.icantremembermybuilds.model.Classes;
import com.mauhwi.icantremembermybuilds.model.Esochar;

public class Main {
    public static void main(String[] args) {
        Esochar firstchar = new Esochar("Ash Maire", Classes.Nightblade);
        System.out.println(firstchar.getCharClass() + " " + firstchar.getCharClass().getImagePath());
    }
}
