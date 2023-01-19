import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String selection;

try {
    Client[] array = new Client[3];
    array[0]=new Client("Fernando", "Ureña");
    do {
        selection = JOptionPane.showInputDialog("BIENVENIDO AL SISTEMA PARA CLIENTES\n\n"  +
                "a. Añadir nuevo cliente \n" +
                "b. Borrar un cliente \n" +
                "c. Buscar un cliente\n" +
                "d. Mostrar los clientes\n" +
                "e. Salir.\n \n" +
                "Por favor selecciona una opcion \n");


        SelectedOption option = new SelectedOption();
        option.selectionMethod(selection);
    }while (selection != "e");
}catch (Exception  e){
    System.out.println("Lo siento, algo salio mal.");
}






    }
}