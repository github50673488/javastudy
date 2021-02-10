package p20210205.p25_visitor_pattern1;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
