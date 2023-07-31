package jul31;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Option01 extends JFrame { //JFrame 부모것을 사용할 수 있다. (상속받았기 때문이다.)
	
	public Option01() {
		super("j옵션을 사용해보겠습니다."); //super
		
		JOptionPane.showMessageDialog(this, "성공했습니다.");
		
		int result = JOptionPane.showConfirmDialog(this, "선택하세요.");
		//YES:0 NO:1 C:2
		//System.out.println(result);
		
		if (result == 0) {
			JOptionPane.showConfirmDialog(this, "Yes를 눌렀습니다.");
		} else {
			JOptionPane.showConfirmDialog(this, "NO/취소를 눌렀습니다.");
		}
		
		String name = JOptionPane.showInputDialog(this, "이름을 입력하세요.");
		JOptionPane.showMessageDialog(this, "당신이 입력한 이름은" + name + "입니다.");
		
		setSize(300, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Option01();
	}
}
