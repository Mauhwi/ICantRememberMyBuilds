package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.*;

@Entity
@Table(name = "Weapons")
public class Esoweapon extends EsoInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Weapon_id")
    protected Integer id;

    @Column(name = "Type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Esoweapon() {}

    public Esoweapon(String name, String type, String source) {
        this.name = name;
        this.type = type;
        this.source = source;
    }

}
