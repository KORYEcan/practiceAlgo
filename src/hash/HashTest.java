package hash;

public class HashTest {
    public static void main(String[] args) {
        IHashTable<String ,Integer> given = new MyLinkedHashTable<>(3);
        given.put("hello",1);
        given.put("world",3);
        given.put("korea",10);
        given.put("awsome",5);
        given.put("data",3);
        given.put("hard",111);

        given.delete("hard");

        System.out.println(given.get("hello"));
        System.out.println(given.get("korea"));
        System.out.println(given.get("hard"));

    }
}
