/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_final.Interface;

import Reto5_final.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Eloin Moreno
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
