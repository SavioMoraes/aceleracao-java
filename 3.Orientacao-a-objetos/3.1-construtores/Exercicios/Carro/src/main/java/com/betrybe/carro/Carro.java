package com.betrybe.carro;

public class Carro {
  private String marca;
  private String modelo;
  private int ano;

  static int contador = 0;

  public Carro (String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;

    Carro.contador++;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String exibirInformacoes() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
  }

  public static int quantidadeDeCarros() {
    return contador;
  }
}
