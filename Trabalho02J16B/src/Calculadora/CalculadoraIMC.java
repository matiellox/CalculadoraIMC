package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        JFrame janelaUm = new JFrame();
        janelaUm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaUm.setSize(800,800);
        janelaUm.setVisible(true);
        janelaUm.setTitle("Tela inicial");

        JTextField Usuario = new JTextField();
        JTextField Idade = new JTextField();
        JTextField Profissao = new JTextField();
        JLabel InformacaoUsuario = new JLabel();// Lembrar que ela só vai aparecer na outra pag
        JLabel InformacaoIdade = new JLabel();
        JLabel InformacaoProfissao = new JLabel();

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(150,250,50,30);
        janelaUm.add(lblNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(150,310,50,30);
        janelaUm.add(lblIdade);

        JLabel lblProfissao = new JLabel("Profissão:");
        lblProfissao.setBounds(130,370,70,30);
        janelaUm.add(lblProfissao);


        janelaUm.add(Usuario);
        Usuario.setVisible(true);
        Usuario.setBounds(200,250,160,30);




        janelaUm.add(Idade);
        Idade.setVisible(true);
        Idade.setBounds(200,310,160,30);


        janelaUm.add(Profissao);
        Profissao.setVisible(true);
        Profissao.setBounds(200,370,160,30);




        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnLimpar = new JButton("Limpar");

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario.setText("");
                Profissao.setText("");
                Idade.setText("");
            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = Usuario.getText();
                String trabaiaDiGue = Profissao.getText();
                String age = Idade.getText();

                JFrame novaJanela = new JFrame("Informação");
                novaJanela.setVisible(true);
                novaJanela.setLayout(null);
                novaJanela.setSize(400,400);
                novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                InformacaoUsuario.setText("Nome: "+ user);
                InformacaoIdade.setText("Idade: "+ age);
                InformacaoProfissao.setText("Profissão: "+trabaiaDiGue);

                novaJanela.add(InformacaoUsuario);
                InformacaoUsuario.setVisible(true);
                InformacaoUsuario.setBounds(200,125,160,30);

                novaJanela.add(InformacaoIdade);
                InformacaoIdade.setVisible(true);
                InformacaoIdade.setBounds(200,155,160,30);

                novaJanela.add(InformacaoProfissao);
                InformacaoProfissao.setVisible(true);
                InformacaoProfissao.setBounds(200,185,160,30);








            }
        });

        janelaUm.add(btnCadastrar);
        janelaUm.add(btnLimpar);


        btnCadastrar.setVisible(true);
        btnCadastrar.setBounds(600,300,160,40);
        btnLimpar.setVisible(true);
        btnLimpar.setBounds(600,360,160,40);








        janelaUm.setLayout(null);


    }
}
