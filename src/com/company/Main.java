package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String name = in.next();

        System.out.print("Введите количество строк: ");
        int row = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int columns = in.nextInt();

        System.out.print("Сохранить файл?: ");
        String yes = in.next();
        String ans = "Да";

        if (yes.equals(ans)){
            PrintWriter outfile = new PrintWriter(name +".csv");
            int[][] matrix = new int[row][columns];
            for (int i=0; i < matrix.length; i++){
                for (int j=0; j < matrix[i].length; j++){
                    matrix[i][j]=(int)(Math.random()*100);
                }
            }
            for (int i=0; i < matrix.length; i++, outfile.println()){
                for (int j=0; j < matrix[i].length; j++){
                    outfile.print(matrix[i][j]+ " ");
                }
            }
            outfile.close();
        }else {
            int[][] matrix = new int[row][columns];
            for (int i=0; i < matrix.length; i++){
                for (int j=0; j < matrix[i].length; j++){
                    matrix[i][j]=(int)(Math.random()*100);
                }
            }
            for (int i=0; i < matrix.length; i++, System.out.println()){
                for (int j=0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j]+ " ");
                }
            }
        }
    }
}
