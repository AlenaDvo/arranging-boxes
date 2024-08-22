package alenaDvo.boxes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        RectangularCuboid productA = readDimensions("Enter the dimensions of product A:");
        RectangularCuboid productB = readDimensions("Enter the dimensions of product B:");

        int cubeLengthA = productA.findSmallestCubeLength();
        int cubeLengthB = productB.findSmallestCubeLength();
        int cubeLengthAll = RectangularCuboid.getLeastCommonMultiple(cubeLengthA, cubeLengthB);

        System.out.println("The smallest cube box for your products has the length of " + cubeLengthAll + ".");
    }

    static RectangularCuboid readDimensions(String instruction) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(instruction);
        String input = scanner.nextLine();
        String regex = "(\\d+)\\s*(\\d+)\\s*(\\d+)";
        Matcher m = Pattern.compile(regex).matcher(input);
        int length = 0;
        int width = 0;
        int height = 0;
        while (m.find()) {
            length = Integer.parseInt(m.group(1));
            width = Integer.parseInt(m.group(2));
            height = Integer.parseInt(m.group(3));
        }
        if (length <= 0 || width <= 0 || height <= 0) {
            System.out.println("The dimensions should be positive.");
        }
        RectangularCuboid product = new RectangularCuboid(length, width, height);
        return product;
    }
}