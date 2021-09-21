package com.example.filmLystAPI;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FilmController {

    public List<Film> filmList = new ArrayList<>();

    //Get Films
    @CrossOrigin(origins = "http://localhost:8080/films", allowedHeaders = "http://localhost:8080/films")
    @GetMapping("/films")
    public ResponseEntity<Film> getFilm() {
        return new ResponseEntity(filmList, HttpStatus.OK);
    }

    //Create
    @CrossOrigin(origins = "http://localhost:8080/film", allowedHeaders = "http://localhost:8080/film")
    @PostMapping("/film")
    public ResponseEntity<Film> createFilm(@RequestBody Film film) {
        if (film != null) {
            filmList.add(film);
            return ResponseEntity.status(HttpStatus.CREATED).body(film);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

// Respond

    @GetMapping("/film/{filmId}")
    public ResponseEntity getFilmId(@PathVariable int filmId) {
        try {
            Film film = this.filmList.get(filmId);
            return new ResponseEntity(film, HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//Update

//Delete
@CrossOrigin(origins = "http://localhost:8080/film/{filmId}", allowedHeaders = "http://localhost:8080/film{filmId}")
    @DeleteMapping("/film/{filmId}")
    public ResponseEntity<String> deleteFilm(@PathVariable int filmId) {

        Film searchedFilm = filmList
                .stream()
                .filter(film -> film.getFilmId() == (filmId))
                .findFirst().orElseThrow();

        for (int i = 0; i < filmList.size(); i++) {
            if (searchedFilm.getFilmId() == (filmList.get(i).getFilmId())) {
                filmList.remove(filmList.get(i));
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body("deleted film");
    }
}
