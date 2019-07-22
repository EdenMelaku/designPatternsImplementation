/*
is a way to change an objects behaviour and structue depending on its internal values
 */

package behavioralPattern;


interface State{

    public void recomendation(Context context);
}

class Context{
    private State state;
    public Context(){
        setState(null);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
class NormalState implements State{


    @Override
    public void recomendation(Context context) {
     System.out.println("this person needs to continue with previous habits");
     context.setState(this);
    }

    @Override
    public String toString() {
        return "normal state";
    }
}

class OverWeightState implements State{

    @Override
    public void recomendation(Context context) {
        System.out.println("this person needs to decrease amount of food that he takes");
        context.setState(this);


    }
    @Override
    public String toString() {
        return "overweight  state";
    }
}

class UnderWeightState implements State{

    @Override
    public void recomendation(Context context) {
        System.out.println("this person needs to increase amount of food that he takes");
        context.setState(this);


    }
    @Override
    public String toString() {
        return "underweight  state";
    }
}


class Man{

    private double height;
    private double weight;

    public Man(double height, double weight){
        this.height=height;
        this.weight=weight;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weitght) {
        this.weight = weitght;
    }
}

public class StatePattern {

    public static void main(String ... args){

        Context context=new Context();

        NormalState ns=new NormalState();
        ns.recomendation(context);

        System.out.println(context.getState().toString());

        OverWeightState ow=new OverWeightState();
        ow.recomendation(context);

        System.out.println(context.getState().toString());



    }


}
