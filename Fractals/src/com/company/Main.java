package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {
        /*drawTriangle(graphics, HEIGHT/2, WIDTH/2,0, 0);
    }
    //Recursive method
    public static void drawTriangle(Graphics graphics, int height, int topX, int topY,  int level){
        //Base case
        if (level > 6){
            return;
        }

        int rightX = (int) Math.round((topX + height * Math.tan(Math.toRadians(30))));
        int rightY = height + topY;

        int leftX = (int) Math.round((topX - height * Math.tan(Math.toRadians(30))));
        int leftY = height + topY;

        //Drawing main triangle
        graphics.drawLine(topX, topY, rightX, rightY);
        graphics.drawLine(rightX, rightY, leftX, leftY);
        graphics.drawLine(leftX, leftY, topX, topY);

        //Apply recursion
        drawTriangle(graphics, height/2, rightX, topY, level + 1);
        drawTriangle(graphics, height/2, topX, height + topY, level + 1);
        drawTriangle(graphics, height/2, leftX, topY, level + 1);*/


        //SQUARE GRID
        /*drawSquareGrid(graphics, WIDTH/4, HEIGHT/4, WIDTH/2, HEIGHT/2, 0);
    }

    public static void drawSquareGrid (Graphics graphics, int x, int y, int width, int height, int level) {
            if (level > 3){
                return;
            }

        graphics.drawRect(x, y, width, height);

            drawSquareGrid(graphics, x - width/4, y - height/4, width/2, height/2, level +1);
            drawSquareGrid(graphics, x + width - width/4, y - height/4, width/2, height/2, level +1);
            drawSquareGrid(graphics, x - width/4, y + height - height/4, width/2, height/2, level +1);
            drawSquareGrid(graphics, x + width - width/4, y + height - height/4, width/2, height/2, level +1);*/


        //Triangles with polygon
        drawTrianglePoly(graphics, HEIGHT/2, WIDTH/2,0, 0);
    }
        public static void drawTrianglePoly(Graphics graphics, int height, int topX, int topY,  int level){
            //Base case
            if (level > 6) {
                return;
            }

            int rightX = (int) Math.round((topX + height * Math.tan(Math.toRadians(30))));
            int rightY = height + topY;

            int leftX = (int) Math.round((topX - height * Math.tan(Math.toRadians(30))));
            int leftY = height + topY;


            graphics.drawLine(topX, topY, rightX, rightY);
            graphics.drawLine(rightX, rightY, leftX, leftY);
            graphics.drawLine(leftX, leftY, topX, topY);

            //Apply recursion
            drawTrianglePoly(graphics, height / 2, rightX, topY, level + 1);
            drawTrianglePoly(graphics, height / 2, topX, height + topY, level + 1);
            drawTrianglePoly(graphics, height / 2, leftX, topY, level + 1);
    }

    public static void kochSnowflake () {


    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }


    }
}
