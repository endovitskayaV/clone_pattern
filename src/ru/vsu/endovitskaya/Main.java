package ru.vsu.endovitskaya;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figures=new ArrayList<>();
        Circle c=new Circle(3);
        figures.add(c);
        c.x=450;
        Circle cC=(Circle)c.clone1();
        figures.add(cC);
        Rectangle r=new Rectangle(1,2);
        r.x=45;
        figures.add(r);
        Figure r1=new Rectangle(3,4);
        figures.add(r1);
        List<Figure> figuresC=new ArrayList<>();
        figures.forEach(x->figuresC.add(x.clone1()));
        System.out.println();

    }
}
