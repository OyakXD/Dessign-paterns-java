package subsistema1.crm;

public class CrmService {

    private CrmService() {
    }

    public static void gravarCliente(String name, String cep, String estado, String cidade){
        System.out.println("Cliente gravado com sucesso!");
        System.out.println("Nome: " + name);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}
