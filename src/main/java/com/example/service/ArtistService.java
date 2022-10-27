/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Artist;
import com.example.repository.ArtistRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */

@Service
public class ArtistService implements IArtistService {
    
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public List<Artist> getAllArtists() {
        return (List<Artist>)artistRepository.findAll();        
    }

    @Override
    public Artist getArtistById(long id) {
        return artistRepository.findById(id).orElse(null);
    }
    
}
