/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.uem.visao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import javax.swing.JOptionPane;
import poo.uem.modelo.Candidato;

/**
 *
 * @author SUMBURANE CLAUD
 */
public class TestesFicheiro {
    
    
    public static void main(String[] args) {
        
        
        Candidato candidato = new Candidato(12, "LaiMar", "laimar@gmail.com", 'M', new Date(), "MAhotas", "CiG", "Laboral", false);
        
        try {
            
            
            // Criei um ficheiro
            FileOutputStream primeiroFicheiro = new FileOutputStream("C:\\Users\\SUMBURANE CLAUD\\Desktop\\NossaPasta\\NovoFic00.dat");
            
            
            
            // Operacao (ObjectOutputStream gravar os dados no ficheiro)
            ObjectOutputStream operacaoGravar = new ObjectOutputStream(primeiroFicheiro);
            
            
            // writeObject (escreve)
            operacaoGravar.writeObject(candidato);
                        
            

            // Confirmar a operacao
            operacaoGravar.flush();
            

            operacaoGravar.close();

            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    
    
    
    
}
