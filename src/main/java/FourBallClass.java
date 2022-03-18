import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallClass extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 640;

    final int diameter = 20;
    int ballX1, ballX2, ballX3, ballX4;
    int ballY1, ballY2, ballY3, ballY4;

    public static void main(String[] args) {
        PApplet.main("FourBallClass",args);
    }

    @Override
    public void setup() {
        ballX1 = ballX2 = ballX3 = ballX4 = 1;
        ballY1 = HEIGHT/5;
        ballY2 = 2 * HEIGHT/5;
        ballY3 = 3 * HEIGHT/5;
        ballY4 = 4 * HEIGHT/5;
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ballX1, ballY1, diameter, diameter);
        ballX1++;

        ellipse(ballX2, ballY2, diameter, diameter);
        ballX2 += 2;

        ellipse(ballX3, ballY3, diameter, diameter);
        ballX3 += 3;

        ellipse(ballX4, ballY4, diameter, diameter);
        ballX4 += 4;
    }

}
