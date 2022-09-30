package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String[] header = { "a", "b", "c" }; //제목(1차원)
		String[][] contents = { { "1", "2", "3" }, //내용(2차원)
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "4", "5", "6" }, 
								{ "7", "8", "9" }, };

		contents[0][0] = "999";
		contents[6][2] = "999";
		
		JTable table = new JTable(contents, header); // 테이블만들어서 컨텐츠랑 헤더 끼기
		JScrollPane scroll = new JScrollPane(table); // 스크롤 만들어서 테이릅레 끼기
		f.add(scroll); // f에 스크롤을 껴라

		f.setVisible(true);
		
		// contents.length: 1차원 배열의 개수(10개)
		// 이중for문
		for (int i = 0; i < contents.length; i++) { //행
			// 1차원 배열하나당 필요한 for문 하나
			for (int j = 0; j < contents[i].length; j++) { //열, 길이가 같으면 j < 3 가능
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
