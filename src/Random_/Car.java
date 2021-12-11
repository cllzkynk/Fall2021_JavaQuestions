package Random_;

class Car extends Vehicle {
	String trans ;
	Car (String trans){
		 System.out.println("C1 icin  car 6 calisti");	
		//System.out.println("C2 icin  car 7 calisti");
		this.trans=trans;
	}
	
	Car (String type , int maxSpeed , String trans){
		
		super(type , maxSpeed);
		 System.out.println("C1 icin  car 14 calisti");	
		//System.out.println("C2 icin  car 15 calisti");
		this.trans=trans;
	}
	
	public static void main(String[] args) {
		 Car c1=new Car("Auto");
		 System.out.println("kontrol                 ==============........");
		 Car c2=new Car("4W" , 150, "Manual" );
 	 System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
 	  System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
 
	}
}