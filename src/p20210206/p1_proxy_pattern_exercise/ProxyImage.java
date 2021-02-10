package p20210206.p1_proxy_pattern_exercise;

public class ProxyImage implements Image{

    private String filename="";
    private RealImage realImage=null;

    public ProxyImage(String filename) {
        this.setFilename(filename);
    }

    private boolean isFileValid()
    {
        return this.filename.length()>0;
    }

    private void logSomething()
    {
        System.out.println("Log something...");
    }

    @Override
    public void display() {
        if(!isFileValid())
        {
            System.out.println("File name invalid");
            return;
        }
        if(realImage==null)
        {
            realImage = new RealImage(this.filename);
        }
        realImage.display();
        logSomething();
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
