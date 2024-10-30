import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main {
    public static void main(String[] args) {
        JFrame janela = new JFrame(); //Criando uma janela.
        janela.setTitle("Meu primeiro programa");
        janela.setSize(500,500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Metodo que encerra o programa quando clicamos no "X" na janela.

        JLabel labelNome = new JLabel("Nome:"); // Criando uma label, inserindo um texto na janela

        janela.setLayout(null); // removendo layouts da janela que vem por padrão
        janela.getContentPane().add(labelNome); // adicionando a label na janela criada
        labelNome.setBounds(20,20,50,20); // configurando a posião do texto (label)

        JTextField campoTextoNome = new JTextField();
        campoTextoNome.setBounds(20,40,200,20);
        janela.getContentPane().add(campoTextoNome);

        janela.setVisible(true); // exibindo ela na tela
    }
}
