/*
provides control for accessing an object , protection of original object from outside
 */

package structuralPatterns;


interface Borrowing{
    public void grantAccess();
}
class BookBorrowing implements Borrowing{

    String memberId;
    public BookBorrowing(String memberId){
        this.memberId=memberId;
    }

    public void grantAccess(){
        System.out.println("the book is granted  for member id  "+memberId);
    }


}

class BorrowingConfidentialBooks implements Borrowing{

    String memberID;
    public BorrowingConfidentialBooks(String memberID){
        this.memberID=memberID;
    }

    @Override
    public void grantAccess() {
     if (checkEligiblity()){
         new BookBorrowing(memberID).grantAccess();
     }
     else {
         System.out.println("access is denied for memeber Id ="+memberID);
     }
    }

    boolean checkEligiblity(){
        if(memberID.contains("ab")){
            return true;
        }
        else
            return false;
    }
}

public class ProxyPattern {

    public static void main(String ... args) {
    BorrowingConfidentialBooks borrow1=new BorrowingConfidentialBooks("ab009");
    BorrowingConfidentialBooks borrow2=new BorrowingConfidentialBooks("cd008");

    borrow1.grantAccess();
    borrow2.grantAccess();



    }


}
