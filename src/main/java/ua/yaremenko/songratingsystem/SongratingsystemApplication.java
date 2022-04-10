package ua.yaremenko.songratingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.entity.Song;
import ua.yaremenko.songratingsystem.exception.ArtistNotFoundException;
import ua.yaremenko.songratingsystem.repository.ArtistRepository;
import ua.yaremenko.songratingsystem.repository.SongRepository;
import ua.yaremenko.songratingsystem.service.ArtistService;
import ua.yaremenko.songratingsystem.service.SongService;

@SpringBootApplication
public class SongratingsystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SongratingsystemApplication.class, args);
//        ArtistRepository artistRepository = configurableApplicationContext.getBean(ArtistRepository.class);
//        SongRepository songRepository = configurableApplicationContext.getBean(SongRepository.class);
//        SongService songService = configurableApplicationContext.getBean(SongService.class);
//        ArtistService artistService = configurableApplicationContext.getBean(ArtistService.class);
//
//
//        Artist artist = new Artist();
//        artist.setCountry("England");
//        artist.setName("Pink Floyd");
//        artist.setYear("1970");
//        artistRepository.save(artist);

        //Artist artist2 = artistRepository.findByName("Pink Floyd");
        //System.out.println("artist2 ID: " + artist2.getId());
//        String name = "Pink Floyd";
//
//		Song song = new Song();
//		song.setTitle("Dogs");
//		song.setAlbum("Animals");
//		song.setGenre("Psychedelic Rock");
//
//
//		songService.addSong(song, name);


            //        public Song addSong(Song song, String name) throws ArtistNotFoundException {
//            Artist artist = artistRepository.findByName(name);
//            if (artist != null) {
//                song.setArtist(artist);
//                return songRepository.save(song);
//            }
//            throw new ArtistNotFoundException("Artist not found");
//        }

//        Artist artist1 = artistRepository.findByName(name);
//        System.out.println(artist1.getId() + " " +artist1.getName());
//        song.setArtist(artist1);
//        songRepository.save(song);


//        song.setArtist(artist);
//		songRepository.save(song);

	}

}
