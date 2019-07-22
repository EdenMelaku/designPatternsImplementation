package creationalPattern;
/*
this example shows prototype pattern, which is one of the type of creational pattern
it is cloning of an existing object instead of creating new one and can also be customized as per the requirement
 */


abstract class Animal{

    public abstract Animal Clone() ;
}


class Person extends Animal{
    private String socialSecNum;
    private String color;

    public Person(String socialSecNum){
        this.socialSecNum=socialSecNum;

    }

    public Person(String socialSecNum,String color){
        this.socialSecNum=socialSecNum;
        this.color=color;

    }
    @Override
    public Animal Clone()  {
        Animal animal = new Person(socialSecNum);
        return animal;
    }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



public class prototypePattern {


    public static void main(String ... args){
        Person person=new Person("09xcdrf78","black");
        System.out.println("person created with  socialSecNum= "+person.getSocialSecNum()+"  , color= "+person.getColor());

        Person cloned=(Person) person.Clone();
        System.out.println("person  with  socialSecNum= "+person.getSocialSecNum()+"  is CLONED");

        cloned.setColor("white");
        System.out.println(" CLONED person  with  socialSecNum= "+person.getSocialSecNum()+"  color is now "+cloned.getColor());




    }
}