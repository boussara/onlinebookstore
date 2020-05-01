package com.sim.onlinebookstore.repository;

import com.sim.onlinebookstore.entite.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}