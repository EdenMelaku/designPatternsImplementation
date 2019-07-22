/*
allows to support large number of granular object by allowing them to be shared with intrinsic values and stored with in a factory
 */
package structuralPatterns;


import java.util.HashMap;

class ShoeFactory{

    private static final HashMap shoeMap=new HashMap();

    public static LeatherShoe getShoe(int size){

        LeatherShoe shoe=(LeatherShoe)shoeMap.get(size);

        if(shoe==null){
            shoe=new LeatherShoe(new LeatherShoeMaker(),"black",size);
            shoeMap.put(size, shoe);
            System.out.println("making shoe of size "+size);

        }
        return shoe;
    }
}


public class FlyWeightPattern {

    public static void main(String ... args){

        for (int i=0;i<10;i++){
            LeatherShoe leatherShoe=(LeatherShoe)ShoeFactory.getShoe((int)(Math.random()*10+40));
            leatherShoe.make();
        }
    }
}
