package ch05;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = {
							 {3.3,3.6} //1학년 1,2학기 평점
							,{3.4,3.0}
							,{2.8,3.2}
							,{3.1,3.4}};
		double sum = 0.0;
		for(int year=0; year<score.length; year++) {
			for(int term=0; term<score[year].length; term++) {
				sum += score[year][term];
				
			}
		}
		int n = score.length;
		int m= score[0].length;
		System.out.println("4학년 전체 평점 평균은 "+sum/(n*m));
	}

}
