package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        char eight = '8';
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i != 0 && i != sideLength - 1 && j != 0 && j != sideLength - 1)
                    eight = ' ';
                else {
                    eight = '8';
                }
                System.out.print(eight);
            }
            System.out.println();
        }
    }
}
