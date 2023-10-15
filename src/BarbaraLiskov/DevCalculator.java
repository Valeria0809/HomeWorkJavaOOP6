package BarbaraLiskov;

import java.util.List;

public class DevCalculator {
    public double dev(List<? extends Number> numbers) {
        double result = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            result = result / numbers.get(i).doubleValue();
        }
        return result;
    }
}

