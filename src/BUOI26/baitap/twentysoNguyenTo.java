package BUOI26.baitap;

import java.util.Scanner;

public class twentysoNguyenTo {
    public static void main(String[] args) {
//        int count = 0;
//        int N = 2;
//        boolean flag = true;
//        while (count <= 20){
//            for (int i = 2; i <= Math.sqrt(N);i ++) {
//                if(N % i == 0){
//                    flag = false;
//                    break;
//                }
//            }if(flag){
//                count++;
//                System.out.println(N);
//            }
//            flag = true;
//            N++;
//        }
        int number = 2;
        int count = 0;
        while (count <=20){
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    static boolean isPrime(int number){

        if(number < 2){
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0){
                    return false;
                }
            }
        }return true;
    }
}
