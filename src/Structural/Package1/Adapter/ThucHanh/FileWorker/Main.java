package Structural.Package1.Adapter.ThucHanh.FileWorker;

import com.codegym.FileUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = scanner.nextLine();
        FileCalculator calculator = new FileCalculatorAdapter(new FileUtil());
        System.out.println(calculator.calculateSize(path));
    }
}
