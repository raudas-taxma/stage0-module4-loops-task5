package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int crossLine = sideLength / 2;
        char eight = '8';

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == crossLine || i == crossLine)
                    System.out.print(eight);
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
