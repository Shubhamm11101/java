class Library{
    String[] books;
    int no_of_books;
    Library(){
    this.books = new String[100];
    this.no_of_books = 0;
    }
    
    Void addBook(String book){
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println(book+ "has been added!");
    return null;
        
    }
    void showAvailabeBooks(){
    System.out.println("Available books are: ");
    for(String book: this.books){
    if(book == null){
    continue;
    }
    System.out.println("* " + book);
    }
    }
    void issueBook(String book){
    for(int i=0; i<this.books.length; i++){
    if(this.books[i].equals(book)){
    System.out.println("The book has been issued!");
    this.books[i] = null;
    return; 
                
    }
    }
    System.out.println("This book does not exist");
}
    void returnBook(String book){
    addBook(book);
    }
}

public class online_lib      {
    public static void main(String args[]){
    Library centralLibrary = new Library();
    centralLibrary.addBook("Think and grow rich");
    centralLibrary.addBook("Algorithms");
    centralLibrary.addBook("C++");
    centralLibrary.showAvailabeBooks();

    centralLibrary.issueBook("C++");
    centralLibrary.showAvailabeBooks();
    centralLibrary.returnBook("C++");
    centralLibrary.showAvailabeBooks();
         

    }
}
