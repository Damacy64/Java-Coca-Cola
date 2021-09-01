/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author pzx64
 */
public class Principal extends JFrame implements ActionListener {

    private JTextArea text;
    private JMenuBar m_bar;
    private JMenu m_opciones, m_calcular, m_acerca_de, m_color_fondo;
    private JMenuItem mi_calculo, mi_rojo, mi_negro, mi_morado, mi_creador, mi_salir, mi_nuevo;
    private JLabel label_logo, label_bienvenido, label_title, label_paterno, label_materno, label_nombre,
            label_departamento, label_antiguedad, label_resultado, label_footer;
    private JTextField input_nombre, input_a_paterno, input_a_materno;
    private JComboBox combo_departamento, combo_antiguedad;
    private JScrollPane scroll;
    String nombre = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombre = ventaBienvenida.nombre;

        m_bar = new JMenuBar();
        m_bar.setBackground(new Color(255, 0, 0));
        setJMenuBar(m_bar);

        m_opciones = new JMenu("Opciones");
        m_opciones.setBackground(new Color(255, 0, 0));
        m_opciones.setFont(new Font("Andale Mono", 1, 14));
        m_opciones.setForeground(new Color(255, 255, 255));
        m_bar.add(m_opciones);

        m_calcular = new JMenu("Calcular");
        m_calcular.setBackground(new Color(255, 0, 0));
        m_calcular.setFont(new Font("Andale Mono", 1, 14));
        m_calcular.setForeground(new Color(255, 255, 255));
        m_bar.add(m_calcular);

        m_acerca_de = new JMenu("Acerca de");
        m_acerca_de.setBackground(new Color(255, 0, 0));
        m_acerca_de.setFont(new Font("Andale Mono", 1, 14));
        m_acerca_de.setForeground(new Color(255, 255, 255));
        m_bar.add(m_acerca_de);

        m_color_fondo = new JMenu("Color de fondo");
        m_color_fondo.setFont(new Font("Andale Mono", 1, 14));
        m_color_fondo.setForeground(new Color(255, 0, 0));
        m_opciones.add(m_color_fondo);

        mi_calculo = new JMenuItem("Vacaciones");
        mi_calculo.setFont(new Font("Andale Mono", 1, 14));
        mi_calculo.setForeground(new Color(255, 0, 0));
        m_calcular.add(mi_calculo);
        mi_calculo.addActionListener(this);

        mi_rojo = new JMenuItem("Rojo");
        mi_rojo.setFont(new Font("Andale Mono", 1, 14));
        mi_rojo.setForeground(new Color(255, 0, 0));
        m_color_fondo.add(mi_rojo);
        mi_rojo.addActionListener(this);

        mi_negro = new JMenuItem("Negro");
        mi_negro.setFont(new Font("Andale Mono", 1, 14));
        mi_negro.setForeground(new Color(255, 0, 0));
        m_color_fondo.add(mi_negro);
        mi_negro.addActionListener(this);

        mi_morado = new JMenuItem("Morado");
        mi_morado.setFont(new Font("Andale Mono", 1, 14));
        mi_morado.setForeground(new Color(255, 0, 0));
        m_color_fondo.add(mi_morado);
        mi_morado.addActionListener(this);

        mi_nuevo = new JMenuItem("Nuevo");
        mi_nuevo.setFont(new Font("Andale Mono", 1, 14));
        mi_nuevo.setForeground(new Color(255, 0, 0));
        m_opciones.add(mi_nuevo);
        mi_nuevo.addActionListener(this);

        mi_salir = new JMenuItem("Salir");
        mi_salir.setFont(new Font("Andale Mono", 1, 14));
        mi_salir.setForeground(new Color(255, 0, 0));
        m_opciones.add(mi_salir);
        mi_salir.addActionListener(this);

        mi_creador = new JMenuItem("El creador");
        mi_creador.setFont(new Font("Andale Mono", 1, 14));
        mi_creador.setForeground(new Color(255, 0, 0));
        m_acerca_de.add(mi_creador);
        mi_creador.addActionListener(this);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        label_logo = new JLabel(imagen);
        label_logo.setBounds(5, 5, 250, 100);
        add(label_logo);

        label_bienvenido = new JLabel("Bienvenido " + nombre);
        label_bienvenido.setBounds(280, 30, 300, 50);
        label_bienvenido.setFont(new Font("Andale Mono", 1, 32));
        label_bienvenido.setForeground(new Color(255, 255, 255));
        add(label_bienvenido);

        label_title = new JLabel("Datos del trabajador para el calculo de vacaciones");
        label_title.setBounds(45, 140, 900, 25);
        label_title.setFont(new Font("Andale Mono", 0, 24));
        label_title.setForeground(new Color(255, 255, 255));
        add(label_title);

        label_nombre = new JLabel("Nombre Completo:");
        label_nombre.setBounds(25, 188, 180, 25);
        label_nombre.setFont(new Font("Andale Mono", 1, 12));
        label_nombre.setForeground(new Color(255, 255, 255));
        add(label_nombre);

        input_nombre = new JTextField();
        input_nombre.setBounds(25, 213, 150, 25);
        input_nombre.setBackground(new Color(224, 224, 224));
        input_nombre.setFont(new Font("Andale Mono", 1, 14));
        input_nombre.setForeground(new Color(255, 0, 0));
        add(input_nombre);

        label_paterno = new JLabel("Apellido Paterno:");
        label_paterno.setBounds(25, 248, 180, 25);
        label_paterno.setFont(new Font("Andale Mono", 1, 12));
        label_paterno.setForeground(new Color(255, 255, 255));
        add(label_paterno);

        input_a_paterno = new JTextField();
        input_a_paterno.setBounds(25, 273, 150, 25);
        input_a_paterno.setBackground(new Color(224, 224, 224));
        input_a_paterno.setFont(new Font("Andale Mono", 1, 14));
        input_a_paterno.setForeground(new Color(255, 0, 0));
        add(input_a_paterno);

        label_materno = new JLabel("Apellido Materno:");
        label_materno.setBounds(25, 308, 180, 25);
        label_materno.setFont(new Font("Andale Mono", 1, 12));
        label_materno.setForeground(new Color(255, 255, 255));
        add(label_materno);

        input_a_materno = new JTextField();
        input_a_materno.setBounds(25, 334, 150, 25);
        input_a_materno.setBackground(new Color(224, 224, 224));
        input_a_materno.setFont(new Font("Andale Mono", 1, 14));
        input_a_materno.setForeground(new Color(255, 0, 0));
        add(input_a_materno);

        label_departamento = new JLabel("Selecciona el Departamento:");
        label_departamento.setBounds(220, 188, 180, 25);
        label_departamento.setFont(new Font("Andale Mono", 1, 12));
        label_departamento.setForeground(new Color(255, 255, 255));
        add(label_departamento);

        combo_departamento = new JComboBox();
        combo_departamento.setBounds(220, 213, 220, 25);
        combo_departamento.setBackground(new Color(224, 224, 224));
        combo_departamento.setFont(new Font("Andale Mono", 1, 14));
        combo_departamento.setForeground(new Color(255, 0, 0));
        add(combo_departamento);
        combo_departamento.addItem("");
        combo_departamento.addItem("Atencion al Cliente");
        combo_departamento.addItem("Departamento de Logistica");
        combo_departamento.addItem("Departamento de Gerencia");

        label_antiguedad = new JLabel("Selecciona la Antiguedad:");
        label_antiguedad.setBounds(220, 248, 180, 25);
        label_antiguedad.setFont(new Font("Andale Mono", 1, 12));
        label_antiguedad.setForeground(new Color(255, 255, 255));
        add(label_antiguedad);

        combo_antiguedad = new JComboBox();
        combo_antiguedad.setBounds(220, 273, 220, 25);
        combo_antiguedad.setBackground(new Color(224, 224, 224));
        combo_antiguedad.setFont(new Font("Andale Mono", 1, 14));
        combo_antiguedad.setForeground(new Color(255, 0, 0));
        add(combo_antiguedad);
        combo_antiguedad.addItem("");
        combo_antiguedad.addItem("1 año de servicio");
        combo_antiguedad.addItem("2 a 6 años de servicio");
        combo_antiguedad.addItem("7 años o mas de servicio");

        label_resultado = new JLabel("Resultado del Cálculo:");
        label_resultado.setBounds(220, 307, 180, 25);
        label_resultado.setFont(new Font("Andale Mono", 1, 12));
        label_resultado.setForeground(new Color(255, 255, 255));
        add(label_resultado);

        text = new JTextArea();
        text.setEditable(false);
        text.setBackground(new Color(224, 224, 224));
        text.setFont(new Font("Andale Mono", 1, 11));
        text.setForeground(new Color(255, 0, 0));
        text.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
        scroll = new JScrollPane(text);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);

        label_footer = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
        label_footer.setBounds(135, 445, 500, 30);
        label_footer.setFont(new Font("Andale Mono", 1, 12));
        label_footer.setForeground(new Color(255, 255, 255));
        add(label_footer);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi_calculo) {
            String nombre_trabajador = input_nombre.getText();
            String a_paterno = input_a_paterno.getText();
            String a_materno = input_a_materno.getText();
            String departamento = combo_departamento.getSelectedItem().toString();
            String antiguedad = combo_antiguedad.getSelectedItem().toString();
            
            if(nombre_trabajador.equals("") || a_paterno.equals("") || a_materno.equals("") || departamento.equals("") || antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
            } else {
                if(departamento.equals("Atencion al Cliente")){
                    if(antiguedad.equals("1 año de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 6 dias de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 14 dias de vacaciones");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 20 dias de vacaciones");
                    }
                }
                if(departamento.equals("Departamento de Logistica")){
                    if(antiguedad.equals("1 año de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 7 dias de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 15 dias de vacaciones");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 22 dias de vacaciones");
                    }
                }
                if(departamento.equals("Departamento de Gerencia")){
                    if(antiguedad.equals("1 año de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 10 dias de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 20 dias de vacaciones");
                    }
                    if(antiguedad.equals("7 años o mas de servicio")){
                        text.setText("\n  El trabajador " + nombre_trabajador + " " + a_paterno + " " + a_materno +
                                     "\n  quien labora en " + departamento + " con " + antiguedad +
                                     "\n  recibe 30 dias de vacaciones");
                    }
                }
            }
        }
        if (e.getSource() == mi_rojo) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == mi_morado) {
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (e.getSource() == mi_negro) {
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (e.getSource() == mi_nuevo) {
            input_nombre.setText("");
            input_a_paterno.setText("");
            input_a_materno.setText("");
            combo_departamento.setSelectedIndex(0);
            combo_antiguedad.setSelectedIndex(0);
            text.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
        }
        if (e.getSource() == mi_salir) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == mi_creador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Reyes Ricardo");
        }
    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
