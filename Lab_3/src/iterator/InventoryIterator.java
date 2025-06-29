package iterator;

import model.Item;

import java.util.List;

public class InventoryIterator implements Iterator<Item> {
    private final List<Item> items;
    private int position = 0;

    public InventoryIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Item next() {
        return items.get(position++);
    }
}
