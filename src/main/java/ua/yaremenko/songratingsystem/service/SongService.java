package ua.yaremenko.songratingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.entity.Song;
import ua.yaremenko.songratingsystem.exception.ArtistNotFoundException;
import ua.yaremenko.songratingsystem.exception.SongAlreadyExistsException;
import ua.yaremenko.songratingsystem.exception.SongNotFoundException;
import ua.yaremenko.songratingsystem.model.SongModel;
import ua.yaremenko.songratingsystem.repository.ArtistRepository;
import ua.yaremenko.songratingsystem.repository.SongRepository;

import java.util.List;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private ArtistRepository artistRepository;

//    public Song addSong(Song song, Long artist_id) throws ArtistNotFoundException {
//        Artist artist = artistRepository.findById(artist_id).get();
//        if (artist != null) {
//            song.setArtist(artist);
//            return songRepository.save(song);
//        }
//        throw new ArtistNotFoundException("Artist not found");
//    }

    public Song addSong(Song song, String name) throws ArtistNotFoundException {
        Artist artist = artistRepository.findByName(name);
        if (artist == null) {
            throw new ArtistNotFoundException("Artist with name " + name + " not found.");
        }
        song.setArtist(artist);
        return songRepository.save(song);
    }

    public List<Song> listAllSongs(String keyword) {
        if(keyword == null){
            return songRepository.findAll();
        }
        return songRepository.search(keyword);
    }


    public void deleteSong(Long id){
        songRepository.deleteById(id);
    }

    public Song get(long id) {
        return songRepository.findById(id).get();
    }

    public Song rateSong(Long id){
        Song song = songRepository.findById(id).get();
        int rate = song.getRate();
        rate++;
        song.setRate(rate);
        return songRepository.save(song);
    }

}
