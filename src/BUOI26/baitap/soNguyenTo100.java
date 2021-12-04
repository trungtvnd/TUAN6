package BUOI26.baitap;

public class soNguyenTo100 {
    public static void main(String[] args) {
        int N = 2;
        boolean flag = true;
        while (N < 100) {
            for (int i = 2; i < Math.round(Math.sqrt(N)); ) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }
                i++;

            }
            if (flag) {
                System.out.println(N);

            }
            flag = true;
            N++;
        }
    }
}
