package proyecto.ramallo.hibernate.repositorio;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio <T> {
    List<T> listar();


    T porID(Long id);

    void guardar(T t);

    void modificar(T t);

    void eliminar(Long id) throws SQLException;
}
