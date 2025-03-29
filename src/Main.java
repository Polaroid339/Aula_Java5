import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Entrada de dados
    String inputSenai = JOptionPane.showInputDialog("Insira um numero inteiro");
    int input = Integer.parseInt(inputSenai);

    // Lista Dropdown
    String[] acceptableValues = {"Opção 1", "Opção 2", "Opção 3"};
    String input2= (String)JOptionPane.showInputDialog
        (
            null,
            "Mensagem da Caixa de Diálogo",
            "Título da Caixa de Diálogo",
            2,
            null,
            acceptableValues,
            acceptableValues[1]
        );

    // Caixa de Diálogo
    JOptionPane.showMessageDialog
        (
            null,
            "Não há uma entrada aqui\n apenas uma mensagem",
            "Título",
            0
        );

    // Input com concatenação
    String nome = JOptionPane.showInputDialog("Digite seu nome:");
    JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");

    // Conversão de tipos
    String input3 = JOptionPane.showInputDialog("Digite um número:");
    int numero = Integer.parseInt(input3);
    JOptionPane.showMessageDialog(null, "O número digitado + 1 é: " + (numero + 1));
    }
}