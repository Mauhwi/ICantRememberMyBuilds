package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.*;

@Entity
@Table(name = "Armor")
public class Esoarmor extends EsoInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Armor_id")
    protected Integer id;

    @Column(name = "Slot")
    private String slot;

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Integer getId() {
        return id;
    }

    public Esoarmor(String name, String slot, String source) {
        this.name = name;
        this.slot = slot;
        this.source = source;
    }

    public Esoarmor() {}
}
