package org.example.lab_rps.service;

import org.example.lab_rps.DAO.FilmDAO;
import org.example.lab_rps.DAO.FilmDAOImpl;
import org.example.lab_rps.model.Film;



import java.util.List;
public class FilmServiceImpl implements FilmService{

    private FilmDAO filmDAO = new FilmDAOImpl();

    @Override
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Override
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
    
}
