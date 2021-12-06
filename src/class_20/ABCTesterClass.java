package class_20;

public class ABCTesterClass {


    public static void main(String[] args) {
        ClassC classC=new ClassC();
        classC.bookTitle="Da VInci Code";
        classC.bookYear=2003;
        classC.isInteresting=true;


        System.out.println("The title of the book is "+ classC.bookTitle+". " +
                "It was released in "+ classC.bookYear+". Is it interesting? -"+ classC.isInteresting);

        }
}
