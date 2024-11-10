package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String email;
    private String password;
    private List<Compra> listaCompras;

    public Cliente(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.listaCompras = new ArrayList<>();
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }
  
    public void registrarse() {
        System.out.println("Registro exitoso para: " + nombre);
    }
    
    public boolean iniciarSesion(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
    public void realizarCompra(Compra compra) {
        listaCompras.add(compra);
        System.out.println("Compra realizada por: " + nombre);
    }
}
