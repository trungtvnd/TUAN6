package BUOI27.thuchanh;

import java.util.Arrays;

public class mangHaiChieu {
    public static void main(String[] args) {
//        int[][] a = {{1, -2, 3}, {1, 3, 4, 7, 7}, {7}};
//            Sử dụng for each dẻ duyệt mảng
//        for (int[] element : a) {
//            for (int factor : element) {
//                System.out.println(factor);
//            }
//        }
//        Sao chép mảng bằng toán tử gán, Nếu bạn thay đổi các phần tử của một mảng trong ví dụ trên,
//        các phần tử tương ứng của mảng kia cũng bị thay đổi. (Shallow coppy)
//        int[] numbers = {1, 3, 5, 7};
//        int[] positiveNumbers = numbers;
//        for (int number : positiveNumbers) {
//            System.out.println(number);
//        }

//        Sử dụng cấu trúc vòng lặp để sao chép mảng deep coppy
//
//        int[] destination = new int[6];
//        for (int i = 0; i < numbers.length; i++) {
//            destination[i] = numbers[i];
//            System.out.println(destination[i]);
//        }

//        Sử dụng lớp System có hàm arraycopy() cho phép chúng ta sao chép dữ liệu từ mảng này sangmangr khác
//        public static void arraycopy(Object src, int srcPos,
//        Object dest, int destPos, int length)  (mảng muốn sao chép, vị trí bắt đầu sao chép, mảng đích, vị trí muốn sao chép đến trong mảng đích, độ dài muốn sao chép)
//        int[] n1 = {2, 3, 21, 4, 5, -2};
//        int[] n3 = new int[n1.length];
//        int[] n2 = new int[5];
//        System.arraycopy(n1,0, n3, 0, n1.length);
//        System.out.println(Arrays.toString(n3));
//        System.arraycopy(n1,1, n2, 0, 3);
//        System.out.println(Arrays.toString(n2));
//Sao chép mảng sử dụng hàm copyOfRange()
//        int[] source = {2, 3, 12, 4, 12, -2};
//
//        // copying entire source array to destination
//        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
//        System.out.println("destination1 = " + Arrays.toString(destination1));
//
//        // copying from index 2 to 5 (5 is not included)
//        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
//        System.out.println("destination2 = " + Arrays.toString(destination2));
//        Sao chép mảng 2d không đều

        int [][] source = {{1, 2, 3, 4}, {5, 6}, {0, 42, 67}};
        int [][] destination = new int[source.length][];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = new int[source[i].length];
            for (int j = 0; j < destination[i].length; j++) {
                destination[i][j] = source[i][j];
            }
        }
        System.out.println(Arrays.deepToString(destination));
    }
}

