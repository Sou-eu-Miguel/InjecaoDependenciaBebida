package com.leapy.InjecaoDependenciaBebida.service;

import com.leapy.InjecaoDependenciaBebida.modelo.Bebida;

public class MaquinaCafe {

  private ProdutorExpressoService produzirExpressoService = new ProdutorExpressoService();

  public Bebida fazerCafe() {
    return produzirExpressoService.fazerCafe();
  }
}
