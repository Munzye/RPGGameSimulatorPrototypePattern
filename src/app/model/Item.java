package app.model;

public class Item {

    private String nombre;
    private int poder;

    public Item(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public Item(Item item) {
        this.nombre = item.nombre;
        this.poder = item.poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre + " (poder: " + poder + ")";
    }
}
