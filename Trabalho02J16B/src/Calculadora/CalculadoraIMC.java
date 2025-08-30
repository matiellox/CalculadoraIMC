package Calculadora;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        JFrame PrimeiraJanela = new JFrame();
        PrimeiraJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PrimeiraJanela.setTitle("Calculadora de IMC");
        PrimeiraJanela.setSize(800,800);
        PrimeiraJanela.setVisible(true);
        PrimeiraJanela.setLayout(null);

        JLabel Resultado = new JLabel();
        PrimeiraJanela.add(Resultado);
        Resultado.setBounds(600, 420, 200, 30);
        Resultado.setVisible(true);


        JButton btnCalcular = new JButton("Calcular");
        PrimeiraJanela.add(btnCalcular);
        btnCalcular.setVisible(true);
        btnCalcular.setBounds(200, 430, 100, 30);


        JLabel lblPeso = new JLabel("Peso: ");
        lblPeso.setVisible(true);
        lblPeso.setBounds(150,250,50,30);

        JLabel lblAltura = new JLabel("Altura: ");
        lblAltura.setVisible(true);
        lblAltura.setBounds(150,310,50,30);

        JLabel lblIMC = new JLabel();
        lblIMC.setBounds(600, 420, 200, 30);





        PrimeiraJanela.add(lblAltura);
        PrimeiraJanela.add(lblPeso);

        JTextField Peso = new JTextField();
        PrimeiraJanela.add(Peso);
        Peso.setVisible(true);
        Peso.setBounds(200,250,160,30);

        JTextField Altura = new JTextField();
        PrimeiraJanela.add(Altura);
        Altura.setVisible(true);
        Altura.setBounds(200,310,160,30);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tamanho = Float.parseFloat(Altura.getText());
                float Massa = Float.parseFloat(Peso.getText());
                Resultado.setBounds(200, 470, 200, 30);
                Resultado.setVisible(true);

                DecimalFormat df = new DecimalFormat();
                df.applyPattern("#,##0.00");


                float IMC = Massa/ (tamanho * tamanho);

                String Classificacao = "";
                if (IMC<18.5f){
                    Classificacao = "Baixo peso";
                } else if (IMC>= 18.5f && IMC< 24.99){
                    Classificacao = "Normal";
                } else if(IMC>=25f && IMC<29.99F){
                    Classificacao = "Sobre Peso";
                } else if (IMC>=30.00F){
                    Classificacao = "Obesidade";
                }
                PrimeiraJanela.add(Resultado);

                



                Resultado.setText("IMC: " + (df.format(IMC)) + " - " + Classificacao);












            }
        });






    }
}

