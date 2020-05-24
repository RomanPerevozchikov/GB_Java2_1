package ru.geekbrains.Java_lvl2_lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{{"1", "2", "2", "3"}, {"2", "2", "3", "r"}, {"3", "3", "3", "3"}, {"2", "1", "0", "0"}};
        try {
            testArray(array1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println();
            System.out.println(e.string);
        }

    }

    private static void testArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException("Input array differ than 4X4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Input array differ than 4X4");
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("[" + i + "][" + j + "] not int");
                }
            }
        }
        System.out.println(sum);

    }


    private static class MyArraySizeException extends Throwable {
        public MyArraySizeException(String strings) {
            System.out.println("Input array differ than 4X4");
        }
    }

    private static class MyArrayDataException extends Exception {
                public String string;
                public MyArrayDataException (String string){
                    this.string = ("Array data error: " + string);
        }
    }
}
