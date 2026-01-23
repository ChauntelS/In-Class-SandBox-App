package com.nscc.sandboxapp.service;

import com.nscc.sandboxapp.entity.Movie;
import com.nscc.sandboxapp.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;

    //Constructor
    // Inject the repository into this class
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {

        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {

        return movieRepository.findById(id);
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
