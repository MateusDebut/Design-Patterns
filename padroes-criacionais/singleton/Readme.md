# Singleton

## Propósito
O Singleton é um padrão criacional que garante uma única instância de uma classe com um ponto de acesso global.
![](https://refactoring.guru/images/patterns/content/singleton/singleton.png)

## Problema
Resolve dois problemas:
1. **Garantia de uma Única Instância**: Controla o número de instâncias de uma classe, útil para gerenciar recursos compartilhados.
2. **Acesso Global**: Oferece um ponto de acesso global à instância, semelhante, mas mais seguro que variáveis globais.

![](https://refactoring.guru/images/patterns/content/singleton/singleton-comic-1-pt-br.png)

## Solução
Implementação comum:
- Construtor privado.
- Método estático que retorna a instância, criando-a se necessário.

## Analogia do Mundo Real
Comparável ao governo de um país, que é único e acessível globalmente.

## Estrutura
- A classe Singleton possui o método estático `getInstance` para acesso à sua única instância.
![](https://refactoring.guru/images/patterns/diagrams/singleton/structure-pt-br.png)
