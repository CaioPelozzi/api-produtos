# API REST - PRODUTOS (web service)     

## 📖 Sobre o Projeto   
Este projeto consiste em uma API REST desenvolvida em Java, utilizando o ecossistema Spring. A API foi criada como parte dos estudos do curso **"Java COMPLETO Programação Orientada a Objetos +Projetos"** do professor Nélio Alves, aplicando conceitos de desenvolvimento web backend, acesso a banco de dados com JPA/Hibernate e boas práticas de arquitetura de software.   
A aplicação resumidamente simula um web service de usuários realizando pedidos de produtos.

---

## 🚀 Tecnologias Utilizadas
Este projeto foi construído com as seguintes tecnologias e ferramentas:

- Java 21: Versão da linguagem Java (LTS).

- Spring Boot 3.5.6: Framework principal para criação de aplicações stand-alone e baseadas em Spring.

- Spring Data JPA: Facilita a implementação de repositórios para acesso a dados.

- Hibernate: Implementação padrão do JPA para mapeamento objeto-relacional (ORM).

- H2 Database: Banco de dados em memória para o ambiente de desenvolvimento e testes.

- Maven: Ferramenta de gerenciamento de dependências e build do projeto.

- Postman: Ferramenta utilizada para testar e validar os endpoints da API.

---

## 📂 Estrutura do projeto   
```
/src/main/java/com.educandoweb.course/
│
├── config/
│   └── TestConfig.java           # Classe de configuração para inserção de entidades
│
├── entities/
│   ├── enums/                    # Enumerado dos status do pedido
│   ├── pk/                       # Classes para chaves primárias compostas (PKs) 
│   ├── User.java                 # Entidade JPA que representa o Usuário
│   ├── Product.java              # Entidade JPA que representa o Produto
│   ├── Category.java             # Entidade JPA que representa a Categoria
│   ├── Order.java                # Entidade JPA que representa o Pedido
│   ├── OrderItem.java            # Entidade JPA para o item de pedido (associação)
│   └── Payment.java              # Entidade JPA que representa o Pagamento
│
├── repositories/
│   ├── UserRepository.java       # Interface Data Access (JPA) para Usuário
│   ├── ProductRepository.java    # Interface Data Access (JPA) para Produto
│   ├── CategoryRepository.java   # Interface Data Access (JPA) para Categoria
│   ├── OrderRepository.java      # Interface Data Access (JPA) para Pedido
│   └── OrderItemRepository.java  # Interface Data Access (JPA) para Item de Pedido
│
├── resources/
│   ├── UserResource.java         # Controller REST para o recurso Usuário
│   ├── ProductResource.java      # Controller REST para o recurso Produto
│   ├── CategoryResource.java     # Controller REST para o recurso Categoria
│   ├── OrderResource.java        # Controller REST para o recurso Pedido
│   └── exceptions/               # Manipuladores de exceção para a camada REST
│
├── services/
│   ├── UserService.java          # Camada de serviço com regras de negócio para Usuário
│   ├── ProductService.java       # Camada de serviço com regras de negócio para Produto
│   ├── CategoryService.java      # Camada de serviço com regras de negócio para Categoria
│   ├── OrderService.java         # Camada de serviço com regras de negócio para Pedido
│   └── exceptions/               # Exceções customizadas para a camada de serviço
│
└── CourseApplication.java        # Classe principal que inicia a aplicação Spring Boot
