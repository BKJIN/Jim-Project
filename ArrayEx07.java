import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 �غ� & �ʱ�ȭ
		// �迭�� ���ʷ� �о ����
		// �迭 ���
		
		int[] numArr = new int[10];
		
		for (int i=0; i < 10; i++) {
			numArr[i] = i;
		}
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<3;i++) {
			int n =(int) (Math.random()*10);
			int tmp = 0;
			tmp = numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=tmp;
			System.out.println(i + "=> " + n + ": " + Arrays.toString(numArr));
		}
		System.out.println(Arrays.toString(numArr));
		
		
	}

}
