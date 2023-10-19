import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}