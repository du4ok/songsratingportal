package ua.yaremenko.songratingsystem.model;

import ua.yaremenko.songratingsystem.entity.Artist;

import java.util.List;
import java.util.stream.Collectors;

public class ArtistModel {
    private Long id;
    private String name;
    private List<SongModel> songs;


    public static ArtistModel toModel(Artist entity) {
        ArtistModel model = new ArtistModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
//        model.setSongs(entity.getSongs().stream().map(SongModel::toModel).collect(Collectors.toList()));
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SongModel> getSongs() {
        return songs;
    }

    public void setSongs(List<SongModel> songs) {
        this.songs = songs;
    }
}
