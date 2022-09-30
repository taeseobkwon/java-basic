package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(700, 800);
		// 윗줄에 있는거 다 보여줘라
		// 배치를 물흐르듯이 한쪽방향으로 붙혀주는 부품사용(왼쪽에서 시작)
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
//		JButton b1 = new JButton("버튼1");
//		f.add(b1);
//		JButton b2 = new JButton("버튼2");
//		f.add(b2);
		// 예약된 상황을 저장해두기 위한 배열 만들기
		int[] seat = new int[500];
		//                  {0, 0, 0, 0, ......}
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b); //프레임에 버튼 넣어라
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// b를 클릭했을 때 처리내용을 여기 넣어라
					String s = e.getActionCommand(); //버튼위에 있는 글자를 가져옴(일단 String임)
					JOptionPane.showMessageDialog(f, s + "번 예약됨.");
					// 예약된 것을 버튼 색 변경해서 표시 해보기
					b.setBackground(Color.red);
					// 한번 예약하면 다시는 예약 안되게 버튼을 변경
					b.setEnabled(false);
					// 정수로 인덱스 값을 변경
					int index = Integer.parseInt(s);
					// seat[0] = 1;(정수)
					seat[index] = 1; //예약된 상황을 저장
				}
			});
		}
		
		
		
		JButton pay = new JButton("결제하기");
		f.add(pay);
		pay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 배열에 있는거 전체중에서 1이 몇개인지 세서 13000을 곱하기
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, count * 13000 + "원입니다.");
			}
		});
		
		
		
		f.setVisible(true);
		// 밑에 있는건 안보임
	}

}
