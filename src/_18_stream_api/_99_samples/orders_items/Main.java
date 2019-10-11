package _18_stream_api._99_samples.orders_items;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * Есть список ордеров, у каждого ордера есть айтем (иногда пересекается).
     * У айтема есть название (стринг) и статус (енам - 2-3 значения).
     * Система умеет все это различать.
     * Вывести с помощью стримов список айтемов без дублей.
     * Список ордеров у которых есть айтемы с заданным статусом.
     */
    public static void main(String[] args) {
        Item item1 = new Item("PC", Status.RESERVED);
        Item item2 = new Item("Notepad", Status.PRESENT);
        Item item3 = new Item("Mouse", Status.PRESENT);
        Item item4 = new Item("Notebook", Status.SOLD);
        Item item5 = new Item("Printer", Status.RESERVED);
        Item item6 = new Item("HDD", Status.SOLD);
        Item item7 = new Item("SSD", Status.PRESENT);
        Item item8 = new Item("FDD", Status.SOLD);
        Item item9 = new Item("Monitor", Status.RESERVED);

        List<Item> list1 = new ArrayList<Item>() {
            {
                add(item4);
                add(item7);
                add(item1);
                add(item3);
            }
        };

        List<Item> list2 = new ArrayList<Item>() {
            {
                add(item5);
                add(item1);
                add(item2);
            }
        };

        List<Item> list3 = new ArrayList<Item>() {
            {
                add(item9);
                add(item7);
                add(item3);
            }
        };

        List<Item> list4 = new ArrayList<Item>() {
            {
                add(item1);
                add(item2);
                add(item3);
                add(item4);
                add(item5);
            }
        };

        List<Item> list5 = new ArrayList<Item>() {
            {
                add(item8);
            }
        };

        List<Item> list6 = new ArrayList<Item>() {
            {
                add(item3);
                add(item5);
                add(item7);
                add(item8);
            }
        };

        List<Item> list7 = new ArrayList<Item>() {
            {
                add(item9);
                add(item7);
                add(item5);
                add(item3);
                add(item1);
                add(item2);
                add(item4);
                add(item6);
            }
        };

        List<Order> orderList = new ArrayList<Order>() {
            {

                add(new Order("ID_2435", list1));
                add(new Order("ID_9854", list2));
                add(new Order("ID_3215", list3));
                add(new Order("ID_9874", list4));
                add(new Order("ID_5524", list5));
                add(new Order("ID_1245", list6));
                add(new Order("ID_9137", list7));
            }
        };

        // Вывести с помощью стримов список айтемов без дублей.
        System.out.println("\nВывести с помощью стримов список айтемов без дублей:");
        orderList.stream()
                .flatMap(order -> order.getItems().stream())
//                .distinct()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // Список ордеров у которых есть айтемы с заданным статусом.
        System.out.println("\nСписок ордеров у которых есть айтемы с заданным статусом:");
        orderList.stream()
                .filter(order -> order.getItems().stream().anyMatch(item -> item.getStatus() == Status.RESERVED))
                .forEach(System.out::println);

        // Список айтемов и ордеров, в которых они встречаются
/*
        orderList.stream()
                .collect(Collectors.toMap(order -> order, Order::getItems))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey))
                .entrySet().stream()
*/
    }
}
