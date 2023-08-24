package ch05;

public class Array3Dim {

	public static void main(String[] args) {
		String[][][] subject = {
				{{"js01","as02","ad03","fd04"}
				,{"JSP","알고리즘","파이선","자료구조"}
				,{"홍길동","장예슬","김지선","오길동"}},
				
				{{"AF01","AF02","AF03","AF04"}
				,{"생활영어","경제학","생활체육","스포츠"}
				,{"구길동","성길동","최길동","황길동"}}
				};
		for(int i=0; i<subject.length; i++) {
			for(int j=0; i<subject[i].length; j++) {
				for(int k=0; k<subject[i][j].length; k++) {
					System.out.println("["+i+"]["+j+"]["+k+"]"+ subject[i][j][k]);
				}
			}
			System.out.println("=======================================");
		}
		
		}
	}

