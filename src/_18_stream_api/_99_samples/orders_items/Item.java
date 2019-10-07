package _18_stream_api._99_samples.orders_items;

public class Item {

    String name;
    Status status;

    public Item(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
