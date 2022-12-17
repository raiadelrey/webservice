package app;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface BancoServer {
  @WebMethod String pegarBoleto(String codigoBarras);
  @WebMethod String criarBoleto(float Valor, String cpfCliente);
  @WebMethod Boolean verificarPagamento(String codigoBarras);
  @WebMethod Boolean cancelarBoleto(String codigoBarras);
}
