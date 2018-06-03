package com.heliolima.cursomc;

import com.heliolima.cursomc.domain.Categoria;
import com.heliolima.cursomc.repositories.CategoriaRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public static void main(String[] args) {
            SpringApplication.run(CursomcApplication.class, args);
    }

    //Gerando dados    
    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");
        
        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
    }
}
