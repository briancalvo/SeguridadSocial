package com.company;

/**
 * Created by Brian on 23/09/2016.
 */
public class MainHashMap { public static void main(String[] args) {

    SeguridadSocialHashMap seguridadSocialHashMap = new SeguridadSocialHashMap();

    Persona jose = new Persona("39425364H","111111111","Jose","Tomas","",35,45000.00);
    Persona maria = new Persona("39425654W","333333333","Maria","Gallego","",55,61300.20);
    Persona carlos = new Persona("39425355Q","222222222","Carlos","Torres","",22,23000.00);
    Persona anna = new Persona("39425987J","444444444","Anna","Pina","",26,17654.88);

    seguridadSocialHashMap.altaPersona(jose);
    seguridadSocialHashMap.altaPersona(maria);
    seguridadSocialHashMap.altaPersona(carlos);
    seguridadSocialHashMap.altaPersona(anna);
    System.out.println("Altas a la seguridad social: "+seguridadSocialHashMap.obtenerTodas());

    System.out.println("Baja a la seguridad social: "+anna);
    seguridadSocialHashMap.bajaPersona(anna.getDni());

    System.out.println("Lista de afiliados a la S.S : "+seguridadSocialHashMap.obtenerTodas());

    System.out.println("Obtener persona por dni: "+seguridadSocialHashMap.obtenerPersonaPorDNI(carlos.getDni()));

    System.out.println("Obtener persona por numero seguridad social: "+seguridadSocialHashMap.obtenerPersonaPorNumSS(maria.getNum_ss()));

    System.out.println("Obtener personas por rango Salarial: "+seguridadSocialHashMap.obtenerPersonasRangoSalarial(23000.00,45000.00));

    System.out.println("Obtener Personas Mayores que: "+seguridadSocialHashMap.obtenerPersonasMayoresQue(25));
    System.out.println("Obtener Personas Mayores que: "+seguridadSocialHashMap.ordenarPersonasEdad());

}
}
