package com.example.hmyzuloha;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Chrobak extends Hmyz{
    private int smer = 1;

    public Chrobak(Pane root) {
        super(root);
        setLayoutY(root.getHeight()-15);


    }

    protected void pohyb(){
        if(getLayoutX()<=0 || getLayoutX() >= root.getWidth()) smer *= -1;
        setLayoutX(getLayoutX() + smer*3);

    }
    protected void vykresli(){
        gc.setFill(Color.BLUE);
        gc.fillRect(0,0,getWidth(),getHeight());
    }
}
