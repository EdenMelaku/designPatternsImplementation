/*
allows change or addition to a class without changing its actual class

instead of coding methods or algorithms that perform functions inside a class we pass reference to other classes that have the desired finctionality
 */

package behavioralPattern;



interface Visitor{

    void show(PrepareFood food);
}

class Ingridents implements Visitor{

    @Override
    public void show(PrepareFood food) {
     food.prepareIngrident();
    }
}

class CookingTime implements Visitor{

    @Override
    public void show(PrepareFood food) {
        food.turnOffTheHeat();
    }
}

public class VisitorPattern {

    public static void main(String ... args){
      PrepareFood food =new PrepareChickenCotelet();
      Visitor visitor1=new Ingridents();
      Visitor visitor2=new CookingTime();
      visitor1.show(food);
      visitor2.show(food);

    }
}
