package com.mauhwi.icantremembermybuilds.model;

import java.util.stream.Stream;

public enum Classes {
    Nightblade("resources/images/nightblade_icon.png"), Necromancer("resources/images/necromancer_icon.png"),
    Templar("resources/images/templar_icon.png"), Dragonknight("resources/images/dragonknight_icon.png");

    public final String imagePath;

    Classes(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public static Stream<Classes> stream() {
        return Stream.of(Classes.values());
    }
}
