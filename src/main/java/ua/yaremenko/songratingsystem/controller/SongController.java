package ua.yaremenko.songratingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.entity.Song;
import ua.yaremenko.songratingsystem.exception.ArtistNotFoundException;
import ua.yaremenko.songratingsystem.exception.SongAlreadyExistsException;
import ua.yaremenko.songratingsystem.exception.SongNotFoundException;
import ua.yaremenko.songratingsystem.service.ArtistService;
import ua.yaremenko.songratingsystem.service.SongService;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongService songService;
    @Autowired
    ArtistService artistService;

//    @PostMapping
//    public ResponseEntity addSong(@RequestBody Song song, @RequestParam Long artist_id){
//        try {
//            songService.addSong(song, artist_id);
//            return ResponseEntity.ok("Song has been added successfully!");
//        } catch (SongAlreadyExistsException e){
//            return ResponseEntity.badRequest().body(e.getMessage());
//        } catch (Exception e){
//            return ResponseEntity.badRequest().body("Unexpected exception");
//        }
//    }


    @RequestMapping
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Song> songs = songService.listAllSongs(keyword);
        model.addAttribute("songs", songs);
        model.addAttribute("keyword", keyword);
        return "songs";
    }

    @RequestMapping("/new")
    public String showNewSongPage(Model model, Long artist_id) {
        Song song = new Song();
        Artist artist = new Artist();
        model.addAttribute("song", song);
        model.addAttribute("artist", artist_id);
        return "new_song";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addSong(@ModelAttribute("song") Song song) {
        try {
            songService.addSong(song, song.getArtist().getId());
        } catch (ArtistNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getMessage();
        }
        return "redirect:/songs";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditSongPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_song");
        Song song = songService.get(id);
        mav.addObject("song", song);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id){
        songService.deleteSong(id);
        return "redirect:/songs";
    }

    @RequestMapping("/rate/{id}")
    public String rateSong(@PathVariable Long id){
        songService.rateSong(id);
        return "redirect:/songs";
    }
//    @RequestMapping
//    public String getSongByTitle(Model model, @Param("title") String title){
//        List<Song> songs = songService.getSongByTitle(title);
//        model.addAttribute("songs",songs);
//        model.addAttribute("title", title);
//        return "index";
//    }

//

}
