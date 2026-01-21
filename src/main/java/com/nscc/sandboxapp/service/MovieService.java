package com.nscc.sandboxapp.service;
import com.nscc.sandboxapp.entity.Movie;

import java.util.List;
import java.util.Optional;

//Movie service has 3 methods: getAll, getById, createMovie
public interface MovieService {
    List<Movie> getAllMovies();

    // make the Movie optional or possible to be null
    Optional<Movie> getMovieById(Long id);

    Movie createMovie(Movie movie);
}
