package chapter_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //복합 대입 연산자
        int num =10;
        System.out.println(num); //10
        num +=2;
        System.out.println(num); //12

        num=10;
        num-=2;
        System.out.println(num);//8

        num=10;
        num*=2;
        System.out.println(num); //20

        num=10;
        num/=2;
        System.out.println(num); //5

        num=10;
        num%=2;
        System.out.println(num); //0
    }
}