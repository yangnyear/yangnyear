package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

public class box {

    public static void main(String[] args) {
	// write your code here
        int a=3;
        int b=4;
        int c=5;
        box m=new box(a,b,c);
        m.shou();
    }
    private int length;
    private  int width;
    private  int height;

    private box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    private int volume(){
        return length*width*height;
    }
    private int area(){
        return 2*(length*width+width*height+height*length);
    }
    private void shou(){
       System.out.println("面积是"+this.area()+"体积是"+this.volume());

    }
}
