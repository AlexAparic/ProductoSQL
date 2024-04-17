package com.example.productosql;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.80.95:5984/db_william/_design/Josue/_view/Josue";
    static String urlMto = "http://192.168.80.95:5984/db_william";
    static String user = "admin";
    static String passwd = "Mejia372";

    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());

    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}
