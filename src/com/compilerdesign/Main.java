package com.compilerdesign;

public class Main {

    public static void main(String[] args) {

        Compiler[] compilers = new Compiler[2];
        
        compilers[0] = new JavaCompiler("Java Compiler");
        compilers[1] = new JDKCompiler("JDK Compiler");
        
        StringBuilder report = new StringBuilder();

        for(Compiler c : compilers)
        {
            c.compile();

            report.append(c.name).append(" compiled successfully\n");

            if(c instanceof JavaCompiler)
            {
                JavaCompiler javaCompiler = (JavaCompiler)c;
                
                javaCompiler.execute();
            }

            if(c instanceof JDKCompiler)
            {
            	JDKCompiler jdk = (JDKCompiler)c;
                
                jdk.optimize();

                report.append(c.name).append(" optimized successfully\n");
            }
        }

        System.out.println("\nCompilation Report");
        System.out.println(report);
        
    }
}