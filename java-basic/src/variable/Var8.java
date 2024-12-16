package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; ////-2,147,483,648 ~ 2,147,483,647 (약 20억 ㄷㄷ)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d =10.0;

        /* byte, short, float, char는 실무에서 거의 사용x
            정수- int, long
            실수- double :실수는 고민하지 말고 double
            불린형- boolean:true, false
            문자열- String: 문자를 다룰 때는 문자 하나든 문자열이든 모두 Strig을 사용하는 것이 편리하다.

         */

    }
}
