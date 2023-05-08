package com.leapy.InjecaoDependenciaBebida.service;

import com.leapy.InjecaoDependenciaBebida.modelo.Bebida;
import com.leapy.InjecaoDependenciaBebida.modelo.TipoCafe;

public class ProdutorExpressoService {

  public Bebida fazerCafe() {
    return new Bebida(TipoCafe.EXPRESSO.name());
  }
}
