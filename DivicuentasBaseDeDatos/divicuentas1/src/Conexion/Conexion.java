/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author CrookedSpecs
 */
public class Conexion {
    private static Conexion instancia = new Conexion ();
    private EntityManagerFactory fabrica;
    
    public Conexion()
    {
        fabrica=Persistence.createEntityManagerFactory("divicuentas1PU");
    }        

    public static Conexion getInstancia() {
        return instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }
    
}
   
