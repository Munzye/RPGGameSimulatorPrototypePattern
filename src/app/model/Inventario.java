package app.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }
    public Inventario(Inventario inventario) {
        this.items = new ArrayList<>();

        for (Item item : inventario.items) {
            this.items.add(new Item(item));
        }
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
