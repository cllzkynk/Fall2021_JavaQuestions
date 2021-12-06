package reviewClass_5;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {

        String[][][] arr3d=new String[2][2][3];
        //2 floor
        //2 apartments
        //3rooms in each apartment

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<arr3d.length;i++){

            for(int j=0;j<arr3d[i].length;j++){

                for(int z=0; z<arr3d[i][j].length;z++){
                    System.out.println("Please, enter a name :");
                    arr3d[i][j][z]=scan.nextLine();


                }

            }
        }
        for(String[][]arr2d:arr3d){
            for(String[]array1d:arr2d){
                for(String value:array1d){
                    System.out.print(value+" ");
                }
                System.out.println();

            }
            System.out.println();
        }


    }
}
