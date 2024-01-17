package com.example.beautyprojectback.repositories;

import com.example.beautyprojectback.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryReposirotory extends JpaRepository<Category,Long> {

}
