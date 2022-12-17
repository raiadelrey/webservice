package app;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "app.BancoServer")
public class BancoServerImpl implements BancoServer {

  public String pegarBoleto(String codigoBarras) {
    return "Boleto para o código" + codigoBarras;
  }

  public String criarBoleto(Float valor, String cpfCliente) {
    return "123.456.78910";
  }

  public Boolean verificarPagamento(String codigoBarras) {
    return true;
  }

  public Boolean divisao(String codigoBarras) {
    return false;
  }

}