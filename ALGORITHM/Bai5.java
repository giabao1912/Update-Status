import java.text.DecimalFormat;

public class Bai5 {
  public static void main(String[] args) {
    // float x = (float)123.2324;
    // int y = (int)x;
    // System.out.println(x);
    // System.out.println(y);

    int a = 323232;
    int b = 123;
    double c = (double)a / b;
    System.out.println(c);


    DecimalFormat decimalFormat = new DecimalFormat("#.####");
    System.out.println(decimalFormat.format(c));
  }
}
