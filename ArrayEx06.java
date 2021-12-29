
public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에 숫자를 준비
		// 최대값, 최소값을 가질 변수
		// 배열에서 차례로 꺼내어 최대값, 최소값과 비교해서 교체
		// 최대값, 최소값 출력
		
		int[] score = {100, 90, 80, 70, 60, 50, 40};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
					min = score[i];
			}
		}
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
	}

}
