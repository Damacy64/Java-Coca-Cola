/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author pzx64
 */
public class Licencia extends JFrame implements ActionListener, ChangeListener{

    private JLabel label1, label2;
    private JCheckBox check;
    private JButton button1, button2;
    private JScrollPane scroll;
    private JTextArea text;
    String nombre = "";
    
    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombre = ventaBienvenida.nombre;
        
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
        text = new JTextArea();
        text.setEditable(false);
        text.setFont(new Font("Andale Mono", 0, 9));
        text.setText("\n\n          TERMINOS Y CONDICIONES");
        scroll = new JScrollPane(text);
        scroll.setBounds(10,40,575,200);
        add(scroll);
        
        check = new JCheckBox("Yo " + nombre + " acepto");
        check.setBounds(10,250,300,30);
        check.addChangeListener(this);
        add(check);
        
        button1 = new JButton("Continuar");
        button1.setBounds(10,290,100,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);
        
        button2 = new JButton("No acepto");
        button2.setBounds(120,290,100,30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if(e.getSource() == button2){
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public void stateChanged(ChangeEvent e) {
        if(check.isSelected() == true){
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }
    
    public static void main(String[] args) {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0,0,600,360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }
}