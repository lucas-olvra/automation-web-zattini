#language: pt
#enconding: UTF-8
#author: Lucas
#date
#version

Funcionalidade: Login
  Com essa funcionalidade iremos conseguir realizar
  o login na aplicação com usuário já cadastrado.

  Como um usuário já cadastrado na aplicação
  Eu quero inserir os meus dados cadastrais
  Para conseguir realizar o login na aplicação

  Contexto: Entrar na tela de login
    Dado estiver na tela de login

    Cenario: Validar o login na aplicação
      Quando inserir os dados do usuário "lucasbra2000@outlook.com"
      Então devo visualizar o nome "Lucas"

    Esquema do Cenario: Validar mensagem de erro ao inserir dados incorretos
      Quando inserir os dados do usuário "dados_usuario"
      Então devo visualizar a mensagem de erro "Authentication failed."

      Exemplos:
        | dados_usuario   |
        | email_incorreto |
        | senha_incorreta |