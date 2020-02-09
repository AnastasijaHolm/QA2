import org.junit.jupiter.api.Test;

public class JavaBasics {
    @Test
    public void javaBasics() {
//        int a = 10;
//        int b = 15;
        sumTwodiggits(10, 15);
//        System.out.println("Sum of a and b is: " + c);


//        int g = 30;
//        int h = 45;
        sumTwodiggits(30, 45);

//        System.out.println(i);


//        String d = "10";
//        String e = "15";
        sumTwodiggits("10", "15");
//        System.out.println(f);
    }

    private void sumTwodiggits(int a, int b) {
        int c = a + b;
        System.out.println("Sum is: " + c);

    }

    private void sumTwodiggits(String a, String b) {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e = c + d;
        sumTwodiggits(c, d);

    }


}
