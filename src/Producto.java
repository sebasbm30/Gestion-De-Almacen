public class Producto {

    //atributos
    public String producto;
    public  String nombre;
    public double precio;
    public String categoria;
    public String stock;


    //Constructor
    public Producto(String producto, String stock, String categoria, double precio, String nombre) {
        this.producto = producto;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
    }

    //Getter

    public String getProducto() {
        return producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getStock() {
        return stock;
    }

    //Setter

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
