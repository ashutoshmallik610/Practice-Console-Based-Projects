package com.compilerdesign;

public class JavaCompiler extends Compiler implements Executable {

    JavaCompiler(String name) 
    {
        super(name);
        System.out.println("JavaCompiler Constructor");
    }

    @Override
    void compile() 
    {
        System.out.println(name + " is compiling Java source...");
    }

    @Override
    public void execute() 
    {
        System.out.println(name + " is executing compiled code...");
    }

    @Override
    JavaCompiler createCompiler() 
    {
        return this;
    }
}
