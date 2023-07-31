package jul31;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI02 {
	JFrame frame = new JFrame("프레임 입니다.");
	JButton button = new JButton("클릭해줘");
	
	public GUI02() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		//x누르면 닫기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GUI02();
		
	}

}
