import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Escriba la nota del alumno: "));

        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: JOptionPane.showMessageDialog(null,"Insuficiente");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Suficiente");
            break;
            case 6: JOptionPane.showMessageDialog(null,"Bien");
            break;
            case 7:
            case 8: JOptionPane.showMessageDialog(null,"Notable");
            break;
            case 9: JOptionPane.showMessageDialog(null, "Sobresaliente");
            break;
            case 10: JOptionPane.showMessageDialog(null, "Excelente");
            break;
            default: JOptionPane.showMessageDialog(null,"Error");
            break;

        }
    }
}
