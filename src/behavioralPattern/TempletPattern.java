/*
defines a skeleton or template for group of classes on the parent class
 */

package behavioralPattern;



abstract class PrepareFood {


    abstract void prepareIngrident();
    abstract void turnOffTheHeat();

    final void heatTheStove(){
    System.out.println("the stove is heated");
    }

    final void preparePot(){
        System.out.println("the pot is on the stove");
    }

    final void putInIngrident(){

       System.out.println("the ingrident added");
    }


   final void cook(){

        prepareIngrident();
        heatTheStove();
        preparePot();
        putInIngrident();
        turnOffTheHeat();

    }

}

class PrepareStake extends PrepareFood{

    @Override
    void prepareIngrident() {
        System.out.println("the ingridents are \n 1kg steak meat \n 4 onions \n one tea spoon of salt \n 100ml olive oil \n 2 spoon of butter \n 1 tea spoon of wine");

    }

    @Override
    void turnOffTheHeat() {
        System.out.println("heat turned off after 30 min");

    }
}

class PrepareChickenCotelet extends PrepareFood{

    @Override
    void prepareIngrident() {
        System.out.println("the ingridents are \n 600gm chicken \n 100gm flour \n one tea spoon of salt \n 100ml olive oil \n ");
    }

    @Override
    void turnOffTheHeat() {
        System.out.println("heat turned off after 20 min");

    }
}










public class TempletPattern {

    public static void main (String ... args){

        System.out.println("cooking chicken cotelet\n\n");
        PrepareFood chicken=new PrepareChickenCotelet();
        chicken.cook();
        System.out.println("\n\ncooking steak");
        PrepareFood steak=new PrepareStake();
        steak.cook();

    }

}
