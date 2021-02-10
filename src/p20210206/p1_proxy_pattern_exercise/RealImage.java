package p20210206.p1_proxy_pattern_exercise;

public class RealImage implements Image {

    String filename = "";

    public RealImage(String filename) {
        this.filename = filename;
        this.load(filename);
    }

    @Override
    public void display() {
        System.out.println(filename + " Displayed");
    }

    private void load(String filename) {
        if(filename.length()==0)
        {
            return;
        }
        System.out.println(filename + " Loaded");
    }
}
