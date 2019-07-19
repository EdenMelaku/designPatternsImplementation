/*
i take team building  as an example to show bulider pattern
 */

package creationalPattern;

import java.util.ArrayList;

interface HabshaDigis{
public String name();
public Packing packaging();


}

interface Packing{

    String pack();
}

class Sehan implements Packing{

    @Override
    public String pack() {
        return "sehan";
    }
}

class Birchiko implements Packing{

    @Override
    public String pack() {
        return "birchiko";
    }
}

 class Beverage implements HabshaDigis{


     @Override
     public String name() {
         return "bevrage";
     }

     @Override
     public Packing packaging() {
         return new Birchiko() ;
     }
 }

 class Migib implements HabshaDigis{


     @Override
     public String name() {
         return "migib";
     }

     @Override
     public Packing packaging() {
         return new Sehan();
     }
 }


class Tela extends Beverage{
    @Override
    public String name() {
        return "tela";
    }

    @Override
    public Packing packaging() {
        return new Birchiko() ;
    }
}

 class Tejj extends Beverage{
     @Override
     public String name() {
         return "tejj";
     }

     @Override
     public Packing packaging() {
         return new Birchiko() ;
     }

}

 class YetsomMigib extends Migib{

    @Override
    public String name() {
        return "yetsom migib";
    }

    @Override
    public Packing packaging() {
        return new Sehan();
    }
}

 class YefisikMigib extends Migib{

    @Override
    public String name() {
        return "yefisik migib";
    }

    @Override
    public Packing packaging() {
        return new Sehan();
    }

}

class Bufie {
    ArrayList<BufieMansat> list=new ArrayList<>();

    void addFood(BufieMansat digis ){
        list.add(digis);

    }
    void showFood(){
       for(BufieMansat l : list){

           System.out.println("migib type = "+l.getM().name());
           System.out.println("migib package type = "+l.getM().packaging());
           System.out.println("bevrage type = "+l.getB().name());
           System.out.println("bevrage package type = "+l.getB().packaging());


       }
    }
}

class BufieMansat{

   private Migib m;
   private Beverage b;
  BufieMansat yetsom(){
      BufieMansat yet=new BufieMansat();
      yet.setM(new YetsomMigib());
      yet.setB(new Tejj());
      return yet;
  }
  BufieMansat yefisik() {
      BufieMansat yef=new BufieMansat();
      yef.setM(new YefisikMigib());
      yef.setB(new Tela());
      return yef;
  }

    public Migib getM() {
        return m;
    }

    public void setM(Migib m) {
        this.m = m;
    }

    public Beverage getB() {
        return b;
    }

    public void setB(Beverage b) {
        this.b = b;
    }
}


public class BuilderPattern {


    public static void main(String ... args ){

    BufieMansat bufieMansat=new BufieMansat();
    Bufie b=new Bufie();
            b.addFood(bufieMansat.yetsom());
    System.out.println("yetsom migboch");
    b.showFood();
    }

}


