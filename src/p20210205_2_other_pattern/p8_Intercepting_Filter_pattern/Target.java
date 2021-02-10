package p20210205_2_other_pattern.p8_Intercepting_Filter_pattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
