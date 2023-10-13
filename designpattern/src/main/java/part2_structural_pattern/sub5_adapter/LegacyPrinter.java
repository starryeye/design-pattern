package part2_structural_pattern.sub5_adapter;

public class LegacyPrinter {
    
	// TODO:
    private final String string;

	public LegacyPrinter(String string) {
		// TODO:
        this.string = string;
    }
    
    public void show() {
        System.out.println(string);
    }
    
    public void showWithBracket() {
        System.out.println("[ " + string + " ]");
    }
}

    