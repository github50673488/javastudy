package p20210202.p01_adpter_model;

public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile. 想用fit 来看看钉子合不合适，但是是方钉，没法用

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);//给方钉们装上适配器
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);//给方钉们装上适配器
        if (hole.fits(smallSqPegAdapter)) {//用适配器来使用fit（适配器里头有吧方钉的宽度转成半径的方法）
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {//用适配器来使用fit（适配器里头有吧方钉的宽度转成半径的方法）
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
