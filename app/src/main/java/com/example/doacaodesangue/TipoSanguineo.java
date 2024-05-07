package com.example.doacaodesangue;

public class TipoSanguineo {

    public String doacao (String tipo){
        switch (tipo){
            case "O+":
                return "O+ e O-";
            case "O-":
                return "O-";
            case "A+":
                return "A+, A-, O+ e O-";
            case "A-":
                return "A- e O-";
            case "B+":
                return "B+, B-, O+ e O-";
            case "B-":
                return "B- e O-";
            case "AB+":
                return "O+, A+, B+, AB+, O-, A-, B- e AB-";
            case "AB-":
                return "A-, B-, O- e AB-";
            default:
                return "Entrada de tipo sanguineo inválida, use o formato A+ por exemplo";
        }
    }
}
