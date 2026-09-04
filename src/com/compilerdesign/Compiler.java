package com.compilerdesign;

public abstract class Compiler {

    protected String name;

    // Static Block
    static 
    {
        System.out.println("Compiler Version : 1.0 Loaded");
    }

    // Instance Block
    {
        System.out.println("Compiler Environment Initialized");
    }

    Compiler(String name) {
        this.name = name;
        System.out.println("Compiler Constructor");
    }

    abstract void compile();

    Compiler createCompiler() 
    {
        return this;
        
    }
	
}
