package com.driver;

class A
{
    public String meth()
    {
        return "Method is overridden in Extendend class B";
    }
}

class B extends A
{

}
public class Main {

    A obj = new B();

    String ans = obj.meth();
}