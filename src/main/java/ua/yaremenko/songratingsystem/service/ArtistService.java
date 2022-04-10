package ua.yaremenko.songratingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.repository.ArtistRepository;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;


    public Artist addArtist(Artist artist){
        return artistRepository.save(artist);
    }

    public List<Artist> listArtists(){
        return artistRepository.findAll();
    }

    public Artist get(Long id){
        return artistRepository.findById(id).get();
    }

    public void deleteArtist(Long id){
        artistRepository.deleteById(id);
    }
}
