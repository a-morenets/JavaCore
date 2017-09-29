package _18_stream_api._99_samples.collectors.employees;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("���������", 18),
                new Employee("������", 33),
                new Employee("�������", 25),
                new Employee("����", 33)
        );

        Map<Integer, List<Employee>> employeesMap = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        employeesMap.forEach((age, e) -> System.out.printf("������� %s: %s\n", age, e));
//        ������� 33: [������, ����]
//        ������� 18: [���������]
//        ������� 25: [�������]

        Double avgAge = employees.stream()
                .collect(Collectors.averagingInt(Employee::getAge));

        System.out.println(avgAge);
//27.25

        IntSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println(statistics);
//IntSummaryStatistics{count=4, sum=109, min=18, average=27,250000, max=33}
    }

}
