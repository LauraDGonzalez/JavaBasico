import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private String name;
    private String dni;
    int position;

    int counter;
    //Client[] array = new Client[3];


    public String getName() {
        return name;
    }
    public String getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Client(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public Client() {

    }

    public Client[] addClient(Client[] array) {

        name = JOptionPane.showInputDialog("Digite nombre");
        if (name.matches("[a-zA-Z]*")) {
            dni = JOptionPane.showInputDialog("Digite la cedula del ciente: ");
            if (dni.matches("[0-9]*")) {
                for (int i = 0; i < 3; i++) {
                    if (array[i] == null) {
                        array[i] = new Client(name, dni);


                       break;
                    }
                    if (counter == array.length) {
                        array = size(array);
                    }

                    counter += 1;
                }
                for (int j = 0; j <3; j++){
                    JOptionPane.showMessageDialog(null, "elementos en arreglo "+ array[j].getName() + array[j].getDni());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error dni ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error name");
        }
        return array;
    }


    public static Client[] size(Client[] array) {

        Client[] arrayNew = new Client[array.length + 1]; //Creating a new array with space for an extra element
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }

    public void deleteClient() {
        position = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion del cliente a eliminar: "));
    }

    public void findClient() {
        //dni = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del ciente a buscar: "));
    }

    public void showClient() {

    }


}




