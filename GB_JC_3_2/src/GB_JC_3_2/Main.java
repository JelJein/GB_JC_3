package GB_JC_3_2;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        System.out.println("Weight in orange box: " + orangeBox.getWeight());
        System.out.println("Weight in apple box1: " + appleBox1.getWeight());
        System.out.println("Weight in apple box2 : " + appleBox2.getWeight());

        System.out.print("Are boxes 1 and 2 have same weight? - ");
        System.out.println(appleBox1.compare(appleBox2));

        System.out.println("We took All from box1 and put to box2");
        appleBox1.addAll(appleBox2);

        System.out.println("Weight in box1 is: " + appleBox1.getWeight());
        System.out.println("Weight in box2 is: " + appleBox2.getWeight());
    }
}
