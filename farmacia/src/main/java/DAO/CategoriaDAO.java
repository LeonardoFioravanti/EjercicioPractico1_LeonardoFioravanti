package DAO;


import farmacia.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository <Categoria,Long> {
    
}