/*
expand the adapter pattern by allowing the instance variable to be not a concrete type
 */

package structuralPatterns;

//abstract implementer
interface ShoeMaker{
    public void makeShoe(int size, String color);
}

class SandalMaker implements ShoeMaker{

    @Override
    public void makeShoe(int size, String color) {
        System.out.println("making sandal of size  "+size+" and color ="+color);
    }
}
//concrete implementer
class LeatherShoeMaker implements ShoeMaker{

    @Override
    public void makeShoe(int size, String color) {
        System.out.println("making leather shoe of size "+size+" and color ="+color);
    }
}



// abstraction
abstract class Shoe{
    ShoeMaker maker ;
    public Shoe(ShoeMaker maker){
        this.maker=maker;
    }
   abstract void make();
}
// refined abstraction
class LeatherShoe extends Shoe{
     String color;
     int size;
    public LeatherShoe(ShoeMaker maker, String color, int size) {
        super(maker);
        this.color=color;
        this.size=size;
    }

    @Override
    void make() {
        maker.makeShoe(size,color);

    }
}






public class BridgePattern {
    public static void main(String ... args ){
        ShoeMaker maker1=new LeatherShoeMaker();

        LeatherShoe shoe=new LeatherShoe(maker1,"black",42);
        shoe.make();


    }
}
