package ru.muctr.KeyWordSUPER;

/**
 * @author Evgenia Skichko
 */
public class Subclass extends SuperClass{
    int i = 10;

    @Override
    public void someMethod() {
        System.out.println("In SUBclass");
    }

    public void testInheritance(){
        System.out.println("Variable i in SUPERclass = " + super.i);
        System.out.println("Variable i in SUBclass = " + i);

        someMethod();
        super.someMethod();
    }
}
