package reviewClass_5;

public class Class {
    public static void main(String[] args) {
        //array is a container---size and data type are fixed;
       //1.declare and initialize at the same time;
        int[]intArr={3,5,7,1,15};

        //2. declare first and assign values
        int[][] intArray1=new int[2][3]; //rows and coloums
        intArray1[0][0]=23;
        intArray1[0][1]=12;
        intArray1[0][2]=23;

        intArray1[1][0]=5;
        intArray1[1][1]=-6;
        intArray1[1][2]=3;

     //let's find the sum of all values in our array
        int sum=0;

        for(int i=0;i< intArray1.length; i++){ //gives us rows
            for (int j=0; j<intArray1[i].length;j++){ //gives us coloums

                sum+=intArray1[i][j];       //sum=sum+intArray1[i][j];
                System.out.println(sum);
            }
        }
        System.out.println(sum);



        for(int[]row:intArray1){
                for(int value:row){
                    System.out.print(value+" ");
                }
            System.out.println();


    }


}}
