
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = tax(num1) + num1;
        System.out.println(num1 + "円の商品の税込価格は"+ num2 + "円(消費税は" + tax(num1) + "円)です。");
    }
    
    public static int tax(int num1){
        double result = (double) num1*0.1;
        return (int) result;
    }

}
