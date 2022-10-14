#language:pt
Funcionalidade: Cria usuario

  @teste
  Cenario: Criar usuário preenchendo todos os campos
    Dado que preencho o body com todos os campos da Api
    Quando enviar a requisicao
    Entao entao api retorna os dados do usuário e codigo 200