/**
 * 
 */
package Random_;

import java.util.Arrays;

/**
 * @author CELÝL
 */
public class Interview_Questions_03_Alternative {


    public static void main(String[] args) {
        
        String cumle="Ali came to school and Ayse came to school";
        
        String arr1 [] = cumle.split(" ");
        
        String str="";
        
        int sayac=0;
        
        
        for (int i = 0; i < arr1.length; i++) {
            
            for (int j = i; j < arr1.length; j++) {
                
                if (arr1[i].equals(arr1[j])) {
                    sayac++;
                }
            }
            if (!str.contains(arr1[i])) {
                str+=arr1[i]+"="+sayac+"#";
            }
            sayac=0;
        }
        
        
        String arr2[] = str.split("#");
        
        System.out.println(Arrays.toString(arr2));
    
    }
    
}