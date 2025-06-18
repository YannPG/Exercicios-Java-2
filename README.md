# Projeto: Estrutura Sequencial em Java

Este repositório contém uma coleção de exercícios de fixação focados em **Estrutura Sequencial**, resolvidos utilizando a linguagem Java. O principal objetivo do projeto é aplicar os fundamentos da programação de forma organizada, seguindo os princípios da Programação Orientada a Objetos (OOP) e um padrão de arquitetura Model-Controller.

## 🏛️ Arquitetura e Padrão de Projeto

Cada exercício é desenvolvido seguindo uma arquitetura limpa que separa as responsabilidades do código em camadas distintas:

* **Model**: Representa os dados e a lógica de negócio do problema. É responsável pelos cálculos e por manter o estado dos dados.
    * *Exemplo*: A classe `Retangulo` sabe como calcular sua própria área, perímetro e diagonal.

* **Controller**: Atua como o intermediário entre o usuário e o `Model`. Sua função é:
    1.  Receber os dados de entrada do usuário.
    2.  Passar esses dados para o `Model`.
    3.  Chamar os métodos de cálculo do `Model`.
    4.  Exibir os resultados formatados para o usuário.

* **Application (Main)**: É o ponto de entrada do programa. Apresenta um menu interativo que permite ao usuário escolher qual exercício executar. É responsável por gerenciar o ciclo de vida da aplicação e recursos compartilhados, como o `Scanner`.

## 🚀 Tecnologias e Conceitos

* **Java 17**: Utiliza recursos da versão 17 da linguagem Java.
* **Programação Orientada a Objetos (OOP)**: Conceitos como Encapsulamento, Abstração e Coesão são aplicados para criar um código mais limpo, reutilizável e de fácil manutenção.
* **Gerenciamento de Recursos**: O projeto demonstra a forma correta de gerenciar recursos compartilhados, como o `System.in`, utilizando uma única instância do `Scanner` que é passada por todo o programa.

## ✅ Exercícios Implementados

1.  **Terreno**: Calcula a área e o preço de um terreno retangular.
2.  **Retângulo**: Calcula a área, o perímetro e a diagonal de um retângulo.
3.  **Idades**: Lê nome e idade de duas pessoas e calcula a idade média.
4.  **Soma**: Lê dois números inteiros e exibe a soma.
5.  **Troco**: Calcula o troco em uma transação de compra.
6.  **Círculo**: Calcula a área de um círculo a partir do seu raio.
7.  **Pagamento**: Calcula o salário de um funcionário com base no valor/hora e horas trabalhadas.
8.  **Consumo**: Calcula o consumo médio de combustível de um carro.
9.  **Medidas**: Calcula as áreas de um quadrado, triângulo e trapézio com base em três medidas.
10. **Duração**: Converte uma duração de tempo de segundos para o formato `horas:minutos:segundos`.

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* **JDK (Java Development Kit)**: Versão 17 ou superior.
* **IDE (Ambiente de Desenvolvimento Integrado)**: IntelliJ IDEA, Eclipse ou VS Code com o pacote de extensões para Java.

### Passos

1.  **Clone ou baixe** este repositório para a sua máquina local.
2.  **Abra o projeto** na sua IDE de preferência.
3.  **Localize e execute** o arquivo principal: `src/main/java/com/exercicios/Java/Atividade/AtividadeApplication.java`.
4.  O menu interativo aparecerá no console. Digite o número do exercício que deseja testar e pressione Enter.
