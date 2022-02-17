import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallClass extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 640;
    public static ArrayList<Integer> ballCollection = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallClass",args);
        ballCollectionInitialisation();
    }

    private static void ballCollectionInitialisation() {
        for (int index = 0; index < 5; index++) {
            ballCollection.add(1);
        }
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        for (int index = 1; index < 5; index++){
            int ballNumber = index;
            int position = ballCollection.get(index-1);
            int height = (HEIGHT * ballNumber) / 5;
            int diameter = 20;
            ellipse(position, height, diameter, diameter);
            moveToRight(index, position);
        }
    }

    private void moveToRight(int index, int position) {
        ballCollection.set(index - 1, position + index);
    }
}
