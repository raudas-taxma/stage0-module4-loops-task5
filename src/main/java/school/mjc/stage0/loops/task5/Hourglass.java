package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        char eight = '8';
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                boolean isTopHourglass = (i < height / 2) && (j < i || j > height - 1 - i);
                boolean isBottomHourglass = (i >= height / 2) && (j < height - i - 1  || j > i);
                if (isTopHourglass|| isBottomHourglass) {
                    System.out.print(' ');
                }  else {
                    System.out.print(eight);
                }
            }
            System.out.println();
        }
    }
}
