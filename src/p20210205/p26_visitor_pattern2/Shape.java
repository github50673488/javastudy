package p20210205.p26_visitor_pattern2;


public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
