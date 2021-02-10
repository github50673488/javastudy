package p20210205_2_other_pattern.p8_Intercepting_Filter_pattern;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
