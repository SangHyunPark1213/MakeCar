package BMI_calc;
// BMI (체질량 지수)
// BMI = 몸무게 / 키(m) x 키(m)  <- 단위가 미터이기에 꼭 입력받은 키의 단위를 맞춰줘야야 함.

import java.util.Scanner;

public class Bmi_calc {
    public static void main(String[] args) {
        //1. 사용자에게 **키(cm)** 와 **몸무게(kg)** 를 입력받습니다.
        //2. 입력받은 키를 **미터 단위**로 변환한 후, BMI를 계산합니다.
        //3. 계산된 BMI 값을 출력합니다.
        //4. 조건문(if ~ else if ~ else)을 사용하여 체형을 분류하고 결과를 출력합니다.
        //- printf에서 소수점 자리수는 %.2f 형식을 사용합니다.
        //- 조건문을 이용해 입력된 값에 따라 서로 다른 메시지를 출력하세요.
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요 : ");
        double hei = sc.nextDouble();
        hei = hei / 100.0;
        System.out.print("몸무게를 입력하세요 : ");
        double wei = sc.nextDouble();
        //asd

//        System.out.println(" " + hei +  " " + wei);

        double bmi = wei / (hei * hei);
//        System.out.println(bmi);
        // 안녕하세요
        // bmi 출력
        System.out.printf("당신의 BMI는 %.2f 입니다. \n", bmi);

        // 체형 분류 후 결과 출력
        if (bmi < 18.5) System.out.println("저체중");
        else if (bmi < 23) System.out.println("정상");
        else if (bmi < 25) System.out.println("과체중");
        else System.out.println("비만");


    }
}
