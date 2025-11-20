## 📦 Sistema de Controle de Estoque (POO)

Este projeto é um sistema simples de controle de estoque desenvolvido em Java, utilizando os princípios da **Programação Orientada a Objetos (POO)**, como Herança, Polimorfismo e Interfaces. O sistema gerencia diferentes tipos de itens de uma loja (roupas e acessórios) e simula operações básicas de venda e reposição de estoque.

-----

## 🎯 Conceitos de POO Aplicados

A estrutura do projeto foi modelada utilizando um **Diagrama de Classes UML** para demonstrar as relações de herança e implementação de interfaces:

  * **Interface (`Item.java`):** Define o contrato (`venda()`, `reposicaoEstoque()`, `getDescricao()`, `toString()`) que todos os itens gerenciáveis devem seguir.
  * **Classe Abstrata (`Peca.java`):** Serve como base para itens com tamanho único (`Acessorio`, `RoupaTamanhoUnico`), contendo atributos comuns (`descricao`, `quantidade`, `estoqueMinimo`, `estoqueMaximo`) e um método abstrato (`venda()`).
  * **Herança (`extends`):**
      * `Acessorio` herda de `Peca`.
      * `RoupaTamanhoUnico` herda de `Peca`.
  * **Implementação (`implements`):** Todas as classes de itens (`Acessorio`, `RoupaTamanhoUnico`, `RoupaPMG`) implementam a interface `Item`.
  * **Polimorfismo:** O `Vector<Item>` no `Main.java` permite que diferentes tipos de objetos sejam tratados de maneira uniforme, chamando métodos como `venda()` e `reposicaoEstoque()` sem saber a classe exata do objeto.

-----

## 📁 Estrutura do Projeto

O projeto é composto pelas seguintes classes e interface:

| Arquivo | Tipo | Descrição |
| :--- | :--- | :--- |
| `Item.java` | **Interface** | Define os métodos obrigatórios para um item de estoque. |
| `Peca.java` | **Classe Abstrata** | Base para itens com um único controle de quantidade (acessórios, roupas tamanho único). |
| `Acessorio.java` | **Classe Concreta** | Representa itens simples com lógica de venda em massa (por quantidade). |
| `RoupaTamanhoUnico.java` | **Classe Concreta** | Representa roupas simples que não possuem variação P/M/G. |
| `RoupaPMG.java` | **Classe Concreta** | Implementa itens com controle de estoque dividido por tamanhos (P, M, G). Não herda de `Peca`. |
| `Main.java` | **Executável** | Contém o *loop* principal para interação com o usuário, exibição do menu e simulação das operações. |

-----

## ⚙️ Funcionalidades

O sistema permite as seguintes operações através do menu:

1.  **Listagem de Itens:** Exibe todos os itens em estoque com suas descrições.
2.  **Venda (`venda()`):** Simula a venda de um item. A lógica varia conforme a classe:
      * **Acessórios:** Requer a digitação da quantidade vendida.
      * **RoupaPMG:** Requer a digitação do tamanho (P, M ou G).
      * **RoupaTamanhoUnico:** Diminui a quantidade em 1.
3.  **Reposição de Estoque (`reposicaoEstoque()`):** Verifica se a quantidade atual está abaixo do `estoqueMinimo`. Se estiver, repõe o estoque para o `estoqueMaximo`.

-----

## ▶️ Como Executar

1.  **Compilação:** Compile todos os arquivos Java:
    ```bash
    javac *.java
    ```
2.  **Execução:** Execute a classe principal:
    ```bash
    java Main
    ```
3.  **Interação:** Siga as instruções no console para selecionar um item e realizar operações de venda ou sair do sistema.
