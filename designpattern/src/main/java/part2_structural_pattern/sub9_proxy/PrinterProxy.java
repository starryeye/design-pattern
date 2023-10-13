package part2_structural_pattern.sub9_proxy;

public class PrinterProxy implements Printable {

    private String msg;

    // TODO: Printer 객체에 대한 참조 선언
    private Printable printer;
    
    public PrinterProxy(String msg) {
        this.msg = msg;
    }
    
    @Override
    public void setMessage(String msg) {
        if (printer != null) {
            printer.setMessage(msg);
        }
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }

    @Override
    public void createMessage(String msg) {
        requestToPrinter(msg);
    }
    
    private void requestToPrinter(String msg) {
        if (printer == null) {
            printer = new Printer(msg);
        }
        
        // TODO: Printer 객체의 메소드 호출
        printer.createMessage(msg);
    }
}
