package com.example.hmyzuloha;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Pane root;
    

    
    @FXML
    private void initialize() {
        root.setFocusTraversable(true);
        root.setOnKeyPressed(this::spracuj);
        root.requestFocus();

        
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
                n.setLayoutY(n.getLayoutY() - 50);
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
