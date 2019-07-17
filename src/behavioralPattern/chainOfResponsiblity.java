package behavioralPattern;

import java.util.Date;

public class chainOfResponsiblity {

}

 abstract class Court{

     int case_number;
     Date applicationDate;
     boolean status;
     Court nextCourt;

     abstract public void writeDecision();
     abstract public void setNextCourt();



}

class FirstLevelCourt extends Court{
    int case_number;
    Date applicationDate;
    boolean status;
    Court nextCourt;
    @Override
    public void writeDecision() {

    }

    @Override
    public void setNextCourt() {

    }
}class FirstLevelCourt extends Court{
    int case_number;
    Date applicationDate;
    boolean status;
    Court nextCourt;
    @Override
    public void writeDecision() {

    }

    @Override
    public void setNextCourt() {

    }
}