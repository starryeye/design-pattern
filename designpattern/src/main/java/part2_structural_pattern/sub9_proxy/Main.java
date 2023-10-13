package part2_structural_pattern.sub9_proxy;

public class Main {

    /**
     * proxy pattern
     *
     * 어떤 객체에 대한 접근을 제어하기 위한 용도로 대리인에 해당하는 객체를 제공
     */

    public static void main(String[] args) {
        Printable p = new PrinterProxy("message to proxy 1st");
        System.out.println(p.getMessage());

        p.setMessage("message to proxy 2nd");
        System.out.println(p.getMessage());
        
        p.createMessage("message to printer 1st");
        p.createMessage("message to printer 2nd");
    }
}
