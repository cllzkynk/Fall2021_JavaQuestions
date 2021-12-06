package class_21;

public class UserInfo extends UserClass {
    String address;

    UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

        void userDetails (){
            System.out.println("My name is "+super.getName()+"." +
                    " My phone number is "
                    +super.getMobileNumber()+
                    ". And  I am from "+address);

        }

    public static void main(String[] args) {
        UserInfo student1=new UserInfo("Marta",
                "1255678967","Ukraine");
        student1.userDetails();

        UserInfo student2=new UserInfo("Taras",
                "098765432","the USA");
        student2.userDetails();
    }
    }

