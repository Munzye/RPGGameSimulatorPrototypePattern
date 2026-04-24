package app.model;

public class Arquero extends Personaje {

    private int precision;

    public Arquero(
            String nombre,
            int nivel,
            int puntosVida,
            int puntosEnergia,
            Inventario inventario,
            int precision
    ) {
        super(nombre, "Arquero", nivel, puntosVida, puntosEnergia, inventario);
        this.precision = precision;
    }

    public Arquero(Arquero arquero) {
        super(arquero);
        this.precision = arquero.precision;
    }

    @Override
    public Personaje clone() {
        return new Arquero(this);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una flecha. Precisión: " + precision);
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return super.toString() + " | precision=" + precision;
    }
}
