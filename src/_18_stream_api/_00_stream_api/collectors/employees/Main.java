package _18_stream_api._00_stream_api.collectors.employees;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Александр", 56),
                new Employee("Максим", 33),
                new Employee("Алексей", 25),
                new Employee("Максим", 52),
                new Employee("Иван", 33),
                new Employee("Александр", 18)
        );

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge)) // Map<Integer, List<Employee>>
                .forEach((age, employeeList) -> System.out.printf("Возраст %s: %s\n", age, employeeList));
//        Возраст 33: [Максим, Иван]
//        Возраст 18: [Александр]
//        Возраст 25: [Алексей]

        Double avgAge = employees.stream()
                .collect(Collectors.averagingInt(Employee::getAge));

        System.out.println(avgAge); // 27.25

        IntSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println(statistics); // IntSummaryStatistics{count=4, sum=109, min=18, average=27,250000, max=33}

        // Grouping by name
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(collect);
    }

}
