package clases;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Table extends JPanel {

    private int tableNumber;
    private JLabel label;
    private JButton estadoBtn;
    private JButton pedidoBtn;
    
    
     public Table(int mesaId) {
        this.tableNumber = tableNumber;
        this.label = new JLabel("Mesa " + mesaId);
        this.estadoBtn = new JButton("Libre");
        this.pedidoBtn = new JButton("Ver Pedido");
        
        // Añadir listeners para los botones
        this.estadoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (estadoBtn.getText().equals("Libre")) {
                    estadoBtn.setText("Ocupada");
                } else {
                    estadoBtn.setText("Libre");
                }
            }
        });
        
        this.pedidoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para mostrar el pedido de la mesa
            }
        });
        
        this.setLayout(new GridLayout(50, 50));
        this.add(label);
        this.add(estadoBtn);
        this.add(pedidoBtn);
    }
     
}

