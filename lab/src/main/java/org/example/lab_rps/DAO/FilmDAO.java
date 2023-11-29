package org.example.lab_rps.DAO;
import org.example.lab_rps.model.Film;

import java.util.List;

public interface FilmDAO {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
