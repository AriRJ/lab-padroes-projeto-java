package subsistema1.crm;

public class CrmService {

    private static CrmService instancia = new CrmService();

    private CrmService() {
        super();
    }

    public static CrmService getInstancia() {
        return instancia;
    }
    
    public void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}

