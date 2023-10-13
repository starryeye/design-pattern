package part2_structural_pattern.sub9_proxy;

public class Printer implements Printable {

    private String msg;

    public Printer(String msg) {
        this.msg = msg;
        initialize("(creating new instance ");
    }
    
    @Override
    public void setMessage(String name) {
        this.msg = name;
    }
    
    @Override
    public String getMessage() {
        return msg;
    }
    
    @Override
    public void createMessage(String msg) {
        // TODO: 새로운 메시지를 설정하고, 화면에 출력

        setMessage(msg);
        System.out.println(getMessage());
    }
    
    private void initialize(String msg) {
        System.out.print(msg);
        for (int i=0; i<5; i++) {
            // TODO: 1초간 쓰레드 정지
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.print(".");
        }
        System.out.println(" completed.)");
    }
}
