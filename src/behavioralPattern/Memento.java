package behavioralPattern;


import java.util.ArrayList;
import java.util.List;

class MementoClass {
    private String state;

    public MementoClass(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}

 class Toy {
    private String clothColor;


    public String getClothColor() {
        return clothColor;
    }

    public void setClothColor(String clothColor) {
        this.clothColor = clothColor;
    }

    public MementoClass saveStateToMemento(){
        return new MementoClass(clothColor);
    }

    public void getStateFromMemento(MementoClass memento){
        clothColor = memento.getState();
    }


}




 class Dresserr {
    private List<MementoClass> mementoList = new ArrayList<MementoClass>();

    public void add(MementoClass state){
        mementoList.add(state);
    }

    public MementoClass get(int index){
        return mementoList.get(index);
    }
}


public class Memento {


    public static void main(String ... args){
    Toy toy=new Toy();
    Dresserr dresser= new Dresserr();
        toy.setClothColor("blue");
        toy.setClothColor("green");
        dresser.add(toy.saveStateToMemento());
        toy.setClothColor("yellow");
        dresser.add(toy.saveStateToMemento());
        toy.setClothColor("yellow");
        dresser.add(toy.saveStateToMemento());
        toy.setClothColor("red");
        dresser.add(toy.saveStateToMemento());


        System.out.println("first color was "+dresser.get(0).getState());
        System.out.println("second color was "+dresser.get(1).getState());
        System.out.println("current color was "+toy.getClothColor());


    }
}
