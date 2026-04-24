package app;

import app.model.Arquero;
import app.model.Guerrero;
import app.model.Inventario;
import app.model.Item;
import app.model.Mago;
import app.model.Personaje;
import app.registry.PrototypeRegistry;

public class Main {

    public static void main(String[] args) {

        PrototypeRegistry registry = new PrototypeRegistry();

        //New para objetos base
        Inventario inventarioGuerrero = new Inventario();
        inventarioGuerrero.agregarItem(new Item("Espada de hierro", 20));
        inventarioGuerrero.agregarItem(new Item("Escudo básico", 15));

        Inventario inventarioMago = new Inventario();
        inventarioMago.agregarItem(new Item("Bastón mágico", 25));
        inventarioMago.agregarItem(new Item("Libro de hechizos", 30));

        Inventario inventarioArquero = new Inventario();
        inventarioArquero.agregarItem(new Item("Arco de madera", 18));
        inventarioArquero.agregarItem(new Item("Flechas", 10));

        Personaje guerreroBase = new Guerrero(
                "Guerrero Base",
                1,
                150,
                60,
                inventarioGuerrero,
                35
        );

        Personaje magoBase = new Mago(
                "Mago Base",
                1,
                90,
                150,
                inventarioMago,
                45
        );

        Personaje arqueroBase = new Arquero(
                "Arquero Base",
                1,
                110,
                100,
                inventarioArquero,
                40
        );

        registry.agregarPrototipo("guerrero", guerreroBase);
        registry.agregarPrototipo("mago", magoBase);
        registry.agregarPrototipo("arquero", arqueroBase);

        registry.mostrarPrototipos();

        System.out.println("\n--- Creando personajes mediante clonación ---");

        Personaje guerrero1 = registry.obtenerClon("guerrero");
        guerrero1.setNombre("Thorgrim");
        guerrero1.setNivel(5);
        guerrero1.setPuntosVida(200);

        Personaje guerrero2 = registry.obtenerClon("guerrero");
        guerrero2.setNombre("Ragnar");
        guerrero2.setNivel(3);

        Personaje mago1 = registry.obtenerClon("mago");
        mago1.setNombre("Merlín");
        mago1.setNivel(7);
        mago1.setPuntosEnergia(220);

        Personaje arquero1 = registry.obtenerClon("arquero");
        arquero1.setNombre("Legolas");
        arquero1.setNivel(6);

        //Deep copy
        guerrero1.getInventario().agregarItem(new Item("Hacha legendaria", 80));

        System.out.println("\n--- Personajes clonados ---");
        System.out.println(guerrero1);
        System.out.println(guerrero2);
        System.out.println(mago1);
        System.out.println(arquero1);

        System.out.println("\n- Prototipo original de guerrero -");
        System.out.println(guerreroBase);

        System.out.println("\n--- Ataques ---");
        guerrero1.atacar();
        mago1.atacar();
        arquero1.atacar();
    }
}
