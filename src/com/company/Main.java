package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isSizeUp(Color[][] pic, int x, int y, int kof){

        return getSize(pic,x,y);
    }

    public static int getSize(Color[][] pic, int x, int y){
        int sizeDown = 0;
        Color tmp = pic[x][y];
        while (isDetectedColor(tmp)) {
            sizeDown++;
            if (sizeDown % 2 == 1)
                tmp = pic[x - sizeDown / 2][y - sizeDown / 2];
            else if (sizeDown % 2 == 0)
                tmp = pic[x + sizeDown / 2][y + sizeDown / 2];
        }
        return sizeDown;
    }
    public static boolean isDetectedColor(Color color) {
        return !(color == null || color.equals(Color.black) || color.equals(Color.white));
    }
}
