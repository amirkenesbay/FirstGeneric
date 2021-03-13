public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Amir");
        Box<Integer> box2 = new Box<>(21);
        System.out.println(box1.getObj());
        box2.setObj(25);
        System.out.println(box2.getObj());

    }
}
