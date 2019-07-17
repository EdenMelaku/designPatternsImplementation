/*

this is abstract factory pattern implemntaton, it is a member of creational pattern and
if is a 1 level extention of factory patterns which includes abstract factories of 2 or more factories of completely
different types of interfaces.

this example includes 2 factories
 solidFactory( produces instances of Solid[salt, iron])
 liquidFactory( produces instances of Liquid[water, alkaline, benzene ])

 there is a abstract class AbstractFactory-- contains abstract methods of the factories
there is factory producer -- returns one of the two factorires
        */


package creationalPattern;
 interface Solid{

      void dissolve();

 }

 interface Liquid{

     void fill();
 }

 class Water implements Liquid{


     @Override
     public void fill() {
         System.out.println("water is filled ");
     }
 }

 class Alkaline implements Liquid{


     @Override
     public void fill() {
         System.out.println("alkaline is filled ");
     }
 }

  class Benzene implements Liquid{


     @Override
     public void fill() {
         System.out.println("benzene is filled ");
     }
 }


 class Salt implements Solid{


     @Override
     public void dissolve() {
         System.out.println("salt is in the liquid");
     }

 }

 class Iron implements Solid{


     @Override
     public void dissolve() {

         System.out.println("iron is in the solution");
     }
 }



 abstract class AbstractFactory{
     abstract Solid  getSolid(String type);
     abstract Liquid getLiquid(String type);
 }

class SolidFacttory extends AbstractFactory {


    @Override
    Solid getSolid(String type) {
        Solid s=null;
        if(type==null){
            System.out.println("type is null");
        }
        else if(type.equalsIgnoreCase("iron")){

            s=new Iron();
        }
        else if(type.equalsIgnoreCase("")){

            s=new Salt();

        }

        else{

            System.out.println("invalid solid type");
        }

        return s;

    }

    @Override
    Liquid getLiquid(String type) {
        return null;
    }
}

class LiquidFactory extends AbstractFactory{
    @Override
    Solid getSolid(String type) {
        return null;
    }
    @Override

    public Liquid getLiquid(String type){
        Liquid l=null;

        if(type==null){
            System.out.println("type is null");
        }
       else if(type.equalsIgnoreCase("water")){

            l=new Water();

        }

        else if(type.equalsIgnoreCase("benzene")){

            l=new Benzene();

        }

        else if(type.equalsIgnoreCase("alkaline")){

            l=new Alkaline();

        }
        else{

            System.out.println("invalid liquid type");
        }

        return l;


    }


}
class FactoryProducer{

    AbstractFactory getFactory(String name){
        AbstractFactory af=null;
        if(name==null){
            System.out.println("factory is null");

        }
        else if (name.equalsIgnoreCase("liquid")){
            af=new LiquidFactory();

        }
        else if (name.equalsIgnoreCase("solid")){

            af=new SolidFacttory();

        }

        return af;
    }


}


public class AbstractFactoryPattern {

    public static void main(String ... args){
        AbstractFactory liquidFactory=new FactoryProducer().getFactory("liquid");
        AbstractFactory solidFactory=new FactoryProducer().getFactory("solid");

        Liquid liquid1= liquidFactory.getLiquid("water");
        Liquid liquid2= liquidFactory.getLiquid("alkaline");
        Liquid liquid3= liquidFactory.getLiquid("benzene");


        Solid solid1=solidFactory.getSolid("salt");
        Solid solid2=solidFactory.getSolid("iron");




    }

}
