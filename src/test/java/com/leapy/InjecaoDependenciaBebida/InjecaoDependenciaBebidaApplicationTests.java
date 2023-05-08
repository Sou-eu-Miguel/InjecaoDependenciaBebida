package com.leapy.InjecaoDependenciaBebida;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leapy.InjecaoDependenciaBebida.modelo.TipoCafe;
import com.leapy.InjecaoDependenciaBebida.service.MaquinaCafe;
import com.leapy.InjecaoDependenciaBebida.service.ProdutorExpressoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjecaoDependenciaBebidaApplicationTests {

  @Autowired
  private MaquinaCafe maquinaCafe;
  @Autowired
  private ProdutorExpressoService produtorExpressoService;

  @Test
  void contextLoads() {
  }

  @Test
  public void maquinaCafeDeveProduzirCafeExpresso() {
    var cafe = maquinaCafe.fazerCafe();
    assertEquals(TipoCafe.EXPRESSO.name(), cafe.getNome());
  }

  @Test
  public void ProdutorCafeDeveProduzirCafeExpresso() {
    var cafe = produtorExpressoService.fazerCafe();
    assertEquals(TipoCafe.EXPRESSO.name(), cafe.getNome());
  }
}
