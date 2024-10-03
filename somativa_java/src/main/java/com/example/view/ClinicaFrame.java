package com.example.view;

import javax.swing.*;

import com.example.controller.PacienteController;
import com.example.model.Paciente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ClinicaFrame extends JFrame {
    private PacienteController pacienteController;
    private Paciente paciente;
    private JPanel pacienteListPanel;

    public ClinicaFrame(PacienteController controller) {

        this.pacienteController = controller;
        setTitle("Gerenciamento de Pacientes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel superior para os botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Botão para adicionar paciente
        JButton addButton = new JButton("Adicionar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pacienteController.addPaciente(paciente);
            }
        });
        buttonPanel.add(addButton);

        // Botão para deletar paciente
        JButton deleteButton = new JButton("Deletar");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pacienteController.deletarPaciente(paciente);
            }
        });
        buttonPanel.add(deleteButton);

        // Botão para editar paciente
        JButton editButton = new JButton("Editar");
        // editButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         pacienteController.editarPaciente(paciente);
        //     }
        // });
        buttonPanel.add(editButton);

        add(buttonPanel, BorderLayout.NORTH);

        // Painel para listar pacientes
        pacienteListPanel = new JPanel();
        pacienteListPanel.setLayout(new BoxLayout(pacienteListPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(pacienteListPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Carregar a lista de pacientes
        // pacienteListPanel.add(pacienteController.listarPaciente(buttonPanel));
    }

}
