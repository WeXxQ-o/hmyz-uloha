package com.example.hmyzuloha;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.util.Duration;

public abstract class Hmyz extends Canvas {
    protected GraphicsContext gc;
    protected Color farba;
    protected Timeline t;
    protected Pane root;


    public Hmyz(Pane root) {
        super(20,20);
        this.root = root;
        setLayoutX(Math.random()*root.getWidth());
        setLayoutY(Math.random()*root.getHeight());
        gc = getGraphicsContext2D();
        t = new Timeline(new KeyFrame(Duration.millis(150), e-> pohyb()));
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
        vykresli();
    }

    protected void pohyb() {

    }
    protected void vykresli() {

    }

}
