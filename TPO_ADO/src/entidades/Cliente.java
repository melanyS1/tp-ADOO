package entidades;

public class Cliente {
    
    private String nombre;
    private String email;
    private String password;
    private List<Compra> listaCompras = new ArrayList<>();
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
    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    public Cliente(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public static void registrarse(String nombre, String email, String password){
        //
    }
    public boolean iniciarSesion(){
        return false;
    }
    public static void realizarCompra(){
        //
    }


    
}