package org.example.lab_rps.service;
import org.example.lab_rps.model.Film;
import java.util.List;

public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
