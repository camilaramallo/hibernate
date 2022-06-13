package proyecto.ramallo.hibernate;

import proyecto.ramallo.hibernate.modelo.Producto;
import proyecto.ramallo.hibernate.repositorio.ProductoRepositorioImpl;
import proyecto.ramallo.hibernate.repositorio.Repositorio;
import proyecto.ramallo.hibernate.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploHibernateDelete {
    public static void main(String[] args) {
        try(Connection conexion = ConexionBaseDatos.getInstance();
        ){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== listar ============================");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo

            System.out.println("=============== obtener por id =======================");
            System.out.println(repositorio.porID(2L));

            System.out.println("=============== Eliminar producto==================");
            Producto producto = new Producto();
            producto.setId_prod(8L);
            repositorio.eliminar(producto.getId_prod());
            System.out.println("Producto editado con éxito");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
