package creational_pattern.prototype;

import creational_pattern.prototype.graphiceditor.GraphicEditor;

public class Main {

	/**
	 * prototype pattern
	 *
	 * 원형이 되는 인스턴스를 미리 생성하여 준비해두고..
	 * 생성 요청이 오면 기존 객체를 복사해서 새로운 객체를 생성하여 응답
	 *
	 * Clonable 을 구현한 객체는 clone() 메서드를 깊은 복사로 사용가능하다.
	 */

	public static void main(String[] args) {

		GraphicEditor editor = new GraphicEditor();
		
		editor.clickCircle();
		editor.clickSquare();
		editor.clickRectangle();
		editor.clickRoundedRectangle();
	}

}
