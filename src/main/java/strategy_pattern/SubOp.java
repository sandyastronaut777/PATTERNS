package strategy_pattern;

public class SubOp implements Strategy{
    @Override
    public int performOp(int n1, int n2) {
        return (n1-n2);
    }
}
