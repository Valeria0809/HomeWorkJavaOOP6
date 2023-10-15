package BarbaraLiskov;

import java.util.List;

/**Создан класс MultSuperClass он наследуется от MultCalculator.
 * MultSuperClass отличается тем что в нем есть параметр plus,
 * который увеличивает итоговое значение на 100.
 *
 * Именно это и есть нарушение этого метода,
 * так как наследник меняет работу родительского класса.
 *
 * Если мы вызываем метод operation из класса MultCalculator - все нормально.
 * А если вызвать его из класса MultSuperClass - то мы получим другое значение.
 *
 */
public class MultSuperClass extends MultCalculator{
    protected double plus = 100.0;

    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res + plus;
    }
}