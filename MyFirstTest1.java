public class MyFirstTest1 {

    public void log(int[] number){
        System.out.println(number[2]);
    }

    public static void main(String arg[]){
        int[] a = new int[2];
        a[1]=20;
        new MyFirstTest1().log(a);
    }

}
