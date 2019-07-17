/*

this example uses a dressing applicaion to illustrate a command pattern

we have a virtual toy , which takes a  cloth and shows  outfit

the user gives a cloth choice
user have options to undo or redo

 */


package behavioralPattern;

import java.lang.reflect.Array;
import java.util.ArrayList;


abstract class Dressing{
    abstract void dress();

}

class Hair extends Dressing{
    DressToy toy;
    public Hair (DressToy toy){
        this.toy=toy;
    }

    @Override
    void dress() {
     toy.dressHair();
    }
}

class Cloth extends Dressing {
    DressToy toy;
    public Cloth(DressToy toy){
        this.toy=toy;
    }
    @Override
    void dress() {
      toy.dressCloth();
    }
}

class DressToy{

    public void dressHair(){

        System.out.println("toy dresses her hair ");
    }

    public void dressCloth(){

        System.out.println("toy dresses her  cloth");
    }

}


class Dresser{

    ArrayList<Dressing> lists=new ArrayList<>();

    public void takeOrders(Dressing dressing){
        lists.add(dressing);

    }

    public void ListOrders(){
        for( Dressing d: lists){
            d.dress();
        }
    }

    public void clearList(){
        lists.clear();
    }


}




public class CommandPattern {



    public static void main(String ... args){

        DressToy toy=new DressToy();

        Hair hair=new Hair(toy);
        Cloth cloth=new Cloth(toy);

        Dresser dresser=new Dresser();

        dresser.takeOrders(hair);
        dresser.takeOrders(cloth);

        dresser.ListOrders();




    }
}