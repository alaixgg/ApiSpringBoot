//Permite hacer DAL

package co.edu.utadeo.crud.crud.repositorio;

import org.springframework.data.jpa.repositorio.JpaRepository;

public interface IUserRepository extends JpaRepository (user, Long) {//implementar otra intefaz 

    user getByName(String name);//lo que vaya despues de getBY... es lo que va a ir a buscar
}
