# med.voll.api



### Fluxo de uma Requisição de uma API REST com Filter e Controller

1. **Cliente (Browser ou Aplicação)**:
    - O cliente (usuário ou aplicação) inicia a requisição enviando uma solicitação HTTP para a API REST. Isso pode ser feito por meio de um navegador, aplicativo móvel ou qualquer outra ferramenta que faça chamadas HTTP.

2. **Controller**:
    - O **Controller** é responsável por receber a requisição do cliente.
    - Ele mapeia a URL da requisição para um método específico dentro do Controller.

3. **Filter (Filtro)**:
    - O **Filter** é um componente intermediário que pode ser configurado para executar antes ou depois do Controller.
    - Ele pode ser usado para realizar tarefas como autenticação, autorização, logging, manipulação de cabeçalhos, entre outros.
    - No fluxo de requisição, o Filter pode ser aplicado antes de chegar ao Controller.

4. **Controller Method (Método do Controller)**:
    - O método do Controller é invocado para processar a requisição.
    - Ele contém a lógica de negócio específica para a operação solicitada (por exemplo, criar, ler, atualizar ou excluir dados).

5. **Serviço (Service)**:
    - O Controller pode delegar parte da lógica de negócio para um **Serviço**.
    - O Serviço é responsável por executar operações mais complexas, como interagir com o banco de dados ou outras APIs.

6. **Repository (Repositório)**:
    - O **Repository** é responsável por acessar o banco de dados ou outra fonte de dados.
    - Ele realiza operações de leitura e gravação nos dados.

7. **Resposta HTTP**:
    - Após processar a requisição, o Controller retorna uma resposta HTTP.
    - A resposta pode incluir um código de status (por exemplo, 200 OK), cabeçalhos (como Content-Type) e um corpo (geralmente em formato JSON).

8. **Cliente Recebe a Resposta**:
    - O cliente (navegador, aplicativo) recebe a resposta HTTP e pode processá-la conforme necessário.

Esse fluxo ilustra como uma requisição é tratada desde o cliente até a resposta final da API REST, passando pelo Controller e possivelmente pelo Filter. 🚀

