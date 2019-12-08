package com.lomaevaav;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = 0;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 0;
        nums[6] = 0;
        nums[7] = 0;
        nums[8] = 1;
        nums[9] = 1;
        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.println("было nums[" + i + "]=" + nums[i]);
            if (nums[i] == 0)
                nums[i] = 1;
            else nums[i] = 0;
            System.out.println("стало nums[" + i + "]=" + nums[i]);
        }
        int[] array = new int[8];
        for (int a = 0; a < array.length; a = a + 1) {
            array[a] = a * 3;
            System.out.println("стало array[" + a + "]=" + array[a]);

        }
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i = i + 1) {
            if (mas[i] < 6)
                mas[i] = mas[i] * 2;
            System.out.println(mas[i]);

        }
        int[][] tabl = new int[5][5];
        for (int i = 0; i < tabl.length; i = i + 1) {
            for (int j = 0; j < tabl.length; j = j + 1) {
                if (i == j || (i + j +1 == tabl.length)) {
                    tabl[i][j] = 1;
                }
                else tabl[i][j] = 0;
                System.out.print(tabl[i][j]);
            }
            System.out.println();
        }
    }
}