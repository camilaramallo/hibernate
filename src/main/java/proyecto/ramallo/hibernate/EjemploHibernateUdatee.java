package proyecto.ramallo.hibernate;

import proyecto.ramallo.hibernate.modelo.Categoria;
import proyecto.ramallo.hibernate.modelo.Producto;
import proyecto.ramallo.hibernate.repositorio.ProductoRepositorioImpl;
import proyecto.ramallo.hibernate.repositorio.Repositorio;
import proyecto.ramallo.hibernate.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploHibernateUdatee {
    public static void main(String[] args) {
        try(Connection conexion = ConexionBaseDatos.getInstance();
        ){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== listar ============================");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo

            System.out.println("=============== obtener por id =======================");
            System.out.println(repositorio.porID(2L));

            System.out.println("=============== modificar producto==================");
            Producto producto = new Producto();
            producto.setId_prod(8L);
            producto.setNombre("Mouse");
            producto.setPrecio(1500);
            Categoria categoria = new Categoria();
            categoria.setId_catg(1L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto editado con éxito");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
