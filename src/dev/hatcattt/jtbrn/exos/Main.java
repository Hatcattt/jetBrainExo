package dev.hatcattt.jtbrn.exos;

// You need to follow constructor via this() and super() keywords.
// Also, remember that the print() method print String in the same line.
// follow my comments and the steps, hope this help you

public class Main {
    public static void main(String[] args) {
        C c = new C(); // 1 <- you start here, go to the C constructor with no parameter
    }
}

class A {
    protected int n = 10;
    // here, there is a default constructor, but it is not necessary to write it
    // 5 <- return to the B constructor
}

class B extends A {
    protected int n = 20;

    public B() {
        super(); // 4 <- go to the parent constructor (B extends A, so A is the parent constructor)
        System.out.print(n); // 6 <- print the attribute 'n' of this class
                             // result on the console : 20
                             // 7 <- get back to the second C constructor
    }
}

class C extends B {
    protected int n = 30;

    public C() {
        this(5); // 2 <- go to the constructor juste bellow
        System.out.print(n); // 10 <- finally, print the attribute 'n' of this class
                             // result on the console : 20530
                             // et voilà :-) !
    }

    public C(int n) {
        super(); // 3 <- go to the parent constructor (C extends B, so B is the parent constructor)
        super.n = n; // 8 <- super.n (the attribute 'n' of the class B) = n in parameter
        System.out.print(n); // <- print n (the n in parameter)
                             // result on the console : 205
                             // 9 <- get back to the C constructor up there
    }
}