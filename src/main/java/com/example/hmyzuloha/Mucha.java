package com.example.hmyzuloha;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Mucha extends Hmyz{

    public Mucha(Pane root) {
        super(root);
        setOnMouseClicked(e->zanikne());

    }
    public void stop() { t.stop();}

    private void zanikne() {
        t.stop();
        root.getChildren().remove(this);
    }

    protected void pohyb(){
        setLayoutX(getLayoutX()+Math.random()*2-1);
        setLayoutY(getLayoutY()+Math.random()*2-1);
    }

    protected void vykresli(){
        gc.setFill(Color.BLACK);
        gc.fillOval(getLayoutX(), getLayoutY(), 10, 10);
    }
}
