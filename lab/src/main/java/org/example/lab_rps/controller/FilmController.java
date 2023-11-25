package org.example.lab_rps.controller;
import org.example.lab_rps.model.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FilmController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("film", film);




        return modelAndView;


    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    private static Film film;

    static {
        film = new Film();
        film.setTitle("Inception".toString());
        film.setYear(2010);
        film.setGenre("sci-fi".toString());
        film.setWatched(true);
        //film.toString();
    }


}
