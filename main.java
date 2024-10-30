import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        JFrame janela = new JFrame(); //Criando uma janela.
        janela.setTitle("Meu primeiro programa");
        janela.setSize(500,500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Metodo que encerra o programa quando clicamos no "X" na janela.

        janela.setLayout(null); // removendo layouts da janela que vem por padrão

        //Criações e ajustes da tela
        JLabel labelNome = new JLabel("Nome:"); // Criando uma label, texto e botão, inserindo um texto na janela
        JTextField campoTextoNome = new JTextField();
        JButton botao = new JButton("Pressione");

        campoTextoNome.setBounds(20,40,200,20);
        labelNome.setBounds(20,20,50,20); // configurando a posição dos elementos
        botao.setBounds(20,60,100,20);

        botao.addActionListener(event -> { //Criando um evento ao pressionar o botão
            String nome = campoTextoNome.getText();
            JOptionPane.showMessageDialog(janela, "Olá " + nome);
        });

        janela.getContentPane().add(labelNome); // adicionando os elementos na janela criada
        janela.getContentPane().add(campoTextoNome);
        janela.getContentPane().add(botao);

        janela.setVisible(true); // exibindo ela na tela
    }
}
