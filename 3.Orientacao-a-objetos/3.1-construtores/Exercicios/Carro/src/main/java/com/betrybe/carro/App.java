package com.betrybe.carro;

public class App {
  public static void main(String[] args) {
    Carro carro = new Carro("Hyundai", "HB20", 2022);
    System.out.println(carro.exibirInformacoes());
    System.out.println(Carro.quantidadeDeCarros());
  }
}
