package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciocioProposto1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> listaTemperaturaMedia = new ArrayList<Double>();

        for(int i=0;i<6;i++){
            System.out.println("Digite a temperatura do mês " + (i+1) + " : ");
            listaTemperaturaMedia.add(leitor.nextDouble());
        }

        System.out.println(listaTemperaturaMedia.toString());

        double somaTemperaturas = 0.0;
        Iterator<Double> iterator = listaTemperaturaMedia.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            somaTemperaturas += next;
        }

        double temperaturaMediaSemestral = somaTemperaturas/listaTemperaturaMedia.size();
        System.out.printf("Temperatura Media Semestral: %.2f", temperaturaMediaSemestral);
        System.out.println("\n----------");

        for (Double temp: listaTemperaturaMedia) {
            if(temp > temperaturaMediaSemestral){
                int index = listaTemperaturaMedia.indexOf(temp);
                switch (index){
                    case 1:
                        System.out.printf("Janeiro %.2f \n", temp);
                        break;
                    case 2:
                        System.out.printf("Fevereiro %.2f \n", temp);
                        break;
                    case 3:
                        System.out.printf("Março %.2f \n", temp);
                        break;
                    case 4:
                        System.out.printf("Abril %.2f \n", temp);
                        break;
                    case 5:
                        System.out.printf("Maio %.2f \n", temp);
                        break;
                    case 6:
                        System.out.printf("Junho %.2f \n",temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                        break;
                }
            }

        }
    }
}


