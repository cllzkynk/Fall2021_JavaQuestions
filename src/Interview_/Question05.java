public class Question05 {
    /*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
	 */

    public static void main(String[] args) {
        int arr[] = {4, 6, 5, -10, 8, 5, 20, 3, 7, -3, 13};

            method1(arr, 20);

    }

    public static void method1(int arr[], int sum){
            for(int i = 0; i<arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] + arr[j] == sum){
                        System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    }
                }
            }

    }
}
