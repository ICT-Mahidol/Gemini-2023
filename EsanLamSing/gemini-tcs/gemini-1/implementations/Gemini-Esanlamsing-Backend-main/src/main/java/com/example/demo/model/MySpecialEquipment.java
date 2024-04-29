package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "special_equipment")
public class MySpecialEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long equipmentID;

    // Private instance variables
    private String equipmentName;
    private String ownerName;
    private Date installedDate;

    public MySpecialEquipment() {
    }
    

    // Constructor
    public MySpecialEquipment(String equipmentName, String ownerName, Date installedDate) {
        this.equipmentName = equipmentName;
        this.ownerName = ownerName;
        this.installedDate = installedDate;
    }

    // Getter method for equipmentName
    public String getEquipmentName() {
        return equipmentName;
    }

    // Setter method for equipmentName
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    // Getter method for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    // Setter method for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter method for installedDate
    public Date getInstalledDate() {
        return installedDate;
    }

    // Setter method for installedDate
    public void setInstalledDate(Date installedDate) {
        this.installedDate = installedDate;
    }

    @Override
    public String toString() {
        return "SpecialEquipment{" +
                "equipmentID=" + equipmentID +
                ", equipmentName='" + equipmentName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", installedDate=" + installedDate +
                '}';
    }
}