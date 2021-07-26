public class Main {

    public static void main(String[] args) {
	// write your code here
        BMI person1 = new BMI("John",176,70);
        System.out.println(person1.getBMI());
        System.out.println(person1.getStatus());

        System.out.println("-----------------------");

        BMI person2 = new BMI("Sean",244,124);
        System.out.println(person2.getBMI());
        System.out.println(person1.getStatus());
    }
}
