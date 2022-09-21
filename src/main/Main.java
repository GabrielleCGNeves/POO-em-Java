package main;

import static Model.Mensagem_DAO.nomeM;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /*
        Model- Regra de negocio, funcionalidades ()
        View - Todas as Interfaçes (Tela_GUI)
        Controle - Banco de Dados (mENSAGEM_DB)
        */
        
        //Nome 2_Nome Sobrenome
        // Pacore Classe Função
        
        Model.Mensagem_DAO.Men1();
        JOptionPane.showMessageDialog(null, nomeM);
    }
    
}
