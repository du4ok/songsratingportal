package ua.yaremenko.songratingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.yaremenko.songratingsystem.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Artist findByName(String name);
}
