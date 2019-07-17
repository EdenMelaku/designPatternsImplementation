package behavioralPattern;

public class itteratorPattern {

    public static void main(String ... args ){
        Numbers n=new Numbers();

        for(Itterator<Integer> itter=n.getItterator();itter.isDone()!=false;){
          System.out.println(itter.next());
        }


    }

}

interface Itterator<object>{
    public boolean hasNext();
    public object next();
    public boolean isDone();
}

class Numbers {
    Integer num[];
    public Numbers(){
        num= new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};


    }
    public Itterator<Integer> getItterator(){
        return new integerItterator();

    }
    class integerItterator implements Itterator<Integer> {

        int index=0;
        int current;

        @Override
        public boolean hasNext() {
           if ((index-1) == num.length) return true;
           if(num.length<index)  return false;
           else return true;
        }

        @Override
        public Integer next() {
            current=num[index];
            index++;
            return current;
        }

        @Override
        public boolean isDone() {
            if(index==num.length) {
                return false;
            }
            else{
                return true;
            }
        }
    }

}