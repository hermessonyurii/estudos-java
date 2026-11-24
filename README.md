# Estudos e Fundamentos em Java ☕

Repositório dedicado em minha evolução na programação com **Java**, reunindo exercícios práticos, exemplos conceituais e algoritmos para consolidação da lógica de programação e boas práticas de código.

---

## 🛠️ Tecnologias e Ferramentas
- **Linguagem:** Java (JDK 21)
- **Framework & Libs:** Spring Boot, Spring Data JPA, Hibernate, Flyway
- **Banco de Dados:** PostgreSQL
- **Testes de API:** Insomnia
- **IDE:** IntelliJ IDEA / Eclipse / VS Code
- **Controle de Versão:** Git & GitHub

---

## 📂 Estrutura do Repositório

O repositório está organizado por módulos temáticos para facilitar a navegação e o aprendizado progressivo:

```text
estudos-java/
├── 01-fundamentos/             # Conceitos básicos e estrutura sequencial
│   └── src/
│       ├── programa.Main.java a Main8.java   # Entrada/saída, Locale, Scanner, casting
│       ├── Exercicio1 a 7.java      # Exercícios práticos de fixação
│       └── aulas_novas/             # Aulas práticas (programa.Main a Main10: tipos, operadores, switch moderno, Scanner, JOptionPane)
│
├── 02-condicionais-e-lacos/    # Controle de fluxo e estruturas de repetição
│   └── src/
│       ├── condicionais/            # if-else, operador ternário e switch-case
│       ├── repeticao_while/         # Estrutura de repetição while
│       └── repeticao_for/           # Estruturas de repetição for e do-while
│
├── 03-poo-basico/              # Introdução à Programação Orientada a Objetos
│   └── src/
│       ├── funcoes/                 # Funções e métodos estáticos
│       ├── retangulo/               # Classes, atributos, métodos e cálculo de área/perímetro
│       └── triangulo/               # Exercício de comparação de áreas com classes
│
├── 04-arrays-e-vetores/        # Estruturas de dados (Vetores e Coleções)
│   └── src/
│       ├── application/             # Programas com vetores de primitivos e vetores de objetos
│       └── entities/                # Entidade Product
│
└── 05-spring-boot-crud/        # API RESTful com Spring Boot e PostgreSQL
    ├── pom.xml                 # Gerenciamento de dependências e plugins Maven
    ├── mvnw / mvnw.cmd         # Maven Wrapper
    └── src/
        ├── main/java/com/hermessonaula/crud/
        │   ├── CrudApplication.java        # Inicialização Spring Boot
        │   ├── controllers/                # Endpoints REST (ProductController)
        │   ├── model/                      # Entidades mapeadas no banco (Product)
        │   └── repositories/               # Acesso a dados com Spring Data JPA (ProductRepository)
        └── main/resources/
            ├── application.properties      # Configurações do Spring e DataSource
            └── db/migration/               # Migrações versionadas com Flyway
```

---

## 📌 Tópicos Abordados

- **01 - Fundamentos:**
  - Estrutura básica de um programa Java (método `main`).
  - Tipos primitivos (`byte`, `short`, `int`, `float`, `double`, `boolean`), classes *Wrapper* (`Integer`, `Double`, `Byte`, etc.), constantes (`final`) e declaração de variáveis.
  - Operadores aritméticos (`+`, `-`, `*`, `/`, `%`), relacionais (`<=`, `>=`, etc.) e lógicos (`&&`, `||`).
  - Estruturas de decisão (`if`, `else if`, `else`) e operador ternário (`? :`).
  - Estruturas de seleção: `switch-case` tradicional e *Switch Expressions* modernas com sintaxe de seta (`->`).
  - Entrada de dados pelo console com `Scanner` e padronização com `Locale.US`.
  - Interfaces gráficas interativas com `JOptionPane` (`showInputDialog`, `showMessageDialog`) e conversão de dados (*parsing* com `Integer.parseInt` e `Double.parseDouble`).

- **02 - Condicionais e Laços:**
  - Estruturas de decisão: `if`, `else if`, `else`, operador ternário `? :` e `switch-case`.
  - Estruturas de repetição: `while`, `for` e `do-while`.
  - Lógica com acumuladores, contadores e validação de dados.

- **03 - Programação Orientada a Objetos (POO):**
  - Criação de classes, atributos e métodos.
  - Instanciação de objetos e separação de responsabilidades.
  - Métodos auxiliares (`max`, funções reutilizáveis).

- **04 - Arrays e Vetores:**
  - Vetores para tipos primitivos (`double[]`).
  - Vetores de objetos (`Product[]`).
  - Manipulação de dados e cálculos com arrays.

- **05 - Spring Boot & API REST (CRUD):**
  - Configuração e estruturação de microsserviço/API com Spring Boot 3+.
  - Criação de endpoints RESTful utilizando `@RestController`, `@RequestMapping` e `@GetMapping`.
  - Mapeamento objeto-relacional (ORM) com Jakarta Persistence / Hibernate (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`).
  - Camada de persistência simplificada com Spring Data JPA (`JpaRepository`).
  - Conexão e integração com banco de dados relacional **PostgreSQL**.
  - Versionamento de esquema de banco de dados com **Flyway**.
  - **Segurança de credenciais:** Uso de variáveis de ambiente (`${DB_PASSWORD}`) e importação opcional de `application-local.properties` (ignorado no Git via `.gitignore`), garantindo que senhas locais nunca sejam versionadas publicamente.

---

*Desenvolvido por [Hermesson Yuri](https://github.com/hermessonyurii) | [Linkedin](https://www.linkedin.com/in/hermesson-yuri/).*