package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    private CrmService crmService;
    private CepApi cepApi;

    public Facade() {
        this.crmService = CrmService.getInstancia();
        this.cepApi = CepApi.getInstancia();
    }

    public void migrarCliente(String nome, String cep) {
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);
        
        crmService.gravarCliente(nome, cep, cidade, estado);
    }
}
