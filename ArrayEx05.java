
public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 합계, 평균을 저장할 변수
		// 배열에 점수 넣기
		// 배열의 점수를 하나씩 꺼내서 합계 계산(for)
		// 평균 계산
		// 합계/평균 출력
		
		int sum =0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++)
			sum += score[i];
					
		average = sum / (float)score.length ; //둘 중에 하나에 float
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}

}
