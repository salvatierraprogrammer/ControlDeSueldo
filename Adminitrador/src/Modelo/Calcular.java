
package Modelo;

import javax.xml.crypto.Data;
import java.sql.Date;

public class Calcular {
    
    private int id; 
    private String codigo;
    private double sueldo;
    private double agip;
    private double monotributo;
    private double alquiler;
    private double celular;       
    private double transporte;
    private double T_naranja;
    private double T_Banco_Ciudad; 
    private Date fecha_ingreso;
    private double total_impuesto;
    private double total_tarjetas;
    private double total_servicios;
    private double total_pagar;
    private double Total_sueldo;
    private String estado_cuenta;

    public Calcular() {
    }

    public Calcular(int id, String codigo, double sueldo, double agip, double monotributo, double alquiler, double celular, double transporte, double T_naranja, double T_Banco_Ciudad, Date fecha_ingreso, double total_impuesto, double total_tarjetas, double total_servicios, double total_pagar, double Total_sueldo, String estado_cuenta) {
        this.id = id;
        this.codigo = codigo;
        this.sueldo = sueldo;
        this.agip = agip;
        this.monotributo = monotributo;
        this.alquiler = alquiler;
        this.celular = celular;
        this.transporte = transporte;
        this.T_naranja = T_naranja;
        this.T_Banco_Ciudad = T_Banco_Ciudad;
        this.fecha_ingreso = fecha_ingreso;
        this.total_impuesto = total_impuesto;
        this.total_tarjetas = total_tarjetas;
        this.total_servicios = total_servicios;
        this.total_pagar = total_pagar;
        this.Total_sueldo = Total_sueldo;
        this.estado_cuenta = estado_cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getAgip() {
        return agip;
    }

    public void setAgip(double agip) {
        this.agip = agip;
    }

    public double getMonotributo() {
        return monotributo;
    }

    public void setMonotributo(double monotributo) {
        this.monotributo = monotributo;
    }

    public double getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(double alquiler) {
        this.alquiler = alquiler;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public double getT_naranja() {
        return T_naranja;
    }

    public void setT_naranja(double T_naranja) {
        this.T_naranja = T_naranja;
    }

    public double getT_Banco_Ciudad() {
        return T_Banco_Ciudad;
    }

    public void setT_Banco_Ciudad(double T_Banco_Ciudad) {
        this.T_Banco_Ciudad = T_Banco_Ciudad;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public double getTotal_impuesto() {
        return total_impuesto;
    }

    public void setTotal_impuesto(double total_impuesto) {
        this.total_impuesto = total_impuesto;
    }

    public double getTotal_tarjetas() {
        return total_tarjetas;
    }

    public void setTotal_tarjetas(double total_tarjetas) {
        this.total_tarjetas = total_tarjetas;
    }

    public double getTotal_servicios() {
        return total_servicios;
    }

    public void setTotal_servicios(double total_servicios) {
        this.total_servicios = total_servicios;
    }

    public double getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(double total_pagar) {
        this.total_pagar = total_pagar;
    }

    public double getTotal_sueldo() {
        return Total_sueldo;
    }

    public void setTotal_sueldo(double Total_sueldo) {
        this.Total_sueldo = Total_sueldo;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

            
            
            }
