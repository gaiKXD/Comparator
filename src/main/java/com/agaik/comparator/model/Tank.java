package com.agaik.comparator.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String tier;
    private String type;
    private String nation;
    private int damage;
    private float reload;

    public Tank() {

    }


    public Tank(int id, String name, String tier, String type, String nation, int damage, float reload) {
        this.id = id;
        this.name = name;
        this.tier = tier;
        this.type = type;
        this.nation = nation;
        this.damage = damage;
        this.reload = reload;
    }

    public Tank(String name, String tier, String type, String nation, int damage, float reload) {
        this.name = name;
        this.tier = tier;
        this.type = type;
        this.nation = nation;
        this.damage = damage;
        this.reload = reload;
    }

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

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getReload() {
        return reload;
    }

    public void setReload(float reload) {
        this.reload = reload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return name.equals(tank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Tank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier='" + tier + '\'' +
                ", type='" + type + '\'' +
                ", nation='" + nation + '\'' +
                ", damage=" + damage +
                ", reload=" + reload +
                '}';
    }
}
