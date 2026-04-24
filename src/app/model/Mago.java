package app.model;

public class Mago extends Personaje {

    private int poderMagico;

    public Mago(
            String nombre,
            int nivel,
            int puntosVida,
            int puntosEnergia,
            Inventario inventario,
            int poderMagico
    ) {
        super(nombre, "Mago", nivel, puntosVida, puntosEnergia, inventario);
        this.poderMagico = poderMagico;
    }
    public Mago(Mago mago) {
        super(mago);
        this.poderMagico = mago.poderMagico;
    }

    @Override
    public Personaje clone() {
        return new Mago(this);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo. Poder mágico: " + poderMagico);
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public String toString() {
        return super.toString() + " | poderMagico=" + poderMagico;
    }
}
