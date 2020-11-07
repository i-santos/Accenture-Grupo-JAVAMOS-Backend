<p align="center">
  <img src="https://github.com/rondan100/Problemas_Solucoes/blob/master/javamos.png?raw=true" alt="Unform"/>
</p>

<h3 align="center">
  Desenvolvendo um sistema de passagens aéreas para decolar no desafio Accenture! 🚀
</h3>

<div align="center">

</div>

## Resumo

Somos uma equipe que está desenvolvendo um trabalho para o DESAFIO FINAL do treinamento da Accademia Accenture. O objetivo é aplicar os aprendizados absorvidos durante os dias que passamos aprimorando os conhecimentos da linguagem JAVA em um desafio real.
O trabalho será entregue para uma banca técnica, formada por profissionais de tecnologia da
Avanade, que avaliarão o código desenvolvido. Nossas competências
técnicas e comportamentais serão alocadas nos projetos que tenha mais fit com o nosso respectivo
perfil.

<h4 align="center"> 
	🚧  Java Select 🚀 Em construção...  🚧
</h4>

- **[Getting started](#itens-json)**
- **[Documentation](#itens-json)**

Quais ferramentas estamos usando?

- **[Java 8](https://docs.oracle.com/javase/8/)**
- **[SpringBoot](https://spring.io/projects/spring-boot)**
- **[Amadeus Java SDK](https://github.com/amadeus4dev/amadeus-java)**
- **[Lombok](https://projectlombok.org/)**
- **[REST-assured](https://rest-assured.io/)**
- **[Postman](https://www.postman.com/)**

## Dia 1 🚀

Foi o dia em que recebemos o desafio. Nesse dia, nós separamos as estruturas do projeto e discutimos como proceder de acordo com as habilidades de cada um. Essa parte de planejamento é muito importante para definirmos os objetivos específicos e focarmos no gerenciamento de tempo da melhor maneira possível. Nossas etapas foram:
- Entender os objetivos do desafio.
- Criar um grupo de discussão via áudio na plataforma Discord.
- Criar um modelo de projeto na plataforma Trello para gerenciarmos nossas atividades.

## Dia 2 🚀🚀

O segundo dia foi marcado pelo desenvolvimento do código de back-end. A escolha do banco de dados foi importante para o armazenamento e segurança de informações do usuário. Dentre várias opções, o PostgresSQL foi adotado graças ao alto desempenho e estabilidade do sistema. Um dos desafios foi pesquisar por API's que pudessem fornecer informações de sites de companhias aéreas de forma simples e eficiente. Após muitas tentativas sem sucesso, uma API em específico nos chamou atenção. O nome dela é Amadeus-Java, e o diferencial é que ela fornece um grande número de sites em comparação com as outras pesquisadas. Então definimos ela como padrão e aplicamos um filtro para que obtivéssemos os resultados necessários para nossa equipe. Os testes de implementação foram feitos com sucesso, o que nos deixou muito felizes :grin:. 

## Dia 3 🚀🚀🚀

O dia 3 se mostrou um desafio para nossa equipe. Nesse dia, houve mudança no horário da Accademia Accenture e também troca de professor. Foi, também, o dia em que dois integrantes do grupo tiveram que se apresentar ao escritório da Accenture para resolver alguns assuntos específicos da empresa. Todos esses contrapontos tiveram impacto na contribuição, porém o trabalho como um todo ainda permaneceu firme e forte :cowboy_hat_face:. A parte de Front-End foi desenvolvida e a Página de Login e Cadastro ficou sendo aprimorada para melhor visualização da interface para o usuário. Já, em outro aspecto, foi feito o diagrama com Tabelas e relacionamentos do Banco, deixando o código de forma muito organizada e muito útil para guardar os dados de forma mais flexível.

## Dia 4 🚀🚀🚀🚀

No dia 4, tivemos o conhecimento que a aplicação de front-end seria feito por uma equipe da Accenture e as equipes seriam encarregadas por desenvolver a API. Assim, deixamos nossa parte de front-end de lado, e começamos a ter foco total no back-end. A partir daí, precisamos realocar a distribuição de tarefas e, para isso, fizemos uma reunião via Discord e atribuímos as atividades de cada membro na plataforma Trello. O desafio desta vez foi entender o funcionamento de API's e foi preciso estudar a documentação de algumas delas, como a Flight Offer Price API. Um dos objetivos era fornecer um serviço de endpoint para resgatar os preços atualizados das passagens cada vez que ouvesse um requerimento para isso. Essa parte é muito importante para garantir a confiabilidade dos valores ao realizar uma compra. A compra, por sua vez, seria realizada por uma plataforma especializada para isso, e nossa equipe adotou a ferramenta 'pagar.me' para fazer essa integração. A nossa API estava numa fase em que já era posível buscar passagens aéreas e realizar o retorno delas em formato JSON. Em todo esse dia, também foi preciso ler e estudar a documentação do Azure DevOps para que possamos atuar de forma coordenada e colaborativa para gerar produtos melhores e mais confiáveis. Por fim, deixamos algumas tarefas a fazer, como a função de favoritar uma passagem, a compra dela e realizar testes automatizados.

## 📆 Feriadão 📆 

O feriadão de finados continuou sendo marcado por pesquisas com testes e mais testes para melhorar a API da melhor forma possível. Encontramos alguns BUGs no código e ao investigar, percebemos que foi causado pela inclusão do Lombok, que é uma biblioteca focada em produtividade com redução de código por meio de anotações. O problema foi corrigido manualmente ao identificar as linhas defeituosas. Ao revisar o projeto, encontramos outras inconscistências, como a possibilidade de se criar um usuário sem nome, sem senha e sem email. Isso foi rapidamente anotado para ser ajustado. Enfim, estávamos num estágio de refinamento e aplicar um código limpo, conforme é recomendado pelas boas práticas de Arquitetura de Software 👌.

## 4 dias restantes para entrega 💻🏃

A partir desse dia, começaram os treinamentos da Accenture, o que ocupou grande parte do tempo, sendo aulas ministradas no horário da manhã e tarde, e à noite a continuação da Accademia Accenture de Java. Assim, no pouco horário disponível, corrigimos os erros que econtramos anteriormente e continuamos a aplicar os testes pertinentes. 

## 3 dias restante para entrega 💻🏃🏃

Como o dia anterior, o dia todo foi marcado por treinamentos da Accenture, mostrando os primeiros passos com a empresa ✍️. Mesmo assim, continuamos a fazer nosso melhor e dividimos o tempo para conseguir fazer nossos deveres em paralelo, sem comprometer tanto nossas atividades e entregar os resultados no prazo. Na aula anterior da Accademia Accenture, o professor apresentou uma nova forma de consumir serviços, que até então, não tínhamos o conhecimento. Era o conceito de se utilizar API's externas diferente das que estávamos usando. O projeto [Feign](https://domineospring.wordpress.com/2017/06/02/feign-uma-forma-simples-para-consumir-servicos/) é um exemplo de mecanismo que automatiza a tarefa de consumir diversos serviços. Pra nossa equipe, isso foi muito bom, pois facilitou muito a integração com a plataforma [Pagar.me](https://pagar.me/). 

## 2 dias restantes para entrega 💻🏃🏃🏃

O grupo JAVAMOS continuou a se reunir na plataforma Discord para avaliarmos o progresso da aplicação. Então alinhamos algumas alterações para que pudéssemos documetar de forma a facilitar a documentação. Também discutimos se iríamos ter que subir os dados na plataforma Azure, mas caso algum problema surgisse nesse procedimento, faríamos um deploy na plataforma Heroku como um plano B. Também falamos sobre a forma que iríamos organizar a apresentação do desafio no dia final. Alguns bugs foram surgindo ao realizar os testes e pouco a pouco eles foram corrigidos, como o bug que permitia criar usuario sem a senha, assim foi passado validações para o controller de usuário. Foi um dia corrido, mas estávamos caminhando 🏃. 

## 1 dia restante para entrega 💻🏃🏃🏃🏃

Faltando 1 dia para a entrega desse projeto, a API JAVAMOS já estava nos retoques finais. A integração com o Pagar.me estava sendo desenvolvida e estávamos avaliando soluções com a plataforma da Microsoft Azure no serviço de DevOps. 

## Itens JSON

Ao iniciar a aplicação pela classe [~~Colocar Classe]()~~, será realizada a criação de tabelas de domínio e a inclusão de perfis de acesso A~~DMIN~~ e ~~USER~~.
Também é possível validar a autenticação do usuário ~~MASTER~~ através da documentação: ~~{HOST}:{PORTA}/swagger-ui.html~~~.

~~Códigos do local de origem e destino, data de saída, data de chegada, nome da linha aérea, número de vagas reserváveis, moeda e preço total.
Eles são indendificáveis por seus id's.

Por exemplo:

```javascript
{
      "id":3208846800,
      "originLocationCode":"BSB",
      "destinationLocationCode":"CGH",
      "departureDate":"2020-11-03T14:25:00.000+0000",
      "arrivalDate":"2020-11-03T17:50:00.000+0000",
      "airlineName":"AZUL LINHAS",
      "numberOfBookableSeats":9,
      "currency":"EUR",
      "totalPrice":109.78
   }
 ```

## License

[MIT ©](https://github.com/rabreu/Accenture-Grupo-JAVAMOS-Backend/blob/main/LICENSE) 
