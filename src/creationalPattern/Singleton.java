package creationalPattern;


public class Singleton {

    public static void main(String ... args){

        //SingleClass s=new SingleClass();
        SingleClass s=SingleClass.getInstance();
        SingleClass newObj=SingleClass.getInstance();
    }
}

class SingleClass{
    private static SingleClass instance=null;
    private SingleClass(){


    }
public static SingleClass getInstance(){
        if(instance==null){
            instance=new SingleClass();
            return instance;
        }
        else{
            System.out.println("object already created ");
            return null;
        }

}

        }