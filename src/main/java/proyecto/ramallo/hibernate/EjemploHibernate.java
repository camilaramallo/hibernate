package proyecto.ramallo.hibernate;

import proyecto.ramallo.hibernate.modelo.Categoria;
import proyecto.ramallo.hibernate.modelo.Producto;
import proyecto.ramallo.hibernate.repositorio.ProductoRepositorioImpl;
import proyecto.ramallo.hibernate.repositorio.Repositorio;
import proyecto.ramallo.hibernate.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploHibernate {
    public static void main(String[] args) {
        //final String databaseURL = "jdbc:h2:~/test";
        try(Connection conexion = ConexionBaseDatos.getInstance();
        ){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== listar ============================");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo

            System.out.println("=============== obtener por id =======================");
            System.out.println(repositorio.porID(2L));
            System.out.println("===============insertar nuevo producto==================");

            Producto producto = new Producto();
            producto.setNombre("mouse lacer");
            producto.setPrecio(10000);
            producto.setFecha_ingreso(new Date());
            Categoria categoria = new Categoria();
            categoria.setId_catg(4L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach(System.out::println); //con referencia al metodo


        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
