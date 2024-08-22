package alenaDvo.boxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangularCuboidTest {

    @Test
    void getLeastCommonMultiple() {
        assertThat(RectangularCuboid.getLeastCommonMultiple(1, 1)).isEqualTo(1);
        assertThat(RectangularCuboid.getLeastCommonMultiple(1, 2)).isEqualTo(2);
        assertThat(RectangularCuboid.getLeastCommonMultiple(2, 3)).isEqualTo(6);
    }

    @Test
    void findSmallestCubeLength() {
        assertThat(new RectangularCuboid(1, 1,1).findSmallestCubeLength()).isEqualTo(1);
        assertThat(new RectangularCuboid(1, 2,3).findSmallestCubeLength()).isEqualTo(6);
        assertThat(new RectangularCuboid(4, 5,6).findSmallestCubeLength()).isEqualTo(60);
    }

    @Test
    void findCubeforProducts() {
        int cubeLengthA = new RectangularCuboid(1, 2, 3).findSmallestCubeLength();
        int cubeLengthB = new RectangularCuboid(4,5,6).findSmallestCubeLength();
        int cubeLengthAll = RectangularCuboid.getLeastCommonMultiple(cubeLengthA, cubeLengthB);

        assertThat(cubeLengthAll).isEqualTo(60);
    }
}