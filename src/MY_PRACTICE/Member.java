package MY_PRACTICE;

public class Member {
    public String welcome="Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private  int discount;

    public Member(){
        System.out.println("Parent constructor with no parameter");
    }
    public Member(String pName, int pMemberID,int pMemberSince){
        System.out.println("Parent Constructor with 3 parameters");
        name=pName;
        memberID=pMemberID;
        memberSince=pMemberSince;
        
    }
}
