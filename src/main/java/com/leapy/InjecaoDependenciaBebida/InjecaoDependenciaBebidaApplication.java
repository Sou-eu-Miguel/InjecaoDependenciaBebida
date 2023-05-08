package com.leapy.InjecaoDependenciaBebida;

import com.leapy.InjecaoDependenciaBebida.service.MaquinaCafe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaoDependenciaBebidaApplication {

  public static void main(String[] args) {
    final var contexto = SpringApplication.run(InjecaoDependenciaBebidaApplication.class, args);
    final var maquinaCafe = contexto.getBean(MaquinaCafe.class);

    maquinaCafe.fazerCafe();
  }

}
