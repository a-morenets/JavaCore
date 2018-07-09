package _18_stream_api._00_creation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://habrahabr.ru/company/luxoft/blog/270383/
 */
public class StreamCreate {

    public static void main(String[] args) throws IOException {
        System.out.println("Test buildStream start");

        // �������� ������ �� ��������
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        System.out.println("streamFromValues = " + streamFromValues.collect(Collectors.toList())); // ���������� streamFromValues = [a1, a2, a3]

        // �������� ������ �� �������
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        System.out.println("streamFromArrays = " + streamFromArrays.collect(Collectors.toList())); // ���������� streamFromArrays = [a1, a2, a3]

        Stream<String> streamFromArrays1 = Stream.of(array);
        System.out.println("streamFromArrays1 = " + streamFromArrays1.collect(Collectors.toList())); // ���������� streamFromArrays = [a1, a2, a3]

        // �������� ������ �� ����� (������ ������ � ����� ����� ��������� ������� � ������)
        File file = new File("1.tmp");
        file.deleteOnExit();
        PrintWriter out = new PrintWriter(file);
        out.println("a1");
        out.println("a2");
        out.println("a3");
        out.close();

        Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
        System.out.println("streamFromFiles = " + streamFromFiles.collect(Collectors.toList())); // ���������� streamFromFiles = [a1, a2, a3]

        // �������� ������ �� ���������
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();
        System.out.println("streamFromCollection = " + streamFromCollection.collect(Collectors.toList())); // ���������� streamFromCollection = [a1, a2, a3]

        // �������� ��������� ������ �� ������
        IntStream streamFromString = "123".chars();
        System.out.print("streamFromString = ");
        streamFromString.forEach((e) -> System.out.print(e + " , ")); // ���������� streamFromString = 49 , 50 , 51 ,
        System.out.println();

        // � ������� Stream.builder
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder
                .add("a1")
                .add("a2")
                .add("a3")
                .build();
        System.out.println("streamFromBuilder = " + streamFromBuilder.collect(Collectors.toList())); // ���������� streamFromFiles = [a1, a2, a3]

        // �������� ����������� �������
        // � ������� Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println("streamFromIterate = " + streamFromIterate.limit(3).collect(Collectors.toList())); // ���������� streamFromIterate = [1, 3, 5]

        // � ������� Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("streamFromGenerate = " + streamFromGenerate.limit(3).collect(Collectors.toList())); // ���������� streamFromGenerate = [a1, a1, a1]

        // ������� ������ �����
        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty = " + streamEmpty.collect(Collectors.toList())); // ���������� streamEmpty = []

        // ������� ������������ ����� �� ���������
        Stream<String> parallelStream = collection.parallelStream();
        System.out.println("parallelStream = " + parallelStream.collect(Collectors.toList())); // ���������� parallelStream = [a1, a2, a3]
    }

}
