package ua.yaremenko.songratingsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "song")//,  uniqueConstraints = { @UniqueConstraint(columnNames = { "title", "artist_id" }) })
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String album;
    private String genre;
    private Integer rate = 0;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Song() {
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

}
