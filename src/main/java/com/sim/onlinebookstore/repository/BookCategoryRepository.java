package com.sim.onlinebookstore.repository;

import com.sim.onlinebookstore.entite.BookCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
    
}