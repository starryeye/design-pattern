package structural_pattern.composite;

public class Main {

    /**
     * composite pattern
     *
     * 객체들을 트리 구조로 구성하여 전체와 부분을 나타내는 계층 구조를 만든다.
     *
     * 복합 객체와 개별 객체를 동일하게 다룰 수 있도록 한다.
     *
     * 복합 객체 안에는 개별 객체와 또 다른 복합 객체를 포함하는 재귀적인 구조를 만든다.
     *
     * 그릇(container)과 내용물(component)를 동일하게 처리한다.
     */

    public static void main(String[] args) {
        Item rootDir = new Folder("DesignPatterns");
        Item settingsDir = new Folder(".settings");
        Item resDir = new Folder("res");
        Item srcDir = new Folder("src");
        Item patternsDir = new Folder("patterns");
        Item compositeDir = new Folder("structural_pattern/composite");
        
        rootDir.add(settingsDir);
        rootDir.add(resDir);
        rootDir.add(srcDir);
        srcDir.add(patternsDir);
        patternsDir.add(compositeDir);
        
        rootDir.add(new File(".classpath", 1));
        rootDir.add(new File(".project", 1));
        
        settingsDir.add(new File("org.eclipse.core.resources.prefs", 1));
        settingsDir.add(new File("org.eclipse.jdt.core.prefs", 1));
        
        compositeDir.add(new File("Directory.java", 1));
        compositeDir.add(new File("File.java", 1));
        compositeDir.add(new File("Item.java", 1));
        compositeDir.add(new File("Main.java", 2));
        
        System.out.print(rootDir.getName() + ": " + rootDir.getSize() + "KB");
    }

}
