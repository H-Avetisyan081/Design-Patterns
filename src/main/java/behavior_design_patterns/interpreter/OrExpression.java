package behavior_design_patterns.interpreter;

public class OrExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context)
                || expression1.interpret(context);
    }

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
