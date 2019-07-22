package behavioralPattern;
/*
oberver pattern facilitates communication between any parent class and its child classes
changes in parent class will be sent to any dependent child class

this example shows observer pattern with a hirarchy of a managmet
process which includes the general manager sends any notification to the lower level managers
 */


import java.util.ArrayList;
import java.util.List;

interface Manager{
public void update(Object decision);
}

class HRM implements Manager{
    private String decision;
    public HRM(){
        decision="old decision";
    }
    @Override
    public void update(Object decision) {
        this.setDecision((String) decision);

    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
}

class MarketingManager implements Manager{
    private String decision;
    public MarketingManager(){
        decision="old decision";

    }
    @Override
    public void update(Object decision) {
        this.setDecision((String) decision);

    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
}


class Management{

    String decision;
    List<Manager> managers =new ArrayList<>();
    void addObserver(Manager manager){
        this.managers.add(manager);
    }

    void removeObserver(Manager manager){
        this.managers.remove(manager);
    }
    void setDecision(String decision){
        this.decision=decision;
        for (Manager manager:this.managers){
            manager.update(this.decision);
        }
    }


}






public class observerPattern {

    public static void main(String...args){
        Management m=new Management();
        HRM h=new HRM();
        MarketingManager marM=new MarketingManager();

        m.addObserver(h);
        m.setDecision("new decision");

        System.out.println(h.getDecision());
        System.out.println(marM.getDecision());
        m.addObserver(marM);
        m.setDecision("final decision");


        System.out.println(h.getDecision());
        System.out.println(marM.getDecision());

    }


}




