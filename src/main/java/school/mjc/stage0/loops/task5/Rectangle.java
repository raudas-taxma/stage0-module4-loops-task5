package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        char eight = '8';
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i != 0 && i != height - 1 && j != 0 && j != length - 1)
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
