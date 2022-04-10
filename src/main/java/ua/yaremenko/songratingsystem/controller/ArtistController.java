package ua.yaremenko.songratingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.yaremenko.songratingsystem.entity.Artist;
import ua.yaremenko.songratingsystem.service.ArtistService;

import java.util.List;

@Controller
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @RequestMapping
    public String listArtists(Model model){
        List<Artist> artists = artistService.listArtists();
        model.addAttribute("artists", artists);
        return "artists";
    }

    @RequestMapping("/new")
    public String showNewArtistPage(Model model){
        Artist artist = new Artist();
        model.addAttribute("artist", artist);
        return "new_artist";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addSong(@ModelAttribute("artist") Artist artist) {
        artistService.addArtist(artist);
        return "redirect:/artists";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditArtistPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_artist");
        Artist artist = artistService.get(id);
        mav.addObject("artist", artist);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteArtist(@PathVariable Long id){
        artistService.deleteArtist(id);
        return "redirect:/artists";
    }
}
