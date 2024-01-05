package com.craftinginterpreters.lox;

public abstract class Expr {
    public abstract <R> R accept(Visitor<R> visitor);

    public static class Binary extends Expr {
        public Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        final Expr left;
        final Token operator;
        final Expr right;

        @Override
        public <R> R accept(Visitor<R> visitor) {
           return visitor.visitBinaryExpr(this);
        }
    }

    public static class Grouping extends Expr {
        public Grouping(Expr expression) {
            this.expression = expression;
        }

        final Expr expression;

        @Override
        public <R> R accept(Visitor<R> visitor) {
           return visitor.visitGroupingExpr(this);
        }
    }

    public static class Literal extends Expr {
        public Literal(Object value) {
            this.value = value;
        }

        final Object value;

        @Override
        public <R> R accept(Visitor<R> visitor) {
           return visitor.visitLiteralExpr(this);
        }
    }

    public static class Unary extends Expr {
        public Unary(Token operator, Expr right) {
            this.operator = operator;
            this.right = right;
        }

        final Token operator;
        final Expr right;

        @Override
        public <R> R accept(Visitor<R> visitor) {
           return visitor.visitUnaryExpr(this);
        }
    }

    public interface Visitor<T> {
        public T visitBinaryExpr(Expr.Binary expr);

        public T visitGroupingExpr(Expr.Grouping expr);

        public T visitLiteralExpr(Expr.Literal expr);

        public T visitUnaryExpr(Expr.Unary expr);
    }

}
