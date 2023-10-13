package part2_structural_pattern.sub6_composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Item {

    private String name;

    // TODO: Item을 저장할 ArrayList 선언
    List<Item> items = new ArrayList<>();
    
    public Folder(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
    	// TODO: 현재 Item의 모든 하위 Item을 순회하며 총 크기 계산
        return items.stream()
                .mapToInt(Item::getSize)
                .sum();
    }

    @Override
    public void add(Item item) {
    	// TODO: 인자로 받은 item을 ArrayList에 저장
        items.add(item);
    }

}
