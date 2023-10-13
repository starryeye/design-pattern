package part2_structural_pattern.sub5_adapter;

public class Main {

    /**
     * adapter pattern
     *
     * 클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 변환 시킨다.
     *
     * 서로 일치하지 않는 인터페이스를 갖는 클래스들을 함께 동작 시킨다.
     *
     * 실제와 다른 인터페이스를 가진 것처럼 보이도록 한다.
     *
     * 이미 제공되어 있는 것과 필요한 것 사이의 차이를 없애 준다.
     *
     *
     */
    
    public static void main(String[] args) {
       Print p = new PrintAdapter("Hello World");
       p.printNormal();
       p.printStrong();
    }
}

