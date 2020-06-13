package com.company;
import sun.java2d.loops.DrawRect;
import sun.java2d.loops.FillRect;
import sun.java2d.pipe.DrawImage;

import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.RandomAccess;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {

             // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        /*graphics.setColor(Color.red);
        graphics.drawLine(0, 160, 320, 160);

        graphics.setColor(Color.green);
        graphics.drawLine(160, 0, 160, 160);*/




        // Draw a box that has different colored lines on each edge.
        /*Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        Color randomColor = new Color(red, green, blue);
        graphics.setColor(randomColor);
        graphics.drawLine(100, 50, 200,50);

        Color randomColor1 = new Color(red, green, blue);
        graphics.setColor(randomColor1);
        graphics.drawLine(100, 50, 100,150);

        Color randomColor2 = new Color(red, green, blue);
        graphics.setColor(randomColor2);
        graphics.drawLine(100, 150, 200,150);

        Color randomColor3 = new Color(red, green, blue);
        graphics.setColor(randomColor3);
        graphics.drawLine(200, 150, 200,50);*/

        /*graphics.setColor(Color.red);
        graphics.drawLine(100, 50, 200,50);


        graphics.setColor(Color.blue);
        graphics.drawLine(100, 50, 100,150);

        graphics.setColor(Color.green);
        graphics.drawLine(100, 150, 200,150);

        graphics.setColor(Color.yellow);
        graphics.drawLine(200, 150, 200,50);*/



        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
       /* graphics.setColor(Color.red);
        graphics.drawLine(320, 0, 0, 320);

        graphics.setColor(Color.green);
        graphics.drawLine(0, 0, 320, 320);*/


        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.
        /*Random random = new Random();
        Point pointCenter = new Point(160,160);
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        graphics.setColor(Color.red);
        for (int i = 0; i < 3; i++) {
            graphics.drawLine(random.nextInt(),random.nextInt(), pointCenter.x, pointCenter.y);
                    }*/


        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.
        /*Random random = new Random();
        Point pointStart = new Point(50,random.nextInt());
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        graphics.setColor(Color.red);
        for (int i = 0; i < 3; i++) {
            graphics.drawLine(pointStart.x, y+i*10, pointStart.x+50, y+i*10);

        }*/



       /* // Draw a green 10x10 square to the canvas' center.
        graphics.setColor(Color.green);
        graphics.fillRect(155,155, 10, 10);


        // draw four different size and color rectangles.
        // avoid code duplication.*/
        /*for (int i = 0; i < 4; i++) {
            Color myRandomColor = myRandomColor();
            graphics.setColor(myRandomColor);
            int[] myRandomSizess = myRandomSize();
            int x = myRandomSizess[0];
            int y = myRandomSizess[1];
            int width = myRandomSizess[2];
            int height = myRandomSizess[3];
            graphics.fillRect(x + i * 100, y + i * 100, width + i * 2, height + i * 3);
                }*/



        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        /*for (int i = 0; i < 3; i++) {
            graphics.setColor(Color.green);
            newSquare(i*50,i*50, graphics);
        }*/



        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        /*int width = 50;
        int height = 50;
        for (int i = 0; i < 3; i++) {
            graphics.setColor(Color.green);
            square2parameters(50+i*50, graphics);
        }*/


        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        /*Color indigo = new Color(75,0,130);
        Color violet = new Color(238, 130, 238);
        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, indigo, violet};
        for (int i = 0; i < 7; i++) {
            squareSizeColorGraphics(300-i*25, colors[i], graphics);
        }*/


        //purple steps
        /*Color indigo = new Color(75,0,130);
        graphics.setColor(indigo);
        for (int i = 0; i < 20; i++) {
            graphics.fillRect(5+i*10,5+i*10,10,10);
        }*/


        //Purple steps 3D
        /*Color indigo = new Color(75,0,130);
        graphics.setColor(indigo);
        int width = 10;
        int x = width;
        for (int i = 0; i < 6; i++) {
            graphics.fill3DRect(x,x,width,width, true);
            x = x + width;
            width = width+10;
        }*/


        // Fill the canvas with a checkerboard pattern.
        /*int row;   // Row number, from 0 to 7
        int col;   // Column number, from 0 to 7
        int x,y;   // Top-left corner of square

        for ( row = 0;  row < 8;  row++ ) {

            for (col = 0; col < 8; col++) {
                x = col * 40;
                y = row * 40;
                if ((row % 2) == (col % 2))
                    graphics.setColor(Color.white);
                else
                    graphics.setColor(Color.black);
                graphics.fillRect(x, y, 40, 40);
            }
        }*/

            //Triangles
        /*int numberOfRows = 20;

        graphics.setColor(Color.black);
        for (int i = 0; i < 20; i++) {
            int[] xPoly = {0+i*20,20+i*20,10+i*20};
            int[] yPoly = {300,300,280};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }
        for (int i = 0; i < 19; i++) {
            int[] xPoly = {10+i*20,30+i*20,20+i*20};
            int[] yPoly = {280,280,260};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }
        for (int i = 0; i < 18; i++) {
            int[] xPoly = {20+i*20,40+i*20,30+i*20};
            int[] yPoly = {260,260,240};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }
        for (int i = 0; i < 17; i++) {
            int[] xPoly = {30+i*20,50+i*20,40+i*20};
            int[] yPoly = {240,240,220};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }*/



        //TRIANGLES TRY 2.
        /*int numberOfRows = 15;
        int numberOfTriangles = 15;
        int x = 0;
        int y = 300;
        for (int i = 0; i < numberOfRows; i++) {
            triangles(x, y, numberOfTriangles, graphics);
            numberOfTriangles -= 1;
            x += 10;
            y -= 20;
        }*/




    }

            // Don't touch the code below
            static int WIDTH = 320;
            static int HEIGHT = 320;

            public static void main (String[]args){
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

    /*public static int[] myRandomSize () {
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        int width = random.nextInt(WIDTH);
        int height = random.nextInt(HEIGHT);
        int[] myRandomSizes = {x, y, width, height};
        return myRandomSizes;
    }
    public static Color myRandomColor () {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color randomColor = new Color(red, green, blue);
        return randomColor;
    } this was for exercise on the LINE 109*/

    /*public static void newSquare (int x, int y, Graphics graphics) {

        graphics.fillRect(x,y,50,50);
    }*/

    /*public static void square2parameters (int size, Graphics graphics) {
        graphics.drawRect(135-size/2,135-size/2, size, size);

    }*/
    /*public static void squareSizeColorGraphics (int size, Color colors, Graphics graphics) {
        graphics.setColor(colors);
        graphics.fillRect(0,0, size, size);

    }*/

    //TRIANGLES TRY 2.
    /*public static void triangles (int x, int y, int sumTriangles, Graphics graphics) {
        graphics.setColor(Color.black);
        for (int i = 0; i < sumTriangles; i++) {
            int[] xPoly = {x + i * 20, x + 20 + i * 20, x + 10 + i * 20};
            int[] yPoly = {y, y, y - 20};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }
    }*/
}


