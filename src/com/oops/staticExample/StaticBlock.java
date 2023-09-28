package com.oops.staticExample;

/** Demo class to show initialization of static variables */
public class StaticBlock {
    static int a = 4;
    static int b;

    /** Static block gets executed only once, when the class is loaded for the first time. */
    static {
        System.out.println("I am in a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
