package br.com.dio.collection.list;

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        List<String> respostas = new ArrayList<>();

        perguntas.add("Telefonou para vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println("Perguntas: ");
        for (String perg: perguntas) {
            System.out.println(perg);
            respostas.add(leitor.next().toLowerCase(Locale.ROOT));
        }

        System.out.println(respostas.toString());

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
