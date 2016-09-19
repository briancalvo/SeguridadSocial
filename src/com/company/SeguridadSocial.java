package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 19/09/2016.
 */
public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial(){
        personasList = new ArrayList<>();
    }
    public void altaPersona(Persona persona){
        for (int i=0;i<personasList.size();i++){
            if (personasList.get(i).getDni().equals(persona.getDni())) {
                System.out.println("El DNI que ha introducido ya esta en uso.");
            }
            if(personasList.get(i).getNum_ss().equals(persona.getNum_ss())){
                System.out.println("El Numero de la Seguridad Social que ha introducido ya esta en uso.");
            }
            else{
                personasList.add(persona);
            }
        }
    }
    public void bajaPersona(String dni){

    }
    public Persona obtenerPersonaPorDNI(String dni){

    }
    public Persona obtenerPersonaPorNumSS(String numSS){

    }
    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

    }
    public List<Persona> obtenerPersonasMayoresQue(int edad){

    }
    public List<Persona> obtenerTodas(){

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
