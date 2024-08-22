package alenaDvo.boxes;

public class RectangularCuboid {
    private final int length;
    private final int width;
    private final int height;

    public RectangularCuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static int getLeastCommonMultiple(int dimension1, int dimension2) {
        int newDimension1 = dimension1;
        int nesDimension2 = dimension2;

//        take the bigger dimension and try to fit the smaller dimension in it without left space; if needed add the bigger dimension once more
        if (newDimension1 >= dimension2) {
            while (newDimension1 % dimension2 != 0) {
                newDimension1 = newDimension1 + dimension1;
            }
            return newDimension1;
        } else {
            while (nesDimension2 % dimension1 != 0) {
                nesDimension2 = nesDimension2 + dimension2;
            }
            return nesDimension2;
        }
    }

    public int findSmallestCubeLength() {
        int cubeLengthLW = getLeastCommonMultiple(length, width);
        int cubeLengthLWH = getLeastCommonMultiple(cubeLengthLW, height);

        return cubeLengthLWH;
    }
}
