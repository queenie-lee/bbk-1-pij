package week14;
public class ExpressionDriver {
    public static void main(String[] args) {
        Expression e = new PlusExpression(new IntConstant(2),
                new TimesExpression(new IntConstant(3), new IntConstant(4)));
        System.out.println(e.toString());
    }
}