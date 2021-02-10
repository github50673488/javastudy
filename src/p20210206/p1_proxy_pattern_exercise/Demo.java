package p20210206.p1_proxy_pattern_exercise;

public class Demo {
    public static void main(String[] args) {

        System.out.println("----★★★real-------");

        RealImage realImage= new RealImage("");
        realImage.display();// show prompt

        RealImage realImage1= new RealImage("abc.png");
        realImage.display();


        System.out.println("----★★★proxy-------");

        ProxyImage proxyImage= new ProxyImage("");
        proxyImage.display();// show prompt
        System.out.println("----proxy show filename err prompt-------");

        proxyImage.setFilename("abc.png");
        proxyImage.display();



    }
}
