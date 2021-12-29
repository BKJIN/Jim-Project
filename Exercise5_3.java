
public class Exercise5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//int i=0;
		//for(i=0;i<arr.length;i++)
	    //sum += arr[i];
		 for(int i : arr){ sum += i;}
	
		System.out.println("sum="+sum);
	}	

}
