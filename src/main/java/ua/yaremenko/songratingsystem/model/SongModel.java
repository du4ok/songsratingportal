package ua.yaremenko.songratingsystem.model;

import ua.yaremenko.songratingsystem.entity.Song;

public class SongModel {
    private Long id;
    private String title;
    private String album;
    private String genre;
    private Integer rate;


    public static SongModel toModel(Song song){
        SongModel model = new SongModel();
        model.setId(song.getId());
        model.setTitle(song.getTitle());
        model.setAlbum(song.getAlbum());
        model.setGenre(song.getGenre());
        model.setRate(song.getRate());
        return model;
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
