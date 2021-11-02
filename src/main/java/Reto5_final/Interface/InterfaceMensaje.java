/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_final.Interface;

import Reto5_final.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Eloin Moreno
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
