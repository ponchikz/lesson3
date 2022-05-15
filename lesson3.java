public class lesson3 {
    public static void main(String[] args) {

        //1
        /*
        ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������:
        [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. � ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
         */
        int[] arr1 = {1, 1, 0, 1, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //2
        /*
        ������ ������ ������������� ������ ������ 100. � �������
        ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 � 100
         */
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //3
        /*
        ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������
        �� ���� ������, � ����� ������� 6 �������� �� 2
         */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        //4
        /*
        ������� ���������� ��������� ������������� ������ (���������� ����� � ��������
        ����������), � � ������� �����(-��) ��������� ��� ������������ �������� ���������
        (����� ������ ���� �� ����������, ���� ��� ������). ���������� �������� ����� ��
        ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, �� ���� [0][0],
        [1][1], [2][2], �, [n][n]
         */
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
        }
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][arr4.length - 1 - i] = 1;
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[0].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        //5
        /*
        �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������
        ���������� ������ ���� int ������ len, ������ ������ �������� ����� initialValue
         */
        int[] arr5 = returnArr(17, 19);
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
    }
    public static int[] returnArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}







