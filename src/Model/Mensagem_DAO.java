package Model;

import javax.swing.JOptionPane;

public class Mensagem_DAO {
    static String nome = "Gabrielle";
    public static String nomeM = "Leonardo";
    
    public static void Men1(){
        JOptionPane.showMessageDialog(null,nome);
    }
    
    public static void Men2(){
        String nomeF = "Ana"; //variável local
        JOptionPane.showMessageDialog(null,nomeF);
    }
}
