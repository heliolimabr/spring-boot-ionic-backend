
package com.heliolima.cursomc.repositories;

import com.heliolima.cursomc.domain.Categoria;
import com.heliolima.cursomc.domain.Produto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Helio Lima
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT obj "
            + "FROM Produto obj "
            + "INNER JOIN obj.categorias cat "
            + "WHERE "
                + "obj.nome LIKE %:nome% AND "
                + "cat in :categorias")
    Page<Produto> search(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);
    
    @Transactional(readOnly = true)
    Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);
    
}
