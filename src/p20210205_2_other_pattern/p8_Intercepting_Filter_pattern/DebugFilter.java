package p20210205_2_other_pattern.p8_Intercepting_Filter_pattern;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
