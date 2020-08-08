package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ESO Armor")
public class Esoarmor extends EsoInventory {

    @Column(name = "Slot")
    private String slot;

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Esoarmor(String slot, String name, String source) {
        this.slot = slot;
        this.name = name;
        this.source = source;
    }
}
