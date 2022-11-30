/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;


import Modelo.Artist;
import Modelo.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manuel Martinez
 */
public class Mavenproject2 {
    
    public static final String PERSISTENCE_UNIT_NAME = "music";
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager manager = factory.createEntityManager();
        
        // Do something with the entity manager.
        Usuario amigo = manager.find(Usuario.class, 1L);
        System.out.println("artist = " + amigo);
        
        
        
        Usuario artista = new Usuario(123, "String name", "String nickname", "String pais", "String divisa", "String email", "String contrasena");
       
        manager.getTransaction().begin();
        manager.persist(artista);
        manager.getTransaction().commit();
         
        
    }
}
