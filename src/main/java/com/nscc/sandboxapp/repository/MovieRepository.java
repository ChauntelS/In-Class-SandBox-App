package com.nscc.sandboxapp.repository;

import com.nscc.sandboxapp.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<> specify the Entity and type for the ID
public interface MovieRepository extends JpaRepository<Movie, Long> { }