package repl_;

class Repl117 {
    public int sumEvenToX(int x)	{

        int sum=0;
        for(int i=1;i<=x;i++) {
            if(i%2==0) {
                sum+=i;
            }
        }
        return sum ;
    }
    //		test case below (dont change):
    public static void main(String[] args){
        Repl117 obj=new Repl117();
        System.out.println(obj.sumEvenToX(5)); //6
        System.out.println(obj.sumEvenToX(8)); //20
    }
}