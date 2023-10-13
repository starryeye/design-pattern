package part2_structural_pattern.sub5_adapter;

public class PrintAdapter implements Print {
    
    private final LegacyPrinter printer;
    
    public PrintAdapter(String string) {
        this.printer = new LegacyPrinter(string);
    }
    
    @Override
    public void printNormal() {
    	// TODO: LegacyPrinter의 메소드 호출
        printer.show();
    }

    @Override
    public void printStrong() {
    	// TODO: LegacyPrinter의 메소드 호출
        printer.showWithBracket();
    }
}
    