/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author pzx64
 */
public class Bienvenida extends JFrame implements ActionListener{
    private JTextField textfield;
    private JLabel label1, label2, label3, label4;
    private JButton button;
    public static String nombre = "";
    
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        label4 = new JLabel("©2017 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        
        textfield = new JTextField();
        textfield.setBounds(45,240,255,25);
        textfield.setBackground(new Color(224,224,224));
        textfield.setFont(new Font("Andale Mono", 1, 14));
        textfield.setForeground(new Color(255,0,0));
        add(textfield);
        
        button = new JButton("Ingresar");
        button.setBounds(125,280,100,30);
        button.setBackground(new Color(255,255,255));
        button.setFont(new Font("Andale Mono", 1, 14));
        button.setForeground(new Color(255,0,0));
        button.addActionListener(this);
        add(button);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            nombre = textfield.getText().trim();
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre"); //es como poner un alert en javascript
            } else{
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0,0,600,360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    
    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
    }
}
