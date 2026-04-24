package app.model;

public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(
            String nombre,
            int nivel,
            int puntosVida,
            int puntosEnergia,
            Inventario inventario,
            int fuerza
    ) {
        super(nombre, "Guerrero", nivel, puntosVida, puntosEnergia, inventario);
        this.fuerza = fuerza;
    }
    public Guerrero(Guerrero guerrero) {
        super(guerrero);
        this.fuerza = guerrero.fuerza;
    }

    @Override
    public Personaje clone() {
        return new Guerrero(this);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con espada. Fuerza: " + fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + " | fuerza=" + fuerza;
    }
}
