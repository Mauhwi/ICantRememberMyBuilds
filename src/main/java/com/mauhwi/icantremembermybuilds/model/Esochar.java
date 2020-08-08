package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.*;

@Entity
@Table(name = "ESO character")
public class Esochar {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name = "Class")
    @Enumerated(EnumType.STRING)
    private Classes charClass;

    //----------------------------------------Stats----------------------------------------
    @Column(name="HP")
    private int hp;

    @Column(name="MP")
    private int mp;

    @Column(name="SP")
    private int sp;

    //----------------------------------------Armor----------------------------------------
    @Column(name="Head")
    private int headSlot;

    @Column(name="Shoulders")
    private int shoulderSlot;

    @Column(name="Body")
    private int bodySlot;

    @Column(name = "Waist")
    private int waistSlot;

    @Column(name="Hands")
    private int handSlot;

    @Column(name="Legs")
    private int legSlot;

    //----------------------------------------Weapons---------------------------------------

    @Column(name="Weapon I")
    private int weapon1;

    @Column(name="Weapon II")
    private int weapon2;

    //----------------------------------------Jewelry---------------------------------------
    @Column(name = "Left ring")
    private int leftRing;

    @Column(name = "Right ring")
    private int rightRing;

    @Column(name = "Neck")
    private int neck;

    //---------------------------------------Skills----------------------------------------
    @Column(name="Skill 1")
    private int skill1;

    @Column(name="Skill 2")
    private int skill2;

    @Column(name="Skill 3")
    private int skill3;

    @Column(name="Skill 4")
    private int skill4;

    @Column(name="Skill 5")
    private int skill5;

    @Column(name="Ultimate 1")
    private int ultimate1;

    @Column(name="Skill 6")
    private int skill6;

    @Column(name="Skill 7")
    private int skill7;

    @Column(name="Skill 8")
    private int skill8;

    @Column(name="Skill 9")
    private int skill9;

    @Column(name="Skill 10")
    private int skill10;

    @Column(name="Ultimate 2")
    private int ultimate2;

    //-----------------------------------------CP-----------------------------------------
    // Warrior:
    @Column(name="Quick Recovery")
    private int quickRecovery;
    @Column(name="Heavy Armor Focus")
    private int heavyArmorFocus;
    @Column(name="Bastion")
    private int bastion;
    @Column(name="Expert Defender")
    private int expertDefender;
    @Column(name="Thick Skinned")
    private int thickSkinned;
    @Column(name="Elemental Defender")
    private int elementalDefender;
    @Column(name="Light Armor Focus")
    private int lightArmorFocus;
    @Column(name="Hardy")
    private int hardy;
    @Column(name="Medium Armor Focus")
    private int mediumArmorFocus;
    @Column(name="Resistant")
    private int resistant;
    @Column(name="Spell Shield")
    private int spellShield;
    @Column(name="Iron Clad")
    private int ironClad;

    //The Thief:
    @Column(name="Siphoner")
    private int siphoner;
    @Column(name="Sprinter")
    private int sprinter;
    @Column(name="Bashing Focus")
    private int bashingFocus;
    @Column(name="Warlord")
    private int warlord;
    @Column(name="Healthy")
    private int healthy;
    @Column(name="Mooncalf")
    private int mooncalf;
    @Column(name="Arcanist")
    private int arcanist;
    @Column(name="Tenacity")
    private int tenacity;
    @Column(name="Tumbling")
    private int tumbling;
    @Column(name="Befoul")
    private int befoul;
    @Column(name="Shadow Ward")
    private int shadowWard;
    @Column(name="Shade")
    private int shade;

    //The Mage:
    @Column(name="Precise Strikes")
    private int preciseStrikes;
    @Column(name="Piercing")
    private int piercing;
    @Column(name="Thaumaturge")
    private int thaumaturge;
    @Column(name="Mighty")
    private int mighty;
    @Column(name="Elemental Expert")
    private int elementalExpert;
    @Column(name="Blessed")
    private int blessed;
    @Column(name="Elfborn")
    private int elfborn;
    @Column(name="Spell Erosion")
    private int spellErosion;
    @Column(name="Shattering Blows")
    private int shatteringBlows;
    @Column(name="Master At Arms")
    private int masterAtArms;
    @Column(name="Physical Weapons Expert")
    private int physicalWeaponsExpert;
    @Column(name="Staff Expert")
    private int staffExpert;

    //-------------------------------------Constructor-------------------------------------
    public Esochar(String name, Classes charClass) {
        this.name = name;
        this.charClass = charClass;
    }

    //---------------------------------------Getters---------------------------------------
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getSp() {
        return sp;
    }

    public int getHeadSlot() {
        return headSlot;
    }

    public int getShoulderSlot() {
        return shoulderSlot;
    }

    public int getBodySlot() {
        return bodySlot;
    }

    public int getWaistSlot() {
        return waistSlot;
    }

    public int getHandSlot() {
        return handSlot;
    }

    public int getLegSlot() {
        return legSlot;
    }

    public int getWeapon1() {
        return weapon1;
    }

    public int getWeapon2() {
        return weapon2;
    }

    public int getLeftRing() {
        return leftRing;
    }

    public int getRightRing() {
        return rightRing;
    }

    public int getNeck() {
        return neck;
    }

    public int getSkill1() {
        return skill1;
    }

    public int getSkill2() {
        return skill2;
    }

    public int getSkill3() {
        return skill3;
    }

    public int getSkill4() {
        return skill4;
    }

    public int getSkill5() {
        return skill5;
    }

    public int getUltimate1() {
        return ultimate1;
    }

    public int getSkill6() {
        return skill6;
    }

    public int getSkill7() {
        return skill7;
    }

    public int getSkill8() {
        return skill8;
    }

    public int getSkill9() {
        return skill9;
    }

    public int getSkill10() {
        return skill10;
    }

    public int getUltimate2() {
        return ultimate2;
    }

    public Classes getCharClass() {
        return charClass;
    }

    //---------------------------------------Setters---------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void setHeadSlot(int headSlot) {
        this.headSlot = headSlot;
    }

    public void setShoulderSlot(int shoulderSlot) {
        this.shoulderSlot = shoulderSlot;
    }

    public void setBodySlot(int bodySlot) {
        this.bodySlot = bodySlot;
    }

    public void setWaistSlot(int waistSlot) {
        this.waistSlot = waistSlot;
    }

    public void setHandSlot(int handSlot) {
        this.handSlot = handSlot;
    }

    public void setLegSlot(int legSlot) {
        this.legSlot = legSlot;
    }

    public void setLeftRing(int leftRing) {
        this.leftRing = leftRing;
    }

    public void setRightRing(int rightRing) {
        this.rightRing = rightRing;
    }

    public void setNeck(int neck) {
        this.neck = neck;
    }

    public void setWeapon1(int weapon1) {
        this.weapon1 = weapon1;
    }

    public void setWeapon2(int weapon2) {
        this.weapon2 = weapon2;
    }

    public void setSkill1(int skill1) {
        this.skill1 = skill1;
    }

    public void setSkill2(int skill2) {
        this.skill2 = skill2;
    }

    public void setSkill3(int skill3) {
        this.skill3 = skill3;
    }

    public void setSkill4(int skill4) {
        this.skill4 = skill4;
    }

    public void setSkill5(int skill5) {
        this.skill5 = skill5;
    }

    public void setUltimate1(int ultimate1) {
        this.ultimate1 = ultimate1;
    }

    public void setSkill6(int skill6) {
        this.skill6 = skill6;
    }

    public void setSkill7(int skill7) {
        this.skill7 = skill7;
    }

    public void setSkill8(int skill8) {
        this.skill8 = skill8;
    }

    public void setSkill9(int skill9) {
        this.skill9 = skill9;
    }

    public void setSkill10(int skill10) {
        this.skill10 = skill10;
    }

    public void setUltimate2(int ultimate2) {
        this.ultimate2 = ultimate2;
    }

    public void setCharClass(Classes charClass) {
        this.charClass = charClass;
    }
}
