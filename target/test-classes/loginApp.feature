#language: pt

  Funcionalidade: Login


@Teste @credencial_vazia
  Cenario: Tentativa de login com credenciais vazias
    Dado que eu clico no menu lateral esquerdo
    E clicar no menu do lado direito
    E clicar em login
    Quando clicar em logar
    Entao validar mesangem de erro com "Catch you, anonymous!"

    @Teste @senha_vazia
      Cenario: Tentativa de login com senha vazia
        Dado preencher login "roberto"
        Quando clicar em logar
        Entao validar mesangem de erro com "You got a short…password"
        E clicar no botao cancel
    @Teste @credencial_invalida
      Cenario: Tentativa de login com credenciais inválidas
        Dado que eu clico no menu lateral esquerdo
        E clicar no menu do lado direito
        Quando clicar em login
        Entao validar mesangem de erro com "Arrr...wrong username/password"
      @Teste @login_sucesso @logout
        Cenario: Após login com sucesso, realizar logout
          E alterar login para "roob2x"
          E alterar senha para "12345678"
          Quando clicar em logar
          E que eu clico no menu lateral esquerdo
          Entao validar que o usuario esta logado como "roob2x"
          E clicar em deslogar
        #@Teste @login @ligacao
    @Rob
          Cenario:Inserir informações de credenciais, receber uma chamada, aceitá-la,
              finalizá-la e verificar que as informações inseridas nos campos de credenciais foram mantidas.
            Dado que eu clico no menu lateral esquerdo
            E clicar no menu do lado direito
            E clicar em login
            E preencher login "roberto"
            E preencer senha "12345"
            Quando fazer ligacao para o numero "15555215554"
            E aceitar ligacao "15555215554"
            E finalizar ligacao "15555215554"
            Entao validar que o login esta preenchido com "roberto"
            E  validar que a senha esta preenchido com "12345"