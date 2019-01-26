package ru.vsu.endovitskaya;

public class Circle extends Figure {
    int radius;

    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public Figure clone1() {
        Circle clone= new Circle(radius);
        clone.x=x;
        clone.y=y;
        clone.color=color;
        return clone;
    }
}
