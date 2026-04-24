package app.model;

import app.prototype.Prototype;

public abstract class Personaje implements Prototype<Personaje> {

    protected String nombre;
    protected String clase;
    protected int nivel;
    protected int puntosVida;
    protected int puntosEnergia;
    protected Inventario inventario;

    public Personaje(
            String nombre,
            String clase,
            int nivel,
            int puntosVida,
            int puntosEnergia,
            Inventario inventario
    ) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.puntosEnergia = puntosEnergia;
        this.inventario = inventario;
    }

    //Deep Copy
    public Personaje(Personaje personaje) {
        this.nombre = personaje.nombre;
        this.clase = personaje.clase;
        this.nivel = personaje.nivel;
        this.puntosVida = personaje.puntosVida;
        this.puntosEnergia = personaje.puntosEnergia;
        this.inventario = new Inventario(personaje.inventario);
    }

    public abstract void atacar();

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setPuntosEnergia(int puntosEnergia) {
        this.puntosEnergia = puntosEnergia;
    }

    @Override
    public String toString() {
        return "Personaje {" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", nivel=" + nivel +
                ", vida=" + puntosVida +
                ", energia=" + puntosEnergia +
                ", inventario=" + inventario +
                '}';
    }
}
