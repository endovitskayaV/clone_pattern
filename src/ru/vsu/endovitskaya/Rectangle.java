package ru.vsu.endovitskaya;

public class Rectangle extends Figure{
    int width;
    int height;
    Rectangle(int weight, int height){
        this.width=weight;
        this.height=height;
    }

    @Override
    public Figure clone1() {
        Rectangle clone= new Rectangle(width, height);
        clone.x=x;
        clone.y=y;
        clone.color=color;
        return clone;
    }
}
