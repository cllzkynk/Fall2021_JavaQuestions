package MY_PRACTICE;

public class Book {
    String title;
    int year;
    char bestseller;


    Book(String title,int year){
        this.title=title;
        this.year=year;

    }
    Book(String title, int year,char bestseller){
        this(title, year);
        this.bestseller=bestseller;

    }
    void Print(){
        System.out.println("The name if the book is "+title+". It was released in "+year+". It is "+bestseller);
    }

    public static void main(String[] args) {
        Book book=new Book("Da Vinci Code",2003,'y');
        book.Print();
    }






}

