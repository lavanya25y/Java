package runner;

import things.Bookinformation;

public class BookInformationRunner {
    public static void main(String[] args){
        Bookinformation bookinformation = new BookinformationRunner();
        System.out.println(bookinformation);
        bookinformation.bookName="Core java";
        bookinformation.author="omkar";
        bookinformation.noOfPages=550;
        bookinformation.price=250.24;

        System.out.println("Book Name:"+bookinformation.bookName);
        System.out.println("Author :"+bookinformation.author);
        System.out.println("No of Pages:"+bookinformation.noOfPages);
        System.out.println("Price:"+bookinformation.price);

    }

}
