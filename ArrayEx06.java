
public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� ���ڸ� �غ�
		// �ִ밪, �ּҰ��� ���� ����
		// �迭���� ���ʷ� ������ �ִ밪, �ּҰ��� ���ؼ� ��ü
		// �ִ밪, �ּҰ� ���
		
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
		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
		
	}

}
