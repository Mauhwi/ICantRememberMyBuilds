package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ESO Weapons")
public class Esoweapon extends EsoInventory {

    @Column(name = "Type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Esoweapon(String type, String name, String source) {
        this.type = type;
        this.name = name;
        this.source = source;
    }
}
