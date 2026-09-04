package com.compilerdesign;

public class JDKCompiler extends JavaCompiler {

    JDKCompiler(String name) 
    {
        super(name);
        System.out.println("JDKCompiler Constructor");
    }

    @Override
    void compile()
    {
        System.out.println(name + " is compiling using JDK...");
    }

    @Override
    JDKCompiler createCompiler()
    {
        return this;
    }

    void optimize()
    {
        System.out.println(name + " is optimizing bytecode.");
    }

}
