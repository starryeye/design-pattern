package structural_pattern.composite;

public class File extends Item {

    private String name;
    private int size;
    
    public File(String name, int size) {
		// TODO:

        this.name = name;
        this.size = size;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
		// TODO:

        return size;
    }
}
