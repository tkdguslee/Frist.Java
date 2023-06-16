public class Main_3 {
    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or float형 -> int
        // 실수 -> 정수(0.xxx -> 0)
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        // 변환(int)
        int intNumber;
        intNumber = (int)floatNumber;

        System.out.println("Float Type => " + floatNumber);
        System.out.println("Int Type => " + intNumber);

//        int intNumber;
//        System.out.println(doubleNumber);
//        intNumber = (int)doubleNumber; // double -> int






    }

}
