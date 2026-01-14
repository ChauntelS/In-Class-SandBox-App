package com.nscc.sandboxapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    // GET request - /movies
    @GetMapping("/")
    public String GetAllMovies(){
        return "get all movies";
        // get all movie records from database
    }

    //GET request - /movies/5
    @GetMapping("/{id}")
    public String GetMovieById(@PathVariable int id){
        return "get movie by id" + id;
        // get movie in database with pk = id
    }

    //POST request - /movies/add
    @PostMapping("addnew")
    public void AddNewMovie(){
        // add new movie in database
    }
}
