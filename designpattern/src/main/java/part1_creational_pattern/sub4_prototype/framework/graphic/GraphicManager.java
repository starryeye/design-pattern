package part1_creational_pattern.sub4_prototype.framework.graphic;

import java.util.*;

public class GraphicManager {
	
	private HashMap<String, Shape> figures = new HashMap<String, Shape>();
	
	public void register(String name, Shape s) {
		// TODO: 이름과 Shape 타입의 객체를 등록
		figures.put(name, s);
	}
	
	public Shape create(String protoName) {
		// TODO: 이름으로 Shape 타입의 객체를 찾고,
		// 해당 객체를 통해 새로운 객체를 생성한다.

		Shape shape = figures.get(protoName);

		return shape.createClone();
	}
}
