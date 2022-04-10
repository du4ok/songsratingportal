package ua.yaremenko.songratingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.entity.Song;
import ua.yaremenko.songratingsystem.repository.ArtistRepository;
import ua.yaremenko.songratingsystem.repository.SongRepository;

@SpringBootApplication
public class SongratingsystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SongratingsystemApplication.class, args);
//        ArtistRepository artistRepository = configurableApplicationContext.getBean(ArtistRepository.class);
//        SongRepository songRepository = configurableApplicationContext.getBean(SongRepository.class);
//
//        Artist artist = new Artist();
//        artist.setCountry("England");
//        artist.setName("Pink Floyd");
//        artist.setYear("1970");
//		Song song = new Song();
//		song.setTitle("Dogs");
//		song.setAlbum("Animals");
//		song.setGenre("Psychedelic Rock");
//		song.setArtist(artist);
//		artistRepository.save(artist);
//		songRepository.save(song);

	}

}
