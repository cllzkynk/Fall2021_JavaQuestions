package studentPractise;

public class SayiSiralama {

	public static void main(String[] args) {
		

	}
	
	public void BubbleSort(int [] Array) 
	{
	    int tmp;

	    for(int i=0; i<Array.length; i++) {
	for(int j=Array.length-1 ; j>i;j--)
	        {
	            if(Array[j-1]>Array[j]) 
	            {
	                
	                tmp=Array[j-1];
	                Array[j-1]=Array[j];
	                Array[j]=tmp;
	            }
	        }
	       
	    }
	}

}
