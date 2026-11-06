package com.example.hmyzuloha;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

import java.awt.event.KeyEvent;

public class HelloController {
    @FXML
    private Pane root;
    

    
    @FXML
    private void initialize() {
        root.setOnKeyPressed(spracuj(););

        
    }

    private void spracuj(KeyEvent e) {
        KeyCode code = e.getCode();
        switch (code) {
            case W:
                posunObjekty();
                break;
            case S:
                zastavMuchy();
                break;
        }
    }

    private void posunObjekty(){
        for(int i=0;i<root.getChildren().size();i++){
            Node n = root.getChildren().get(i);
            if (n instanceof Hmyz) {
                ((Hmyz) n).pohyb();
            }
        }
    }
    private void zastavMuchy(){
        for(int i = 0; i< root.getChildren().size();i++){
            Node n = root.getChildren().get(i);
            if(n instanceof Mucha) ((Mucha) n).stop();
        }
    }
    @FXML
    protected void mucha(){
        Mucha m = new Mucha(root);
        root.getChildren().add(m);

        
    }
 @FXML
    protected void chrobak(){
        Chrobak c = new Chrobak(root);
        root.getChildren().add(c);

    }
}
