package p20210205_2_other_pattern.p4_Business_Delegate_pattern;

public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
