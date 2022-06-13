package proyecto.ramallo.hibernate.modelo;

import java.util.Date;

public class Producto {

    private  Long id_prod;
    private String nombre;
    private Integer precio;
    private Date fecha_ingreso;
    private  Categoria categoria;

    public Producto (Long id_prod,String nombre,Integer precio,Date fecha_ingreso){
        this.id_prod = id_prod;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return id_prod +
                "|" +
                nombre +
                "|" +
                precio +
                "|" +
                fecha_ingreso +
                "|" + categoria.getNombre() ;
    }

    public Producto(){

    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }

    public Date getFecha_ingreso(){
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha){
        this.fecha_ingreso = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
