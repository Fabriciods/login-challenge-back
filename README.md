# Projeto Ktor - Login e Listagem de Usuários

Este é um projeto simples desenvolvido com Ktor que oferece duas funcionalidades principais:

1. **/login:** Um endpoint `POST` que recebe `login: String` e `password: String`, e retorna um `userName:String` correspondente ao login. `/login` 
2. **/users:** Um endpoint `GET` que retorna uma lista de usuários, incluindo `userName`, `password` e `login`.
(./assets/Users.png)   

## Requisitos

- JDK 11 ou superior
- Ktor
- Qualquer ferramenta para enviar requisições HTTP (por exemplo, Postman ou curl)

## Como Rodar

O projeto roda na porta **8080** caso já exista algum projeto rodando nessa porta será necessário trocar a porta no arquivo **application.yaml**. Para rodar o projeto, basta executar o arquivo main na classe Application ou usar o comando na raiz do projeto:

```bash
./gradlew run
