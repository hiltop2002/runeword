package com.fun.ben.runeword.pojo;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"previous", "next"})
public class Rune extends RepresentationModel<Rune>{
    
    int id;
    //name of rune
    String name;

    //min level required
    int level;

    //previous level of this rune
    Rune previous;

    //what can be upgraded into using cube
    Rune next;

    //img file name
    String img;

    //simple description
    String description;

    //used in runewords
    Runeword[] containedRuneword;

    //single rune effect on weapon
    String effect_weapon;

    //single effect on armor
    String effect_armor;

    //single effect on helmet
    String effect_helmet;

    //single rune effect on shield
    String effect_shield;
    
    //what extra gem needed for upgrade to next
    String cubed_into_material;

    //number of runes needed to upgrade to next
    int cubed_into_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Rune getPrevious() {
        return previous;
    }

    public void setPrevious(Rune previous) {
        this.previous = previous;
    }

    public Rune getNext() {
        return next;
    }

    public void setNext(Rune next) {
        this.next = next;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Runeword[] getContainedRuneword() {
        return containedRuneword;
    }

    public void setContainedRuneword(Runeword[] containedRuneword) {
        this.containedRuneword = containedRuneword;
    }

    public String getEffect_weapon() {
        return effect_weapon;
    }

    public void setEffect_weapon(String effect_weapon) {
        this.effect_weapon = effect_weapon;
    }

    public String getEffect_armor() {
        return effect_armor;
    }

    public void setEffect_armor(String effect_armor) {
        this.effect_armor = effect_armor;
    }

    public String getEffect_helmet() {
        return effect_helmet;
    }

    public void setEffect_helmet(String effect_helmet) {
        this.effect_helmet = effect_helmet;
    }

    public String getEffect_shield() {
        return effect_shield;
    }

    public void setEffect_shield(String effect_shield) {
        this.effect_shield = effect_shield;
    }

    public String getCubed_into_material() {
        return cubed_into_material;
    }

    public void setCubed_into_material(String cubed_into_material) {
        this.cubed_into_material = cubed_into_material;
    }

    public int getCubed_into_count() {
        return cubed_into_count;
    }

    public void setCubed_into_count(int cubed_into_count) {
        this.cubed_into_count = cubed_into_count;
    }
    
    public String display()
    {
    	String o = "";
    	
    	o += this.name + " " + this.id + "\n";
    	o += "Weapon: " + this.effect_weapon+ "\n";
    	o += "Armor: " + this.effect_armor+ "\n";
    	o += "Helm: " + this.effect_helmet+ "\n";
    	o += "Shield: " + this.effect_shield+ "\n";
    	o += "cLvl Required: " + this.level+ "\n";
    	o += this.getDescription()+ "\n";
    	o += "\n";
     	return o;
    }
    
    public String display_h()
    {
    	String o = "";
    	
    	o += this.name + " " + this.id + "<br/>";
    	o += "Weapon: " + this.effect_weapon+ "<br/>";
    	o += "Armor: " + this.effect_armor+ "<br/>";
    	o += "Helm: " + this.effect_helmet+ "<br/>";
    	o += "Shield: " + this.effect_shield+ "<br/>";
    	o += "cLvl Required: " + this.level+ "<br/>";
    	o += this.getDescription()+ "<br/>";
    	o += "<br/>";
     	return o;
    }

}
