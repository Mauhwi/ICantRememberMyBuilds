package com.mauhwi.icantremembermybuilds.model;

import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;

@Entity
@Table(name = "_Character")
public class Esochar {
    @Id
    @Column(name = "Char_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Image_path")
    private String imagePath;

    @Column(name = "Char_name")
    private String name;

    @Column(name = "Char_class")
    @Enumerated(EnumType.STRING)
    private Classes charClass;

    //----------------------------------------Stats----------------------------------------
    @Column(name = "HP")
    private int hp;

    @Column(name = "MP")
    private int mp;

    @Column(name = "SP")
    private int sp;

    //----------------------------------------Armor----------------------------------------
    @OneToOne
    @JoinColumn(name = "_Head", referencedColumnName = "Armor_id")
    private Esoarmor headSlot;

    @OneToOne
    @JoinColumn(name = "_Shoulders", referencedColumnName = "Armor_id ")
    private Esoarmor shoulderSlot;

    @OneToOne
    @JoinColumn(name = "_Body", referencedColumnName = "Armor_id")
    private Esoarmor bodySlot;

    @OneToOne
    @JoinColumn(name = "_Waist", referencedColumnName = "Armor_id")
    private Esoarmor waistSlot;

    @OneToOne
    @JoinColumn(name = "_Hands", referencedColumnName = "Armor_id")
    private Esoarmor handSlot;

    @OneToOne
    @JoinColumn(name = "_Legs", referencedColumnName = "Armor_id")
    private Esoarmor legSlot;

    //----------------------------------------Weapons---------------------------------------
    @OneToOne
    @JoinColumn(name = "Weapon1", referencedColumnName = "Weapon_id")
    private Esoweapon weapon1;

    @OneToOne
    @JoinColumn(name = "Weapon2", referencedColumnName = "Weapon_id")
    private Esoweapon weapon2;

    //----------------------------------------Jewelry---------------------------------------
    @OneToOne
    @JoinColumn(name = "Left_Ring", referencedColumnName = "Armor_id")
    private Esoarmor leftRing;

    @OneToOne
    @JoinColumn(name = "Right_Ring", referencedColumnName = "Armor_id")
    private Esoarmor rightRing;

    @OneToOne
    @JoinColumn(name = "_Neck", referencedColumnName = "Armor_id")
    private Esoarmor neck;

    //---------------------------------------Skills----------------------------------------

    //TODO

    //-----------------------------------------CP-----------------------------------------
    //TODO

    //-------------------------------------Constructor-------------------------------------
    public Esochar(String name, Classes charClass, String imagePath) {
        this.name = name;
        this.charClass = charClass;
        this.imagePath = imagePath;
    }

    public Esochar() {
    }
    //-------------------------getter setters--------------------------------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes getCharClass() {
        return charClass;
    }

    public void setCharClass(Classes charClass) {
        this.charClass = charClass;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public Esoarmor getHeadSlot() {
        return headSlot;
    }

    public void setHeadSlot(Esoarmor headSlot) {
        this.headSlot = headSlot;
    }

    public Esoarmor getShoulderSlot() {
        return shoulderSlot;
    }

    public void setShoulderSlot(Esoarmor shoulderSlot) {
        this.shoulderSlot = shoulderSlot;
    }

    public Esoarmor getBodySlot() {
        return bodySlot;
    }

    public void setBodySlot(Esoarmor bodySlot) {
        this.bodySlot = bodySlot;
    }

    public Esoarmor getWaistSlot() {
        return waistSlot;
    }

    public void setWaistSlot(Esoarmor waistSlot) {
        this.waistSlot = waistSlot;
    }

    public Esoarmor getHandSlot() {
        return handSlot;
    }

    public void setHandSlot(Esoarmor handSlot) {
        this.handSlot = handSlot;
    }

    public Esoarmor getLegSlot() {
        return legSlot;
    }

    public void setLegSlot(Esoarmor legSlot) {
        this.legSlot = legSlot;
    }

    public Esoweapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Esoweapon weapon1) {
        this.weapon1 = weapon1;
    }

    public Esoweapon getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(Esoweapon weapon2) {
        this.weapon2 = weapon2;
    }

    public Esoarmor getLeftRing() {
        return leftRing;
    }

    public void setLeftRing(Esoarmor leftRing) {
        this.leftRing = leftRing;
    }

    public Esoarmor getRightRing() {
        return rightRing;
    }

    public void setRightRing(Esoarmor rightRing) {
        this.rightRing = rightRing;
    }

    public Esoarmor getNeck() {
        return neck;
    }

    public void setNeck(Esoarmor neck) {
        this.neck = neck;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}