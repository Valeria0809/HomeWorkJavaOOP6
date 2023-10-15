package OpenClosePrinciple;

import java.util.List;

/** Класс для деления останется в отдельном классе и будет соответствовать принципу разделения S.
 */
public class DevCalculator {
    public double dev(List<? extends Number> numbers) {
        double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            res = res / numbers.get(i).doubleValue();
        }
        return res;
    }
}