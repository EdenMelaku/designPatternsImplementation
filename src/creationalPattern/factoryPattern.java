
/*
this class implments the factory pattern
it creates a factory for interface book

novel, scienceBooks, historyBooks implements books

bookFactory creates instances of one of the stated classes

 */



package creationalPattern;

interface Book{

    void read();
}


class Novel implements Book{


    @Override
    public void read() {
        System.out.println("here is your novel");
    }
}

class HistoryBooks implements Book{


    @Override
    public void read() {
        System.out.println("here is your history book");
    }
}

class ScienceBooks implements Book{


    @Override
    public void read() {
        System.out.println("here is your science book");
    }
}


class BookFactory {

    Book getBook(String type){
        Book b;

        if(type==null){

            System.out.println("type is empty");
            return null;
        }

        else if(type.equalsIgnoreCase("science")){
            b=new ScienceBooks();
           return b;

        }

        else if (type.equalsIgnoreCase("novel")){

            b=new Novel();
            return b;
        }

        else if(type.equalsIgnoreCase("history")){

            b=new HistoryBooks();
            return b;
        }
        else{

            System.out.println("sorry, no such type of book");
            return null;
        }


    }


}

public class factoryPattern {

public static void main( String ... args){
    BookFactory bookFactory=new BookFactory();

    Book book1=bookFactory.getBook("novel");
    book1.read();



    Book book2=bookFactory.getBook("history");
    book2.read();


    Book book3=bookFactory.getBook("science");
    book3.read();






}

}




