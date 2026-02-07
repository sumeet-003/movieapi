package com.example.movieapi.config;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private final MovieService movieService;

    public DataLoader(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostConstruct
    public void loadInitialData() {
        movieService.addMovie(
                new Movie(null, "Interstellar", "Christopher Nolan", 2014)
        );

        movieService.addMovie(
                new Movie(null, "Inception", "Christopher Nolan", 2010)
        );
    }
}
