package com.company.Sum;

import java.util.ArrayList;

public class Sum {


    public int summing (ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
