package app.registry;

import app.model.Personaje;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Personaje> prototipos;

    public PrototypeRegistry() {
        this.prototipos = new HashMap<>();
    }

    public void agregarPrototipo(String clave, Personaje personaje) {
        prototipos.put(clave, personaje);
    }

    public Personaje obtenerClon(String clave) {
        Personaje prototipo = prototipos.get(clave);

        if (prototipo == null) {
            throw new IllegalArgumentException("No existe un prototipo con la clave: " + clave);
        }

        return prototipo.clone();
    }

    public void mostrarPrototipos() {
        System.out.println("Prototipos registrados:");

        for (String clave : prototipos.keySet()) {
            System.out.println("- " + clave);
        }
    }
}
