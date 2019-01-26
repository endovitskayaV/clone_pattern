package ru.vsu.endovitskaya;

import java.awt.*;

public abstract class Figure {
    int x = 0;
    int y = 0;
    Color color = Color.BLACK;

    abstract Figure clone1();
}
