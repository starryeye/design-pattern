package structural_pattern.composite;

public abstract class Item {

    public abstract String getName();
    
    public abstract int getSize();

    public void add(Item item) {
		// TODO:
        throw new UnsupportedOperationException();
    }

}
