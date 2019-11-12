
package com.example.servicio_hojadv;

import java.util.List;

/**
 *
 * @author Felipe Correa
 */
public interface PersonaService {
   //Aquí colocare todos los métdos a utilizar
    List<Persona>listar();
    Persona listarId(int id);
    Persona crear(Persona p);
    Persona editar(Persona p);
    Persona eliminar(Persona p);
    
}
