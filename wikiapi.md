## Categoria de códigos HTTP
Os códigos HTTP (ou HTTPS) possuem três dígitos, sendo que o primeiro dígito significa a classificação dentro das possíveis cinco categorias.

1XX: Informativo – a solicitação foi aceita ou o processo continua em andamento;

2XX: Confirmação – a ação foi concluída ou entendida;

3XX: Redirecionamento – indica que algo mais precisa ser feito ou precisou ser feito para completar a solicitação;

4XX: Erro do cliente – indica que a solicitação não pode ser concluída ou contém a sintaxe incorreta;

5XX: Erro no servidor – o servidor falhou ao concluir a solicitação.

Principais códigos de erro
Como dito anteriormente, conhecer os principais códigos de erro HTTP vai te ajudar a identificar problemas em suas aplicações, além de permitir que você entenda melhor a comunicação do seu navegador com o servidor da aplicação que está tentando acessar.

Error 403
O código 403 é o erro “Proibido”. Significa que o servidor entendeu a requisição do cliente, mas se recusa a processá-la, pois o cliente não possui autorização para isso.

Error 404
Quando você digita uma URL e recebe a mensagem Error 404, significa que essa URL não te levou a lugar nenhum. Pode ser que a aplicação não exista mais, a URL mudou ou você digitou a URL errada.

Error 500
É um erro menos comum, mas de vez em quando ele aparece. Esse erro significa que há um problema com alguma das bases que faz uma aplicação rodar. Esse erro pode ser, basicamente, no servidor que mantém a aplicação no ar ou na comunicação com o sistema de arquivos, que fornece a infraestrutura para a aplicação.

Error 503
O erro 503 significa que o serviço acessado está temporariamente indisponível. Causas comuns são um servidor em manutenção ou sobrecarregado. Ataques maliciosos, como o DDoS, causam bastante esse problema.

Uma dica final: dificilmente conseguimos guardar em nossa cabeça o que cada código significa, portanto, existem sites na internet que possuem todos os códigos e os significados para que possamos consultar quando necessário. Existem dois sites bem conhecidos e utilizados por pessoas desenvolvedoras, um para cada preferência: se você gosta de gatos, pode utilizar o HTTP Cats; já, se prefere cachorros, utilize o HTTP Dogs.

https://http.cat/<br>
https://http.dog/

## Response Entity

1.  Representação Completa da Resposta HTTP:

<li> O ResponseEntity encapsula toda a resposta HTTP, incluindo o código de status, cabeçalhos e corpo.
<li> Com ele, podemos configurar completamente a resposta que será enviada ao cliente.

2. Flexibilidade na Configuração:

<li> Ao retornar um ResponseEntity de um endpoint, o Spring cuida automaticamente de enviar a resposta correta.
<li> Isso nos dá flexibilidade para definir diferentes códigos de status, cabeçalhos e conteúdo no corpo da resposta com base em lógica específica.

## Spring Security

1. Autenticação e Autorização
<li> O Spring Security cuida da autenticação e autorização de usuários em aplicações web.</li>
<li> Com ele, os desenvolvedores podem passar menos tempo se preocupando com a segurança, deixando-a sob responsabilidade da ferramenta</li>

2. Recursos Oferecidos
<li> <b>Autenticação:</b>Suporta autenticação via banco de dados, LDAP, memória e outros mecanismos.</li>
<li> Autorização: Flexibilidade para proteger requisições web, invocações de métodos e instâncias de objetos.</li>
<li> <b>Prevenção de Ataques:<b> Protege contra ataques como session fixation e cross-site request forgery (CSRF)</li>

3. Integrações e Extensibilidade
<li> <b>O Spring Security</b> é altamente extensível e oferece integrações com vários mecanismos de autenticação, como LDAP e OAuth.</li>
<li>Além disso, é possível criar suas próprias extensões personalizadas.</li>

## Doc Spring data
https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

## JWT
https://jwt.io/libraries

## Method Security
https://docs.spring.io/spring-security/reference/servlet/authorization/method-security.html

## Novas funcionalidades
    - Controller: Mapaar a requisição
    - DTOs: Representa os dados que estão chegando e saindo da API
    - Entidade JPA e Repository:  Para isolar o acesso ao banco de dados
    - Migration: Para atualizações nas tabelas
