package jul31;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Final {
	public static void main(String[] args) {

		JFrame frame = new JFrame("최종");
		
		//레이아웃
		GridLayout gl = new GridLayout(3, 2, 10, 10);
		frame.setLayout(gl);
		
		//JLabel : 글자만 사용할 수 있는 객체
		JLabel jl = new JLabel("이름");
		jl.setText("이름은?");
		frame.add(jl);
		
		//JButton
		JButton button = new JButton("버튼입니다.");
		button.setText("버튼");
		frame.add(button);
		
		//파일선택
		JFileChooser jfc = new JFileChooser();
		frame.add(jfc);
		
		//TextField
		TextField field = new TextField();
		frame.add(field);
		 
		//JPanel
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(1,2));
		JButton jbtn1 = new JButton("버튼1");
		jPanel.add(jbtn1);
		jPanel.add(new JButton("버튼2"));
		frame.add(jPanel);
		
		//기능추가
		jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("버튼을 눌렀습니다.");
				jl.setForeground(Color.RED); //글자색
				jl.setBackground(Color.YELLOW); //배경색
				jbtn1.setForeground(Color.CYAN); //글자색
			}
		});
		
		
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
}
