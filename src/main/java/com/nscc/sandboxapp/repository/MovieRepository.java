package com.nscc.sandboxapp.repository;

import com.nscc.sandboxapp.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> { }