package com.kakure.kakureanime.service;

import com.kakure.kakureanime.model.Movie;
import com.kakure.kakureanime.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    public Optional<Movie> getMovieById(String id) {
        return repository.findById(id);
    }

    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }

    public Movie updateMovie(String id, Movie updatedMovie) {
        updatedMovie.setId(id);
        return repository.save(updatedMovie);
    }

    public void deleteMovie(String id) {
        repository.deleteById(id);
    }
}