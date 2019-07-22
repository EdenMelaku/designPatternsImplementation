/*

compounds different subsets of functionality in to a collection and call each subset in turn in the collection at a given point
 */

package structuralPatterns;


import java.util.ArrayList;

interface Shelter{


    void remove();
    void sell();
    void maintain();


}

class House implements Shelter{

     ArrayList<House> houses=new ArrayList<>();
    String houseNo;

    public House(){
        ;
    }
    public  House(String houseNo){
        this.houseNo=houseNo;
    }

    @Override
    public void remove() {
        System.out.println(houseNo+"  is removed");
    }

    @Override
    public void sell() {
        System.out.println(houseNo+"  is sold");

    }

    @Override
    public void maintain() {
        System.out.println(houseNo+"  is maintained");


    }


}





public class CompositPattern {

    public static void main(String ... args){

        House house1=new House();

        House a001=new House("a001");
        House a002=new House("a002");
        House a003=new House("a003");

        House house2=new House();

        House b001=new House("b001");
        House b002=new House("b002");
        House b003=new House("b003");


        house1.houses.add(a001);
        house1.houses.add(a002);
        house1.houses.add(a003);

        house2.houses.add(b001);
        house2.houses.add(b001);
        house2.houses.add(b001);

        for(House house:house1.houses){

            house.remove();

        }

        for(House house:house2.houses){

            house.sell();

        }



    }
}

