
/*

chain of responsiblity exists in health organzations
if some one got an accident they first
got to FirstAid ---> clinic ------->hospital

 */

package behavioralPattern;



public class chainOfResponsiblity {

    public static void main(String ... args){

        HealthCare firstAid=new FirstAid();
        HealthCare clinic = new Clinic();
        HealthCare hospital = new Hospital();

        firstAid.nextCenter=clinic;
        clinic.nextCenter=hospital;
        hospital.nextCenter=null;

        firstAid.diagnosePatient();


    }



}

 abstract class HealthCare{


     HealthCare nextCenter;

     abstract public void diagnosePatient();



}

class FirstAid extends HealthCare{


    @Override
    public void diagnosePatient() {
        System.out.println("patient given first aid ");
        nextCenter.diagnosePatient();
    }
}


class Clinic extends HealthCare{


    @Override
    public void diagnosePatient() {
        System.out.println("person treated in clinic");
        nextCenter.diagnosePatient();

    }
}

class Hospital extends HealthCare{


    @Override
    public void diagnosePatient() {
        System.out.println("person treated in hospital");
    }
}
