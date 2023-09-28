package chapter_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /*
        int ranking = 1;
        if (ranking == 1)
            System.out.println("전액 장학금");
        else if(ranking == 2 || ranking ==3)
            System.out.println("반액 장학금");
        else
            System.out.println("장학금 대상 아님");

        System.out.println("조회 완료");
         */

        //범위에는 if else, 명확한 값에 대해서는 switch case

        int ranking =1;

        switch(ranking){
            case 1:
                System.out.println("전액 장학금");
                break; //break 없을 시 다음 문장이 실행
            case 2:
                System.out.println("반액 장학금");
                break;
                /*  case 2:
                    case 3:
                    System.out.println("반액 장학금");
                    break;
                    >> 2와 3의 케이스에서 모두 sout 실행
                     */
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
    }
}
