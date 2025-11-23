package org.telusko;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name="alien_table")
public class Alien {
    @Id
    private int aid;
//    @Column(name="alien_name")
    private String aName;
//    @Transient // To remove this column from database and only keep it in code.
    private String tech;

    //when ever collection is used inside a entity hiberanate will by default use LAZY fetch instead of EAGER
    // means it will only query the table it needed
    // it queries all the data for the table with inner join only when called up on in print or used anywhere

    @OneToMany(fetch = FetchType.LAZY)
    private List<Laptop> laptops;
    // one alien can have many laptops



    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
