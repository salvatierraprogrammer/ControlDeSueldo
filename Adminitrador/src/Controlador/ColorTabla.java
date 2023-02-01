/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ColorTabla implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        if (value instanceof String) {
            String valor = (String) value;
            if (valor.compareTo("PENDIENTE") < 0) {
                label.setBackground(Color.GREEN);
            } else {
                label.setBackground(Color.RED);
            }
        } else {
            label.setBackground(Color.white);
        }
        if (value != null) {
            label.setText(value.toString());
        } else {
            label.setText("");
        }
        return label;
    }
}
