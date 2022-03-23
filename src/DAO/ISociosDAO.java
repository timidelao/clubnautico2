/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author lalo_
 */
public interface ISociosDAO {
    boolean agregar(Socio socio);
    List<Socio> consultarTodos();
    boolean actualizar(Socio socio);
    Socio consultar(int id);
    boolean eliminar (int id);
    
}
