package Home_work_3;

import java.util.Arrays;

public class Home_work_3 {
    public static void main(String[] args) {
        int [] mass7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(method_2(mass7));
        method_1(7, 3);
        int [] mass8 = {1,2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(method_3(mass8, 2)));

        //Задание №1//
        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (mass1[i]+1)%2;
        }
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i] + " ");
        }
        //Задание №2//
        int [] mass2 = new int[100];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = i + 1;
        }
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i] + " ");
        }
        //Задание №3//
        int [] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i ++) {
            if (mass3[i] < 6){
                mass3[i] *= 2;
            }
        }
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i] + " ");
        }
        //Задание №4//
        int[][] mass4 = new int[4][4];
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4.length; j++) {
                if (i == j || i+j == mass4.length - 1){
                    mass4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4.length; j++) {
                System.out.print(mass4[i][j] + " ");
            }
            System.out.print("\n");
        }
        //Задание №6//
        int [] mass6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = mass6[0];
        int max = mass6[0];
        for (int i = 0; i != mass6.length; i++) {
            if (mass6[i] < min)
            {
                min = mass6[i];
            }
            if (mass6[i] > max)
            {
                max = mass6[i];
            }
        }
        System.out.println(min + " " +max);
    }
    //Задание №5//
    public static int [] method_1 (int len, int initialValue) {
        int mass5[] = new int[len];
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = initialValue;
            System.out.print(mass5[i] + " ");
        }
        return mass5;
    }
    //Задание №7//
    public static boolean method_2 (int [] mass7) {
        int leftsum = 0;
        for (int i = 0; i < mass7.length; i++) {
            leftsum += mass7[i];
            int rightsum = 0;
            for (int j = 0; j < mass7.length; j++) {
                rightsum += (j > i) ? mass7[j] : 0;
            }
            if (leftsum == rightsum) {
                return true;
            }
        }
        return false;
    }
    //Задание №8//
    public static int[] method_3 (int [] mass8, int n) {
        int n1 = n % mass8.length + mass8.length;
        for (int i = 0; i < n1; i++) {
            int n2 = mass8[mass8.length - 1];
            for (int j = mass8.length - 1; j > 0; j--) {
                mass8[j] = mass8[j - 1];
            }
            mass8[0] = n2;
        }
        return mass8;
    }
}
