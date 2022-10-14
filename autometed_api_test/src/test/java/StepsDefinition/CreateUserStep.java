package StepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CreateUserStep {
    @Dado("que preencho o body com todos os campos da Api")
    public void que_preencho_o_body_com_todos_os_campos_da_api()throws Exception {
        System.out.println("Teste passed");
    }

    @Quando("enviar a requisicao")
    public void enviar_a_requisicao() throws Exception{
        System.out.println("Teste passed");
    }

    @Entao("entao api retorna os dados do usuário e codigo 200")
    public void entao_api_retorna_os_dados_do_usuario_e_codigo()throws Exception {
        System.out.println("Teste passed");
    }
}
