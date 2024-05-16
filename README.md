# Projeto de Encurtador de URL

Este é um projeto de encurtador de URL desenvolvido com Java, Spring Framework e MongoDB, executado no IntelliJ IDEA. O objetivo do projeto é fornecer uma API para encurtar URLs longas e facilitar o seu compartilhamento.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **MongoDB**
- **Docker**
- **IntelliJ IDEA**
- **Postman** ou **Insomnia**

## Configuração e Execução

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Docker
- Docker Compose
- JDK 21
- IntelliJ IDEA

### Passos para Executar o Projeto

1. **Clone o repositório do projeto**:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_DIRETORIO_DO_PROJETO>
   ```

2. **Iniciar o MongoDB com Docker**:
   Navegue até o diretório `docker` dentro do projeto e execute o comando para subir o container do MongoDB:
   ```sh
   cd docker
   docker compose up
   ```

3. **Iniciar a aplicação Java**:
   Abra o projeto no IntelliJ IDEA e execute a aplicação Spring Boot. Você pode fazer isso abrindo a classe principal da aplicação (geralmente nomeada como `Application.java` ou algo similar) e clicando em "Run".

4. **Testar a API**:
   Utilize o Postman ou Insomnia para testar a API de encurtamento de URL. Faça uma requisição POST para o endpoint `http://localhost:8080/shorten-url` com o seguinte corpo JSON:
   ```json
   {
     "longUrl": "https://www.exemplo.com/uma-url-muito-longa"
   }
   ```
   A resposta será algo como:
   ```json
   {
     "shortUrl": "http://localhost:8080/abc123"
   }
   ```

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

- **src/main/java**: Contém o código-fonte Java.
  - **controller**: Contém os controladores REST.
  - **repository**: Contém as interfaces para acesso ao MongoDB.

- **src/main/resources**: Contém os arquivos de configuração.
  - **application.properties**: Configurações da aplicação Spring Boot.

- **docker**: Contém o arquivo `docker-compose.yml` para configurar e iniciar o MongoDB.

## Endpoints da API

- **POST /shorten-url**: Recebe uma URL longa e retorna uma URL encurtada.
