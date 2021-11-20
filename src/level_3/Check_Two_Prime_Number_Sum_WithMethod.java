package level_3;

public class Check_Two_Prime_Number_Sum_WithMethod {

	public static void main(String[] args) {

		int num = 10;
		int sum = addNum(num);
		System.out.println("sum is " + sum);
	}

	public static int addNum(int num) {
		if (num != 0) {
			return num + addNum(num - 1);
		} else {
			return num;
		}
	}

}
