package ru.geekbrains.courses.java.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] ZeroAndOne = {1, 0, 0, 1, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(ZeroAndOne));

        int ZeroAndOneMass = ZeroAndOne.length;

        for (int i = 0; i < ZeroAndOneMass; i++)

            if (ZeroAndOne[i] == 1)
                ZeroAndOne[i] = 0;
            else ZeroAndOne[i] = 1;

        for (int i = 0; i < ZeroAndOneMass; i++) {
            System.out.print(ZeroAndOne[i] + " ");
        }

        int[] ProgressiveEight = new int[8];

        int NumArray = 0;
        int ProgressiveEightMass = ProgressiveEight.length;
        for (int i = 0; i < ProgressiveEightMass; i++, NumArray = NumArray + 3) {
            ProgressiveEight[i] = NumArray;
        }
        System.out.println("");
        for (int i = 0; i < ProgressiveEightMass; i++)
            System.out.print(ProgressiveEight[i] + " ");

        System.out.println("");

        int[] MultiplyingNumbersLessThanSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int MultiplyingNumbersLessThanSixMass = MultiplyingNumbersLessThanSix.length;

        for (int i = 0; i < MultiplyingNumbersLessThanSixMass; i++)

            if (MultiplyingNumbersLessThanSix[i] < 6)
                MultiplyingNumbersLessThanSix[i] = MultiplyingNumbersLessThanSix[i] * 2;
        for (int i = 0; i < MultiplyingNumbersLessThanSixMass; i++)
            System.out.print(MultiplyingNumbersLessThanSix[i] + " ");

        System.out.println("");

        int slot = 3;
        int[][] AllNumbersOfTheDiagonalAreOne = new int[slot][slot];

        for (int i = 0; i < slot; i++) {

            for (int j = 0; j < slot; j++) {

                if ((i == j) || (i == slot - 1 - j)) {
                    AllNumbersOfTheDiagonalAreOne[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < slot; i++) {
            for (int j = 0; j < slot; j++) {
                System.out.print(AllNumbersOfTheDiagonalAreOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        int[] MaxMin = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = MaxMin[0];
        int max = MaxMin[0];
        int i;

        for (i = 0; i < MaxMin.length; i++) {
            if (MaxMin[i] <= 1) {
                min = MaxMin[i];
            }
            if (MaxMin[i] >= 10) {
                max = MaxMin[i];
            }
        }
        System.out.println("max = " + max + " min = " + min);

    }

    public static boolean SumMass(int[] args) {
        int[] SumMass = {2, 2, 3, 5, 1, 1};
        int length = SumMass.length;
        int leftSum;
        int rightSum;

        for (int i = 0; i < length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += SumMass[j];
            }
            for (int a = i + 1; a < length; a++) {
                rightSum += SumMass[a];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
    public static void OffsetOfArrayElements(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        int n = 3;

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
