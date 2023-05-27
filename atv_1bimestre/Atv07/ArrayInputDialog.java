import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayInputDialog{
    
    public static void main(String[] args) {
        Double[] array = new Double[5];
        String resposta = "";

        for (int i = 0; i < 5; i++) {
            String entrada = JOptionPane.showInputDialog(null, "digite a nota: ");
            
            array[i] = Double.parseDouble(entrada);
        }


        Arrays.sort(array);
        for (int i = 4; i >= 0; i--) {
            resposta += array[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resposta);
        
    }
}
