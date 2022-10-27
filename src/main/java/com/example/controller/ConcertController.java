package com.example.controller;

import com.example.entity.Artist;
import com.example.entity.Concert;
import com.example.entity.Place;
import com.example.service.IArtistService;
import com.example.service.IConcertService;
import com.example.service.IPlaceService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Joel Mora
 */
@Controller
public class ConcertController {
    
    @Autowired
    private IConcertService concertService;
    
    @Autowired
    private IPlaceService placeService;
    
    @Autowired
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
    public String saveConcert(@ModelAttribute Concert concert) throws Exception{
        concertService.saveConcert(concert);
        return "redirect:/events";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteConcert(@PathVariable("id") Long idConcert){
        concertService.deleteConcert(idConcert);
        return "redirect:/events";
    }
    
}
