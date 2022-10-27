/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.entity.Artist;
import com.example.entity.Concert;
import com.example.entity.Place;
import com.example.service.IArtistService;
import com.example.service.IConcertService;
import com.example.service.IPlaceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Joel Mora
 */
public class ConcertController {
    
    @Autowired
    private IConcertService concertService;
    private IPlaceService placeService;
    private IArtistService artistService;

    
    @GetMapping("/events")
    public String index(Model model){
        List<Concert> concertsList = concertService.getAllConcerts();        
        model.addAttribute("events", concertsList);        
        return "events";
    }
    
    @GetMapping("/add")
    public String addConcert(Model model){
        List<Place> placesList = placeService.getAllPlaces();
        List<Artist> artistsList = artistService.getAllArtists();

        model.addAttribute("concert", new Concert());
        model.addAttribute("places", placesList);
        model.addAttribute("artists", artistsList);

        return "add";
    }
    
    @PostMapping("/save")
    public String saveConcert(@ModelAttribute Concert concert){
        concertService.saveConcert(concert);
        return "redirect:/events";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteConcert(@PathVariable("id") Long idConcert){
        concertService.deleteConcert(idConcert);
        return "redirect:/events";
    }
    
}
