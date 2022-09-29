// s를 k로 변환

public class StringBuilderDemo {
    public static void main(String[] args) {
        String k = new String("hi");
        System.out.println(k.hashCode());
        k = k + "!";
        System.out.println(k.hashCode());

        StringBuilder kb = new StringBuilder("hi");
        System.out.println(kb.hashCode());
        kb = kb.append("!");
        System.out.println(kb.hashCode());

        System.out.println(kb.replace(0, 2, "Goodbye").insert(0, "Java, "));
    }
}