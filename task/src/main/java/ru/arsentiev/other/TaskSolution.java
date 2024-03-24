package ru.arsentiev.other;

import ru.arsentiev.entities.Company;

import java.util.ArrayList;

public class TaskSolution {
    public static void main(String[] args) {
        Company company = new Company(ArrayList::new, ArrayList::new, ArrayList::new);
        company.countResult(ArrayList::new);
        company.outputResultWithoutRoute();
        company.outputResultWithRoute();
    }
}
