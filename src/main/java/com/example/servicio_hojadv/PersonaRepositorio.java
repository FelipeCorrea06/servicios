
package com.example.servicio_hojadv;

import java.util.List;
import org.springframework.data.repository.Repository;



/**
 *
 * @author Felipe Correa
 */
public interface PersonaRepositorio extends Repository<Persona, Integer>{
     List<Persona>buscarTodo();
     Persona buscarUno(int id);
     Persona guardar(Persona p);
     void eliminar(Persona p);
}
