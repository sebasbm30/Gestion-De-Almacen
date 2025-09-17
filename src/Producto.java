public class Producto {

    //atributos privados
    private String producto;
    private   String nombre;
    private double precio;
    private Categoria categoria;
    private int stock;


    //Constructor

    public Producto(String producto, String nombre, double precio, Categoria categoria, int stock) {
        this.producto = producto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }


}
