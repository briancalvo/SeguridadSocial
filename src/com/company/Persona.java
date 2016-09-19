package com.company;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Brian on 19/09/2016.
 */
public class Persona {
    private String dni;
    private String num_ss;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private Double salario;

    /** Constructores **/
    public Persona(String dni, String num_ss, String nombre, String apellido1, String apellido2, Integer edad, Double salario) {
        this.dni = dni;
        this.num_ss = num_ss;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.salario = salario;
    }
    /** Getters **/
    public String getDni() {
        return dni;
    }
    public String getNum_ss() {
        return num_ss;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Double getSalario() {
        return salario;
    }
    /** Setters **/
    public void setNum_ss(String num_ss) {
        this.num_ss = num_ss;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (num_ss != null ? !num_ss.equals(persona.num_ss) : persona.num_ss != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        if (apellido1 != null ? !apellido1.equals(persona.apellido1) : persona.apellido1 != null) return false;
        if (apellido2 != null ? !apellido2.equals(persona.apellido2) : persona.apellido2 != null) return false;
        if (edad != null ? !edad.equals(persona.edad) : persona.edad != null) return false;
        return salario != null ? salario.equals(persona.salario) : persona.salario == null;

    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (num_ss != null ? num_ss.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0);
        result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        return result;
    }
}
