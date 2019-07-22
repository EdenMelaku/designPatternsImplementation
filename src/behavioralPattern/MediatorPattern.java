/*
mediator pattern is used to reduce communication complexity between objects

this example shows a notice board scenario so as to make communication easier between Employees
 */

package behavioralPattern;


import java.util.Date;
import java.util.GregorianCalendar;

class Employee {



    private String name;
    private String ID;

    public Employee (String name,String ID){

        this.name=name;
        this.ID=ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    void postMessage(String message){
       NoticeBoard.showMessage(this,message);
    }


}

class NoticeBoard{

    public static void showMessage(Employee employee,String message){
        GregorianCalendar c=new GregorianCalendar();
        Date d=c.getTime();
        System.out.println("ID = "+employee.getID());
        System.out.println("name = "+employee.getName());
        System.out.println("message = "+message);
        System.out.println("Date = "+d.toString());
        System.out.println();
        System.out.println();
    }
}



public class MediatorPattern {

    public static void main(String ... args){

        Employee employee1=new Employee("eden","001");
        Employee employee2=new Employee("hanna","003");

        employee1.postMessage("hello");
        employee2.postMessage("how are you ");
        employee1.postMessage("i am fine ");



    }


}

