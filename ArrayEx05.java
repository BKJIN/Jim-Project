
public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �հ�, ����� ������ ����
		// �迭�� ���� �ֱ�
		// �迭�� ������ �ϳ��� ������ �հ� ���(for)
		// ��� ���
		// �հ�/��� ���
		
		int sum =0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++)
			sum += score[i];
					
		average = sum / (float)score.length ; //�� �߿� �ϳ��� float
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}

}
