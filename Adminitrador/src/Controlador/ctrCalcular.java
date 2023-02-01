package Controlador;

import Modelo.Conexion;

import Vista.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Calcular;
import Modelo.ConsultaCalcular;
import Vista.elaces;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Controlador.ColorTabla;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

public class ctrCalcular implements ActionListener {
                    
                //Imagenes JOpanel
    private Calcular mod;
    private ConsultaCalcular modC;
    private Panel frm;

    Icon d = new ImageIcon(getClass().getResource("/imagenes/dinero2.PNG"));
    Icon a = new ImageIcon(getClass().getResource("/imagenes/actualizar.png"));
    Icon totales = new ImageIcon(getClass().getResource("/imagenes/total.png"));
    Icon tota = new ImageIcon(getClass().getResource("/imagenes/total1.png"));
    Icon servi = new ImageIcon(getClass().getResource("/imagenes/servicios.png"));
    Icon impu = new ImageIcon(getClass().getResource("/imagenes/impuestos.png"));
    Icon tar = new ImageIcon(getClass().getResource("/imagenes/tarjetas.png"));
    Icon error = new ImageIcon(getClass().getResource("/imagenes/error.png"));
    Icon terminado = new ImageIcon(getClass().getResource("/imagenes/OpTerminada.png"));
    Icon eliminar = new ImageIcon(getClass().getResource("/imagenes/eliminar.png"));
    Icon total_pagar = new ImageIcon(getClass().getResource("/imagenes/total_pagar.png"));
    Icon newIcon = new ImageIcon(getClass().getResource("/imagenes/new.png"));

    public ctrCalcular(Calcular mod, ConsultaCalcular modC, Panel frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;

        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        this.frm.btnBorrar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnAgregar.addActionListener(this);

        this.frm.btn_calcular_impuesto.addActionListener(this);
        this.frm.btn_calcular_Servicios.addActionListener(this);
        this.frm.btn_calcular_tarjetas.addActionListener(this);
        this.frm.btn_calcular_total.addActionListener(this);
        this.frm.btnActualizar.addActionListener(this);
        this.frm.btnNuevo.addActionListener(this);
       
        this.frm.btnEnlaces.addActionListener(this);

    }

    private String accion = "guardar";

    void ocultar_columnas() {
        frm.J_tabla_calcular.getColumnModel().getColumn(0).setMaxWidth(0);
        frm.J_tabla_calcular.getColumnModel().getColumn(0).setMinWidth(0);
        frm.J_tabla_calcular.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inhabilitar() {

        frm.txt_codigo.setVisible(true);
        frm.txt_sueldo.setEnabled(false);
        frm.txt_agip.setEnabled(false);
        frm.txt_monotributo.setEnabled(false);
        frm.txt_alquiler.setEnabled(false);
        frm.txt_celular.setEnabled(false);
        frm.txt_transporte.setEnabled(false);
        frm.txt_Tnaranja.setEnabled(false);
        frm.txt_TbancoCiudad.setEnabled(false);
        frm.fecha_ingreso.setEnabled(false);
        frm.txt_ResultadoImpueto.setEnabled(false);
        frm.txt_ResultadoTarjeta.setEnabled(false);
        frm.txt_ResultadoServicio.setEnabled(false);
        frm.txt_total_I_S_T.setEnabled(false);
        frm.cbx_estado.setSelectedItem(false);

        frm.btnAgregar.setEnabled(false);
        frm.btnBorrar.setEnabled(false);
        frm.btnModificar.setEnabled(false);
        frm.txt_codigo.setText("");
        frm.txt_sueldo.setText("");
        frm.txt_agip.setText("");
        frm.txt_monotributo.setText("");
        frm.txt_alquiler.setText("");
        frm.txt_celular.setText("");
        frm.txt_transporte.setText("");
        frm.txt_Tnaranja.setText("");;
        frm.txt_TbancoCiudad.setText("");
        frm.fecha_ingreso.setDate(null);
        frm.txt_ResultadoImpueto.setText("");
        frm.txt_ResultadoTarjeta.setText("");
        frm.txt_ResultadoServicio.setText("");
        frm.txt_total_I_S_T.setText("");
        frm.cbx_estado.setSelectedItem("");
    }

    void habilitarNuevo() {
        frm.txt_codigo.setVisible(true);
        frm.txt_sueldo.setEnabled(true);
        frm.txt_agip.setEnabled(true);
        frm.txt_monotributo.setEnabled(true);
        frm.txt_alquiler.setEnabled(true);
        frm.txt_celular.setEnabled(true);
        frm.txt_transporte.setEnabled(true);
        frm.txt_Tnaranja.setEnabled(true);
        frm.txt_TbancoCiudad.setEnabled(true);
        frm.fecha_ingreso.setEnabled(true);
        frm.txt_ResultadoImpueto.setEnabled(false);
        frm.txt_ResultadoTarjeta.setEnabled(false);
        frm.txt_ResultadoServicio.setEnabled(false);
        frm.txt_ResultadoSueldo.setEnabled(false);
        frm.txt_total_I_S_T.setEnabled(false);
//        frm.J_tabla_calcular.setEnabled(false);
        

        frm.btnAgregar.setEnabled(false);
        frm.btnBorrar.setEnabled(false);
        frm.btnModificar.setEnabled(false);
        frm.btn_calcular_Servicios.setEnabled(false);
        frm.btn_calcular_tarjetas.setEnabled(false);
        frm.btn_calcular_impuesto.setEnabled(false);
        frm.btnGuardar.setEnabled(true);
        frm.btn_calcular_total.setEnabled(false);
        frm.btnActualizar.setEnabled(true);

        frm.txt_codigo.setText("");
        frm.txt_sueldo.setText("");
        frm.txt_agip.setText("");
        frm.txt_monotributo.setText("");
        frm.txt_alquiler.setText("");
        frm.txt_celular.setText("");
        frm.txt_transporte.setText("");
        frm.txt_Tnaranja.setText("");;
        frm.txt_TbancoCiudad.setText("");
        frm.txt_ResultadoImpueto.setText("0");
        frm.txt_ResultadoTarjeta.setText("0");
        frm.txt_ResultadoServicio.setText("0");
        frm.txt_ResultadoSueldo.setText("");
        frm.txt_total_I_S_T.setText("");

    }

    void habilitar() {
        frm.txt_codigo.setVisible(true);
        frm.txt_sueldo.setEnabled(true);
        frm.txt_agip.setEnabled(true);
        frm.txt_monotributo.setEnabled(true);
        frm.txt_alquiler.setEnabled(true);
        frm.txt_celular.setEnabled(true);
        frm.txt_transporte.setEnabled(true);
        frm.txt_Tnaranja.setEnabled(true);
        frm.txt_TbancoCiudad.setEnabled(true);
        frm.fecha_ingreso.setEnabled(true);
        frm.txt_ResultadoImpueto.setEnabled(true);
        frm.txt_ResultadoTarjeta.setEnabled(true);
        frm.txt_ResultadoServicio.setEnabled(true);
        frm.txt_ResultadoSueldo.setEnabled(true);
        frm.txt_total_I_S_T.setEnabled(true);

        frm.btnAgregar.setEnabled(true);
        frm.btnBorrar.setEnabled(true);
        frm.btnModificar.setEnabled(true);
        frm.btn_calcular_Servicios.setEnabled(true);
        frm.btn_calcular_tarjetas.setEnabled(true);
        frm.btn_calcular_impuesto.setEnabled(true);
        frm.btnGuardar.setEnabled(false);
        frm.btn_calcular_total.setEnabled(true);

        frm.txt_codigo.setText("");
        frm.txt_sueldo.setText("");
        frm.txt_agip.setText("");
        frm.txt_monotributo.setText("");
        frm.txt_alquiler.setText("");
        frm.txt_celular.setText("");
        frm.txt_transporte.setText("");
        frm.txt_Tnaranja.setText("");;
        frm.txt_TbancoCiudad.setText("");

        frm.txt_ResultadoImpueto.setText("");
        frm.txt_ResultadoTarjeta.setText("");
        frm.txt_ResultadoServicio.setText("");
        frm.txt_ResultadoSueldo.setText("");
        frm.txt_total_I_S_T.setText("");
        

    }

    public void iniciar() {

        frm.setTitle("Servicios");
        frm.setLocationRelativeTo(null);
        frm.txt_id.setVisible(false);
        inhabilitar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

                                                                     //ACCIONES DE SOFTWARE
       //Accion BTNGuardar
       if (e.getSource() == frm.btnGuardar) {
            try {

                mod.setCodigo(frm.txt_codigo.getText());
                mod.setAgip(Double.parseDouble(frm.txt_agip.getText()));
                mod.setSueldo(Double.parseDouble(frm.txt_sueldo.getText()));
                mod.setMonotributo(Double.parseDouble(frm.txt_monotributo.getText()));
                mod.setCelular(Double.parseDouble(frm.txt_celular.getText()));
                mod.setAlquiler(Double.parseDouble(frm.txt_alquiler.getText()));
                mod.setT_Banco_Ciudad(Double.parseDouble(frm.txt_TbancoCiudad.getText()));
                mod.setT_naranja(Double.parseDouble(frm.txt_Tnaranja.getText()));
                mod.setTransporte(Double.parseDouble(frm.txt_transporte.getText()));
                Calendar cal;
                int d,m,a;
                cal=frm.fecha_ingreso.getCalendar();
                d=cal.get(Calendar.DAY_OF_MONTH);
                m=cal.get(Calendar.MONTH);
                a=cal.get(Calendar.YEAR) - 1900;
                mod.setFecha_ingreso(new Date(a,m,d));

                int seleccionado = frm.cbx_estado.getSelectedIndex();
                mod.setEstado_cuenta((String)frm.cbx_estado.getItemAt(seleccionado));


                if (modC.ingresarNuevo(mod)) {

                    JOptionPane.showMessageDialog(null, "Registro Agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE, terminado);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Completar casillas para Agregar", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);
            }
            limpiar();
            Actualizar();
            habilitar();
        }

        if (e.getSource() == frm.btnModificar) {

            mod.setId(Integer.parseInt(frm.txt_id.getText()));
            mod.setCodigo(frm.txt_codigo.getText());
            mod.setSueldo(Double.parseDouble(frm.txt_sueldo.getText()));
            mod.setAgip(Double.parseDouble(frm.txt_agip.getText()));
            mod.setMonotributo(Double.parseDouble(frm.txt_monotributo.getText()));
            mod.setAlquiler(Double.parseDouble(frm.txt_alquiler.getText()));
            mod.setSueldo(Double.parseDouble(frm.txt_sueldo.getText()));
            mod.setCelular(Double.parseDouble(frm.txt_celular.getText()));
            mod.setTransporte(Double.parseDouble(frm.txt_transporte.getText()));
            mod.setT_Banco_Ciudad(Double.parseDouble(frm.txt_TbancoCiudad.getText()));
            mod.setT_naranja(Double.parseDouble(frm.txt_Tnaranja.getText()));
            Calendar cal;
            int d,m,a;
            cal=frm.fecha_ingreso.getCalendar();
            d=cal.get(Calendar.DAY_OF_MONTH);
            m=cal.get(Calendar.MONTH);
            a=cal.get(Calendar.YEAR) - 1900;
            mod.setFecha_ingreso(new Date(a,m,d));
            mod.setTotal_impuesto(Double.parseDouble(frm.txt_ResultadoImpueto.getText()));
            mod.setTotal_tarjetas(Double.parseDouble(frm.txt_ResultadoTarjeta.getText()));
            mod.setTotal_servicios(Double.parseDouble(frm.txt_ResultadoServicio.getText()));
            mod.setTotal_pagar(Double.parseDouble(frm.txt_total_I_S_T.getText()));
            mod.setTotal_sueldo(Double.parseDouble(frm.txt_ResultadoSueldo.getText()));
            int seleccionado = frm.cbx_estado.getSelectedIndex();
            mod.setEstado_cuenta((String)frm.cbx_estado.getItemAt(seleccionado));

            if (modC.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Editado", "Modificado", JOptionPane.INFORMATION_MESSAGE, terminado);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);
            }
            limpiar();
            Actualizar();
        }
        if (e.getSource() == frm.btnBorrar) {

            mod.setId(Integer.parseInt(frm.txt_id.getText()));

            if (modC.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado", "Elimiado", JOptionPane.INFORMATION_MESSAGE, eliminar);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);
            }
            limpiar();
            Actualizar();
        }

        if (e.getSource() == frm.btnBuscar) {

            mod.setCodigo(frm.txt_codigo.getText());

            if (modC.buscar(mod)) {

                frm.txt_id.setText(String.valueOf(mod.getId()));
                frm.txt_codigo.setText(String.valueOf(mod.getCodigo()));
                frm.txt_agip.setText(String.valueOf(mod.getAgip()));
                frm.txt_sueldo.setText(String.valueOf(mod.getSueldo()));
                frm.txt_monotributo.setText(String.valueOf(mod.getMonotributo()));
                frm.txt_alquiler.setText(String.valueOf(mod.getAlquiler()));
                frm.txt_celular.setText(String.valueOf(mod.getCelular()));
                frm.txt_transporte.setText(String.valueOf(mod.getTransporte()));
                frm.txt_Tnaranja.setText(String.valueOf(mod.getT_naranja()));
                frm.txt_TbancoCiudad.setText(String.valueOf(mod.getT_Banco_Ciudad()));
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(mod.getFecha_ingreso());
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH);
                int anio = cal.get(Calendar.YEAR);
                frm.fecha_ingreso.setCalendar(cal);


                frm.cbx_estado.setSelectedItem(mod.getEstado_cuenta());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Codigo", "?", JOptionPane.QUESTION_MESSAGE);
            }
        }

        if (e.getSource() == frm.btnActualizar) {
            Actualizar();
            habilitar();
        }

        if (e.getSource() == frm.btnAgregar) {
            try {

                mod.setId(Integer.parseInt(frm.txt_id.getText()));
                mod.setCodigo(frm.txt_codigo.getText());
                mod.setSueldo(Double.parseDouble(frm.txt_sueldo.getText()));
                mod.setAgip(Double.parseDouble(frm.txt_agip.getText()));
                mod.setMonotributo(Double.parseDouble(frm.txt_monotributo.getText()));
                mod.setAlquiler(Double.parseDouble(frm.txt_alquiler.getText()));
                mod.setCelular(Double.parseDouble(frm.txt_celular.getText()));
                mod.setTransporte(Double.parseDouble(frm.txt_transporte.getText()));
                mod.setT_Banco_Ciudad(Double.parseDouble(frm.txt_TbancoCiudad.getText()));
                mod.setT_naranja(Double.parseDouble(frm.txt_Tnaranja.getText()));
                Calendar cal;
                int d,m,a;
                cal=frm.fecha_ingreso.getCalendar();
                d=cal.get(Calendar.DAY_OF_MONTH);
                m=cal.get(Calendar.MONTH);
                a=cal.get(Calendar.YEAR) - 1900;
                mod.setFecha_ingreso(new Date(a,m,d));
                mod.setTotal_impuesto(Double.parseDouble(frm.txt_ResultadoImpueto.getText()));
                mod.setTotal_tarjetas(Double.parseDouble(frm.txt_ResultadoTarjeta.getText()));
                mod.setTotal_servicios(Double.parseDouble(frm.txt_ResultadoServicio.getText()));
                mod.setTotal_pagar(Double.parseDouble(frm.txt_total_I_S_T.getText()));
                mod.setTotal_sueldo(Double.parseDouble(frm.txt_ResultadoSueldo.getText()));
                int seleccionado = frm.cbx_estado.getSelectedIndex();
                mod.setEstado_cuenta((String)frm.cbx_estado.getItemAt(seleccionado));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Casilleros Vacios", "¡Operación incompleta!", JOptionPane.INFORMATION_MESSAGE, error);
            }

            if (modC.modificar(mod)) {

                JOptionPane.showMessageDialog(null, "Calculo Guardado", "Modificado", JOptionPane.INFORMATION_MESSAGE, terminado);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);

            }
            limpiar();
            Actualizar();
            habilitar();
        }

        //BOTONES CALCULAR
        //CALCULAR IMPUESTOS SUMA
        if (e.getSource() == frm.btn_calcular_impuesto) {
            try {
                double agip, monotributo, suma_imp;
                agip = Double.parseDouble(frm.txt_agip.getText());
                monotributo = Double.parseDouble(frm.txt_monotributo.getText());
                suma_imp = agip + monotributo;
                frm.txt_ResultadoImpueto.setText(String.valueOf(suma_imp));
                JOptionPane.showMessageDialog(null, "TOTAL DE IMPUESTO A PAGAR : " + suma_imp + " $ ", " ¡IMPUESTOS! ", JOptionPane.INFORMATION_MESSAGE, impu);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "¡Las casillas IMPUESTO deben de estar completas!", "Operacion Incompleta", JOptionPane.INFORMATION_MESSAGE, error);
                limpiarImpuestos();
                //CALCULAR IMPUESTOS RESTA
            }
            if (e.getSource() == frm.btn_calcular_impuesto) {
                try {
                    double resultadoIM, sueldo, resta;
                    sueldo = Double.parseDouble(frm.txt_sueldo.getText());
                    resultadoIM = Double.parseDouble(frm.txt_ResultadoImpueto.getText());
                    resta = sueldo - resultadoIM;
                    frm.txt_ResultadoSueldo.setText(String.valueOf(resta));
                    frm.btnAgregar.setEnabled(false);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No hay datos para calcular!", "Operacion Incompleta", JOptionPane.INFORMATION_MESSAGE, error);
                }
            }
        }
        //CALCULAR SERVICIOS SUMA
        if (e.getSource() == frm.btn_calcular_Servicios) {
            try {
                double alquiler, celular, transporte, suma_ser;
                alquiler = Double.parseDouble(frm.txt_alquiler.getText());
                celular = Double.parseDouble(frm.txt_celular.getText());
                transporte = Double.parseDouble(frm.txt_transporte.getText());
                suma_ser = alquiler + celular + transporte;
                frm.txt_ResultadoServicio.setText(String.valueOf(suma_ser));
                
                JOptionPane.showMessageDialog(null, "TOTAL DE SERVICIOS A PAGAR: " + suma_ser + "$", "SERVICIOS!", JOptionPane.INFORMATION_MESSAGE, servi);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "¡Las casillas SERVICIOS deben de estar completas!", "Operacion Incompleta", JOptionPane.INFORMATION_MESSAGE, error);

                //CALCULAR SERVICIOS RESTA
            }
            if (e.getSource() == frm.btn_calcular_Servicios) {
                try {
                    double resultadoS, sueldo2, resta_ser;
                    sueldo2 = Double.parseDouble(frm.txt_ResultadoSueldo.getText());
                    resultadoS = Double.parseDouble(frm.txt_ResultadoServicio.getText());
                    resta_ser = sueldo2 - resultadoS;
                    frm.txt_ResultadoSueldo.setText(String.valueOf(resta_ser));
                    frm.btnAgregar.setEnabled(false);
                   
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No hay datos para calcular!", "Operacion Incompleta", JOptionPane.INFORMATION_MESSAGE, error);
                }
            }
                                                 //CALCULAR TARJETAS SUMA

        }
        if (e.getSource() == frm.btn_calcular_tarjetas) {

            try {

                double ciudad, naranja, suma_tar;
                ciudad = Double.parseDouble(frm.txt_TbancoCiudad.getText());
                naranja = Double.parseDouble(frm.txt_Tnaranja.getText());
                suma_tar = ciudad + naranja;
                frm.txt_ResultadoTarjeta.setText(String.valueOf(suma_tar));
                JOptionPane.showMessageDialog(null, "TOTAL DE TARJETAS A PAGAR: " + suma_tar + "$", "TARJETAS!", JOptionPane.INFORMATION_MESSAGE, tar);
            } catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(null, "Debes completar las casiilas con numeros enteros", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);

            }
            //CALCULAR TARJETAS REATA

            if (e.getSource() == frm.btn_calcular_tarjetas) {
                try {
                    double resultadoT, sueldo3, resta;
                    sueldo3 = Double.parseDouble(frm.txt_ResultadoSueldo.getText());
                    resultadoT = Double.parseDouble(frm.txt_ResultadoTarjeta.getText());
                    resta = sueldo3 - resultadoT;
                    frm.txt_ResultadoSueldo.setText(String.valueOf(resta));

                } catch (NumberFormatException ex) {
//                    JOptionPane.showMessageDialog(null, "¡No hay datos para calcular!", "Operacion Incompleta", JOptionPane.INFORMATION_MESSAGE, error);
                }
            }
        }

        //CALCULAR  TOTAL
        if (e.getSource() == frm.btn_calcular_total) {
            try {
                double suma_imp, suma_tar, suma_ser, suma_total;
                suma_imp = Double.parseDouble(frm.txt_ResultadoImpueto.getText());
                suma_ser = Double.parseDouble(frm.txt_ResultadoServicio.getText());
                suma_tar = Double.parseDouble(frm.txt_ResultadoTarjeta.getText());
                suma_total = suma_imp + suma_tar + suma_ser;
                frm.txt_total_I_S_T.setText(String.valueOf(suma_total));
                frm.btnAgregar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "TOTAL A PAGAR: " + suma_total + " $", "PAGAR!", JOptionPane.INFORMATION_MESSAGE, total_pagar);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debes completar las casiilas con numeros enteros", "ERROR", JOptionPane.INFORMATION_MESSAGE, error);
            }
        }
        if (e.getSource() == frm.btnNuevo) {
             JOptionPane.showMessageDialog(null, "Ingresa nuevo registro! ", "+",JOptionPane.INFORMATION_MESSAGE, newIcon);
            habilitarNuevo();
            
        }

    }

    public void limpiar() {
        frm.txt_alquiler.setText(null);
        frm.txt_sueldo.setText(null);
        frm.txt_agip.setText(null);
        frm.txt_monotributo.setText(null);
        frm.txt_celular.setText(null);
        frm.txt_transporte.setText(null);
        frm.txt_Tnaranja.setText(null);
        frm.txt_TbancoCiudad.setText(null);
        frm.fecha_ingreso.setDate(null);
        frm.txt_id.setText(null);
        frm.txt_total_I_S_T.setText(null);
        frm.txt_ResultadoImpueto.setText(null);
        frm.txt_ResultadoServicio.setText(null);
        frm.txt_ResultadoSueldo.setText(null);
        frm.txt_ResultadoTarjeta.setText(null);
    }

    public void limpiarImpuestos() {
        frm.txt_agip.setText(null);
        frm.txt_monotributo.setText(null);
    }

    public void limpiarServicio() {
        frm.txt_celular.setText(null);
        frm.txt_transporte.setText(null);
        frm.txt_alquiler.setText(null);
    }

    public void limpiarTarjetas() {
        frm.txt_Tnaranja.setText(null);
        frm.txt_TbancoCiudad.setText(null);

    }

   public void Actualizar() {
    try {

        DefaultTableModel modelo = new DefaultTableModel();
        frm.J_tabla_calcular.setModel(modelo);

        modelo.addColumn("id");
        modelo.addColumn("CODIGO");
        modelo.addColumn("SUELDO");
        modelo.addColumn("AGIP");
        modelo.addColumn("MONOTRIBUTO");
        modelo.addColumn("ALQUILER");
        modelo.addColumn("CELLULAR");
        modelo.addColumn("TRANSPORTE");
        modelo.addColumn("TARJETA NARANJA");
        modelo.addColumn("TARJETA BANCO CIUDAD");
        modelo.addColumn("FECHA");
        modelo.addColumn("Total Impuesto");
        modelo.addColumn("Total Tarjetas");
        modelo.addColumn("Total Servicios");
        modelo.addColumn("A pagar");
        modelo.addColumn("SUELDO_T");
        modelo.addColumn("ESTADO");
        int columnaEstado = -1;
        for (int i = 0; i < frm.J_tabla_calcular.getColumnCount(); i++) {
        if (frm.J_tabla_calcular.getColumnName(i).equals("ESTADO")) {
            columnaEstado = i;
            break;
        }
    }

        PreparedStatement pl = null;
        ResultSet rl = null;
        Conexion conn = new Conexion();
        java.sql.Connection con = conn.getConnection();

        String sql = "SELECT  id, codigo, sueldo, agip, monotributo, alquiler, celular, transporte, tarjeta_naranja, tarjeta_banco_ciudad, fecha_ingreso, total_impuesto, total_tarjetas, total_servicios, total_pagar, Total_sueldo, estado_cuenta FROM control";
        pl = (PreparedStatement) con.prepareStatement(sql);

        rl = pl.executeQuery();

        java.sql.ResultSetMetaData rsMd = rl.getMetaData();
        int cantidadColumnas = rsMd.getColumnCount();

        while (rl.next()) {

              Object[] filas = new Object[cantidadColumnas];

        for (int i = 0; i < cantidadColumnas; i++) {
            Object val = rl.getObject(i + 1);
            filas[i] = (val != null) ? val : "";
        }

        modelo.addRow(filas);
    }

     if (columnaEstado != -1) {
    frm.J_tabla_calcular.getColumnModel().getColumn(columnaEstado).setCellRenderer(new ColorTabla());
}
    } catch (SQLException ex) {
        System.err.println(ex.toString());

    }
}
}
