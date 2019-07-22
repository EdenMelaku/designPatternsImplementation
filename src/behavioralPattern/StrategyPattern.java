/*
algorithms vary based on the class used
 */

package behavioralPattern;

import java.util.ArrayList;



abstract class Operation{
    public abstract float calculate(float operand1, float operand2);
}



class Addition extends Operation{

    @Override
    public float calculate(float operand1, float operand2) {
        return operand1+operand2;
    }
}


class Subtraction extends Operation{

    @Override
    public float calculate(float operand1, float operand2) {
        return operand1-operand2;
    }
}


class Multiplication extends Operation{

    @Override
    public float calculate(float operand1, float operand2) {
        return operand1*operand2;
    }
}

class Division extends Operation{

    @Override
    public float calculate(float operand1, float operand2) {
        return operand1/operand2;
    }
}

class MathsEngine{


    private Operation operation;
    private ArrayList<Float> values=new ArrayList();
    private float variance;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void removeValue(float value) {
        values.remove(value);
    }

    public void AddValue(float value) {
         values.add(value);
    }



    public void setVariance(float varience) {
        this.variance = varience;
    }



    public void processCalculations(){

        for(float val :values)
        System.out.println(operation.toString()+" uses"+ val+ " and variance"+ variance+ "for result:"+operation.calculate(val,variance));


    }
}





public class StrategyPattern {

    public static void main(String ... args) {
        MathsEngine engine = new MathsEngine();
        engine.AddValue(15);
        engine.AddValue(3);
        engine.AddValue(8);
        engine.AddValue(100);
        engine.AddValue(55);


        engine.setVariance(20);
        engine.setOperation(new Addition());

        engine.processCalculations();
    }


}
