/*
allows grouping of subsystems behind a unifies interface to allow a central access point to these subsystems
- to limit the access of group of subsystems
 */

package structuralPatterns;



class Facade{

    LeatherShoe leatherShoe;
    AmbientShade ambientShade;

    public Facade(){
        leatherShoe=new LeatherShoe(new LeatherShoeMaker(),"brown",41);
        ambientShade=new AmbientShade(new SimpleScene());

    }

    void makeShoe(){
        leatherShoe.make();
    }

    void paint(){
        ambientShade.paint();
    }

}
public class FacadePattern {

     public static void main(String ... args){
         Facade facade=new Facade();
         facade.makeShoe();
         facade.paint();
     }
}
