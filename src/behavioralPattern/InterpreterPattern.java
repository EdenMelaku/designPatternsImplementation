/*

interprets language elements in to code solution
 */


package behavioralPattern;

import java.util.ArrayList;
import java.util.regex.Pattern;



interface Expression{

     boolean interpret(String context);
}


class PythonExpression implements Expression{




    @Override
    public boolean interpret(String context) {
        String x []= context.split("\\s+");
        boolean res=false;
        System.out.println(x[1]);
        if (x[0].equalsIgnoreCase("def")){
            res=true;
        }
        else{
            return res;
        }

        if(Pattern.matches("[a-zA-Z][a-zA-Z0-9]*",x[1])){
            res=true;
            if(x.length>2)
            {
                return false;
            }

        }
        else{
            return false;
        }

        return res;
    }
}


 class JavaExpression implements Expression{

    ArrayList<String> accessModifiers= new ArrayList<>();
     ArrayList<String> nonAccessModifiers= new ArrayList<>();
     ArrayList<String> returnTypes= new ArrayList<>();




   boolean inOrder(String expression){
       nonAccessModifiers.add("static");
       nonAccessModifiers.add("final");
       nonAccessModifiers.add("abstract");


       returnTypes.add("void");
       returnTypes.add("int");
       returnTypes.add("String");
       returnTypes.add("double");
       returnTypes.add("float");



        String x []= expression.split("\\s+");


        accessModifiers.add("public");
        accessModifiers.add("private");
        accessModifiers.add("proteted");
        boolean result=false;
        int has=0;
        int i=0;
       //System.out.println(expression);
       //System.out.println(x[i]);

       if (accessModifiers.contains(x[i]) || nonAccessModifiers.contains(x[i])){
           result=true;
           has++;
           i++;
       }
       if (accessModifiers.contains(x[i]) || nonAccessModifiers.contains(x[i])){

           result=true;
           has++;
           i++;
       }


       if (returnTypes.contains(x[i])){
           result=true;
           i++;
       }

       else {
           result=false;
           return result;
       }


       if (Pattern.matches("[a-zA-Z][a-zA-Z0-9]*",x[i])){
        result=true;
        if(x.length > has+2){
            result=false;
        }

       }
       else{
           result=false;
       }

       return result;



   }


    @Override
    public boolean interpret(String context) {
        return inOrder(context);
    }

}

class UnNamedExpression implements Expression{
    String pattern;

    public UnNamedExpression(String pattern){
        this.pattern=pattern;
    }

    @Override
    public boolean interpret(String context) {
        return Pattern.matches(pattern,context);
    }


}





public class InterpreterPattern {
  public static void main(String... args){

      String javaFunction="public static void main";

      String pythonFunction="def main";

      JavaExpression javaExpression=new JavaExpression();
      PythonExpression pythonExpression=new PythonExpression();

      System.out.println(javaFunction+"== java expression  =>"+javaExpression.interpret(javaFunction));
      System.out.println(pythonFunction+"== python expression  =>"+pythonExpression.interpret(pythonFunction));

        }


}
