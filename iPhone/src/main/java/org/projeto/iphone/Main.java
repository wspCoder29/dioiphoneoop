package org.projeto.iphone;

import org.projeto.iphone.service.IPhone;

public class Main {
    public static void main(String[] args) {


        System.out.println("Iphone instanciado");
        IPhone iphone = new IPhone();

        String telefone = "1199999999";
        System.out.println("Fazendo ligação para o número: "+telefone);
        iphone.ligar(telefone);





    }
}