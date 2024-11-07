
class Clock {

    public static void main(String[] args) {
        int result=getSeconds(1444, 52, 23);
        System.out.println(result + "秒");
    }
    
    public static int getSeconds(int num1, int num2, int num3) {
        int seconds = num1*3600 + num2*60 + num3;
        return seconds;
    }

}
