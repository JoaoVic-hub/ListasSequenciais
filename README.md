# Lista Sequencial

Este projeto implementa uma lista sequencial de inteiros utilizando a linguagem Java. A lista sequencial é um tipo de estrutura de dados que permite armazenar e manipular uma sequência de elementos de forma eficiente.

## Funcionalidades

A implementação inclui as seguintes operações na lista sequencial:
1. Criação da lista vazia.
2. Verificar se a lista está vazia.
3. Verificar se a lista está cheia.
4. Obter o tamanho da lista.
5. Obter ou modificar o valor do elemento em uma determinada posição na lista.
6. Inserir um elemento em uma determinada posição.
7. Retirar um elemento de uma determinada posição.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

```plaintext
ListaSequencial/
│
├── src/
│   ├── ListaSequencial.java
│   └── TesteListaSequencial.java
└── Makefile
```
## Requisitos
- Java Development Kit (JDK)
- Make (para compilar e executar via Makefile)

##Compilação e Execução
Para compilar e executar o projeto, siga os passos abaixo:

Clonar o repositório:

````sh
git clone <URL_DO_REPOSITORIO>
cd ListaSequencial
````
Compilar o projeto:

````sh
make compile
````
Executar os testes:

````sh
make run
````
Limpar os arquivos compilados:

````sh
make clean
````

## Casos de Teste

Os casos de teste são definidos na classe `TesteListaSequencial.java` e cobrem as seguintes operações:

### Inserção de elementos

Verifica a inserção de elementos em diferentes posições da lista.

### Verificação se a lista está vazia

Verifica se a lista está vazia antes e depois da inserção de elementos.

### Verificação se a lista está cheia

Verifica se a lista está cheia após a inserção de elementos até sua capacidade máxima.

### Obtenção do tamanho da lista

Verifica o tamanho da lista após inserções e remoções de elementos.

### Modificação de elementos

Modifica os elementos em posições específicas e verifica as mudanças.

### Remoção de elementos

Remove elementos de diferentes posições e verifica o estado da lista após as remoções.
