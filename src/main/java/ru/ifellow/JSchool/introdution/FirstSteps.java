package ru.ifellow.JSchool.introdution;

public  class FirstSteps {

    public int sum(int x, int y){
        return x+y;
    }

    public int mul(int x, int y){
        return x*y;
    }

    public int div(int x, int y){
        return x/y;
    }

    public int mod(int x, int y){
        return x%y;
    }

    public boolean isEqual (int x, int y){
        return x==y;
    }

    public boolean isGreater (int x, int y){
        return x>y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x<=xRight && x>=xLeft && y>=yTop && y<=yBottom;
    }

    public int sum(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int sum = 0 ;
        if (  array.length == 0) return 0;
        else
        {
            for (int i = 0 ; i< array.length;i++)
                sum= sum + array[i];
        }
        return sum;
    }

    public int mul(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i];
        }
        return mul;
    }

    public int min(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if (array.length == 0 || array.length == 1) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return;
        }
        int a = 0;
        int b = array.length - 1;
        while (a < b) {
            int c = array[a];
            array[a] = array[b];
            array[b] = c;
            a++;
            b--;
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        if ( array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        int sum = 0;
        for (int[] r : matrix) {
            sum = sum +  sum(r);
        }
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int rowMaximum = max(row);
            if (rowMaximum > max) {
                max = rowMaximum;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException(" null ");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
