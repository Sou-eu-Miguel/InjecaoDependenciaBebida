package com.leapy.InjecaoDependenciaBebida.modelo;

public class Bebida {
  private String nome;

  public Bebida(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}