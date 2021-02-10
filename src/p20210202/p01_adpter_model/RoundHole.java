package p20210202.p01_adpter_model;

public class RoundHole {
    private double radius;//半径

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());//孔比钉大就OK
        return result;
    }
}
