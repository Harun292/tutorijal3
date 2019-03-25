package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import static sample.Main.sumaCifara;

public class Controller {


    public TextField tekst2;
    public TextField rezultat;


    public void ispisi(ActionEvent actionEvent) {
        int a = 1;
        int b = Integer.parseInt(tekst2.getText());
        String result= "";
        for(int i=a;i<=b;i++){
            if(i%sumaCifara(i)==0)
                result=result+" "+i;

        }

        rezultat.setText(result);

    }
}
