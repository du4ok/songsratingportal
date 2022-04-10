package ua.yaremenko.songratingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.yaremenko.songratingsystem.entity.Song;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    @Query("SELECT s FROM Song s WHERE CONCAT(s.title, ' ', s.album, ' ', s.genre) LIKE %?1%")
    public List<Song> search(String keyword);
}
