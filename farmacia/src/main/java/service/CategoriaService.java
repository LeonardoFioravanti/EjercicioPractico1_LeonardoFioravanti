package service;


import farmacia.domain.Categoria;

import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
 
}