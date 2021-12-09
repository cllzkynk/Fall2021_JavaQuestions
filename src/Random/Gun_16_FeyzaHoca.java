/**
 * 
 */
package Random;

/**
 * @author CELÝL
 */
public class Gun_16_FeyzaHoca {
 int x ,y ;
 
 public Gun_16_FeyzaHoca(int x,int y) {
	 initialize(x,y);
 }
	public void initialize(int x2, int y2) {
 x=x*x;
 y=y*y;
	
}
	public static void main(String[] args) {
		int x=3 ;  int y=5 ;
		Gun_16_FeyzaHoca obj=new Gun_16_FeyzaHoca(x, y);
		
		System.out.println(obj.x+ " "+obj.y);
		
		
		
	}

}
