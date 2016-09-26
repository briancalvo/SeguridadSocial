package com.company;

import javax.swing.*;
import java.util.*;

/**
 * Created by Brian on 23/09/2016.
 */
public class SeguridadSocialHashMap {
    private Map<String,Persona> personaMapDni = new HashMap<>();
    private Map<String,Persona> personaMapNum_ss = new HashMap<>();
    private Map<Integer,Persona> personaMapEdad = new HashMap<>();

    public void altaPersona(Persona persona){
        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapNum_ss.containsKey(persona.getNum_ss()) && !personaMapEdad.containsKey((persona.getEdad()))){
            personaMapDni.put(persona.getDni(),persona);
            personaMapNum_ss.put(persona.getNum_ss(),persona);
            personaMapEdad.put(persona.getEdad(),persona);
        }
    }
    public void bajaPersona(String dni){
        String Num_ss = null;
        Integer Edad = null;
        Num_ss = personaMapDni.get(dni).getNum_ss();
        Edad = personaMapDni.get(dni).getEdad();
        personaMapDni.remove(dni);
        personaMapNum_ss.remove(Num_ss);
        personaMapEdad.remove(Edad);
    }
    public Persona obtenerPersonaPorDNI(String dni){
        //personaMapDni.keySet(); Coger todas las Keys
        //personaMapDni.values(); Coger todos los values
        //personaMapDni.remove(dni);
        return personaMapDni.get(dni);
    }
    public Persona obtenerPersonaPorNumSS(String numSS){
        return personaMapNum_ss.get(numSS);
    }
    public Persona obtenerPersonasPorEdad(Integer edad) { return personaMapEdad.get(edad);}
    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personaMapDni.values()){
            if (personaActual.getSalario()>=min && personaActual.getSalario()<=max)aux.add(personaActual);
        }
        return aux;
    }
    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personaMapDni.values())if (personaActual.getEdad()>edad);
        return aux;
    }
    public List<Persona> ordenarPersonasEdad(){
        List<Persona> aux = new ArrayList<>(personaMapEdad.values());
        aux.sort(Comparator.comparing(Persona::getEdad));
        return aux;
    }
    public List<Persona> obtenerTodas(){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personaMapDni.values())aux.add(personaActual);
        return aux;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personaMapDni +
                '}';
    }
}
