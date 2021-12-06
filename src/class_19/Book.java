package class_19;

public class Book {
    String title;
    int pages;
    char bestseller;
    String author;

    Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    Book(String title, String author, int pages,char bestseller){
        this(title, author, pages);
        this.bestseller=bestseller;
    }
    void Print(){
        System.out.println(title+" by "+author+" has "+pages+" pages "+bestseller);

    }
    public static void main(String[] args) {
        Book book1=new Book("Frankenstein","Mary Shelley",280);
        Book book2=new Book("Dracula","Bram Stoker",418,'Y');
        book1.Print();
        book2.Print();
    }
}