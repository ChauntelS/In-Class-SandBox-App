package com.nscc.sandboxapp.controller;

import com.nscc.sandboxapp.entity.Movie;
import com.nscc.sandboxapp.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    //Constructor
    // Inject the repository into this class
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // GET request - /movies
    @GetMapping("/")
    public List<Movie> GetAllMovies(){
        return movieService.getAllMovies();
        // get all movie records from database
    }

    //GET request - /movies/5
    @GetMapping("/{id}")
    public Movie GetMovieById(@PathVariable long id){
        // Optional<Movie> allows us to throw an exception not found

        return movieService.getMovieById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        // get movie in database with pk = id
    }

    //POST request - /movies/add
    @PostMapping("/")
    public String AddNewMovie(){
        // add new movie in database
        return "Add new movie";
    }
}
