package edu.joely.segundasemana;
//é uma classe
public class MinhaClasse {
    //void-não retornar nada, só executa


//é um metodo
public static void main(String[] args) {
    //arquivos javas são uma classe
     //System.out.print("ola turma, seja bem vindos");
//System.out.printIn("");

String PrimeiroNome = "joely";
String segundoNome = " Sousa";

String nomeCompleto = nomeCompleto(PrimeiroNome, segundoNome);

System.out.println(nomeCompleto);

}


public static String nomeCompleto (String PrimeiroNome, String segundoNome) {
    return "Resultado do metodo " + PrimeiroNome.concat(segundoNome);
    //return segundoNome;
    
}


}
