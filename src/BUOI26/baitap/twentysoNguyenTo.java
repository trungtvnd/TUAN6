package BUOI26.baitap;

public class twentysoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        boolean flag = true;
        while (count <= 20){
            for (int i = 2; i <= Math.sqrt(N);i ++) {
                if(N % i == 0){
                    flag = false;
                    break;
                }
            }if(flag){
                count++;
                System.out.println(N);
            }
            flag = true;
            N++;
        }
    }
}
