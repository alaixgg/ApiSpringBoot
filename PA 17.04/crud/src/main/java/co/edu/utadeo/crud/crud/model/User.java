//CREACION DE BASE DE DATOS LOCAL

package co.edu.utadeo.crud.crud;

import jakarta.persistence.entity;
import jakarta.persistence.table;
import jakarta.persistence.Type;
import jakarta.persistence.id;


@entity //decorador 
@table (name= "users") //crea una tabla con el nombre "users"

public class User {
    @id 
    @GenerateValue (strategy =GenerateType.IDENTITY)   //secuencia del id
    private Long id;

    @Colum(nullable = false) //no permite que el dato sea nulo 

    private String name; 

    @Colum(unique = true, nullable = false) //indica que el email debe ser unico en la BD
    private String email;

    user(){}
    user(String name, String email){
        this.name = name;
        this.email =email;
    }

    // crear getter and setter
    //getter para traer, setter para actualizar 
}
