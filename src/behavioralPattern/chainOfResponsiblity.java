package behavioralPattern;

import java.util.Date;

public class chainOfResponsiblity {

}

 abstract class HealthCare{


     HealthCare nextCenter;

     abstract public void diagnosePatient();



}

class FirstAid extends HealthCare{


    @Override
    public void diagnosePatient() {
        System.out.println("patient given first aid ");
    }
}


class Clinic extends HealthCare{


    @Override
    public void diagnosePatient() {
        System.out.println("person treated in ");
    }
}
