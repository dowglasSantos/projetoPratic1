package br.com.dowglas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String option = "";
        String menu = "";

        System.out.println("***** Sistema de cadastro de clientes *****");

        do{
            System.out.println("Digite 1 para registrar um cliente");
            System.out.println("Digite 2 para atualizar um cliente");
            System.out.println("Digite 3 para remover um cliente");
            System.out.println("Digite 4 para consultar um cliente");

            System.out.print("Informe uma das opções: ");
            menu = s.next();

            if(menu.equals("1")) {

            } else if(menu.equals("2")) {

            } else if(menu.equals("3")) {
                
            } else if(menu.equals("4")) {
                
            }

            System.out.print("Deseja voltar voltar ao menu anterior(s/n)? ");
            option = s.next();
        } while(option.equals("s"));

        
    }
}