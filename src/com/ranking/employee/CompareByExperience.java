package com.ranking.employee;

import java.util.Comparator;

public class CompareByExperience implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        Developer d1 = (Developer) e1;
        Developer d2 = (Developer) e2;

        return d1.getExperience() - d2.getExperience();
    }
}