package creationalPattern;
/*
this example shows prototype pattern, which is one of the type of creational pattern
 */


abstract class Animal{

    public abstract Animal Clone() throws CloneNotSupportedException;
}


class Person extends Animal{
    String socialSecNum;


    @Override
    public Animal Clone() throws CloneNotSupportedException {
        Animal animal = (Person)this.clone();
          return animal;    }
}



public class prototypePattern {

}