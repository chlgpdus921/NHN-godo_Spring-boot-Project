package com.example.mreview.repository;

import com.example.mreview.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;

public interface MovieRepository extends JpaRepository<Movie, Long> {



}
