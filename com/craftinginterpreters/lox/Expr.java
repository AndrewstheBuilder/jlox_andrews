package com.craftinginterpreters.lox;

abstract class Expr {
    // Expr is the base class all expression classes inherit from

    static class Binary extends Expr {
        // Binary expression class is a subclass of Expr
        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        final Expr left;
        final Token operator;
        final Expr right;
    }

    // Other expressions...
}