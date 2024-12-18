package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 06; // 나이
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
        } else if (age >= 7) { //else if 가 오게 되면 첫번때 if문을 빠져나와 중복 할인을 받지 못하게 된다.
            discount = discount + 1000;
        } else {
            System.out.println("할인 없음");

        }
        System.out.println("총 할인 금액:" + discount + "원");

    }
}
