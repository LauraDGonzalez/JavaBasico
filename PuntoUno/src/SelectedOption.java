import javax.swing.*;

public class SelectedOption {
    Client value = new Client();


public void selectionMethod(String selection) {

    switch (selection) {
        case "a":
            showMessage("a");
            value.addClient();
            break;
        case "b":
            showMessage("b");
            value.deleteClient();
            break;
        case "c":
            showMessage("c");
            value.findClient();
            break;
        case "d":
            showMessage("d");
            value.showClient();
            break;
        case "e":
            JOptionPane.showMessageDialog(null, "Fin del programa ");
            System.exit(1);
            break;

        default: JOptionPane.showMessageDialog(null, "Opcion incorrecta ");
    }
}

public void showMessage(String selection){
    JOptionPane.showMessageDialog(null, "Haz seleccionado la opcion " + selection);
    }


    /**
     * array para almacenar los clientes
     */
   // Client arrayClient[] = new Client[3];


   // Client array= new Client("trompeta", 2);


}



