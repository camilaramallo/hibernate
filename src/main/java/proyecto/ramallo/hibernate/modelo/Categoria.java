package proyecto.ramallo.hibernate.modelo;

public class Categoria {

    private  Long  id_catg;
    private String nombre;

    public Long getId_catg() {
        return id_catg;
    }

    public void setId_catg(Long id_catg) {
        this.id_catg = id_catg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
