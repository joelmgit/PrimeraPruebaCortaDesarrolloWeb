/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Joel Mora
 */
@Entity
@Table(name="concert")
public class Concert implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="artist_id")
    private Artist artist;
    
    @ManyToOne
    @JoinColumn(name="place_id")
    private Place place;
    
    private String name;
    private Date setting;
    private double entrance_fee;
    private int max_aphorism;
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSetting() {
        return setting;
    }

    public void setSetting(Date setting) {
        this.setting = setting;
    }

    public double getEntrance_fee() {
        return entrance_fee;
    }

    public void setEntrance_fee(double entrance_fee) {
        this.entrance_fee = entrance_fee;
    }

    public int getMax_aphorism() {
        return max_aphorism;
    }

    public void setMax_aphorism(int max_aphorism) {
        this.max_aphorism = max_aphorism;
    }

    
    
    
    
}
