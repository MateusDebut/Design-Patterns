# Padrão Prototype

## Propósito

O padrão Prototype é um padrão de projeto criacional que se concentra na criação de objetos através da clonagem de um protótipo existente. Ele permite criar novos objetos copiando um objeto existente, evitando assim a necessidade de criar objetos complexos do zero.
![Prototype Pattern](https://refactoring.guru/images/patterns/content/prototype/prototype.png)


## Problema

Quando você precisa criar objetos complexos que possuem muitas configurações e propriedades, a criação direta desses objetos pode ser ineficiente e complicada. Além disso, em alguns casos, é necessário criar objetos que são semelhantes a objetos já existentes, mas com pequenas variações. A criação repetida desses objetos semelhantes levaria a duplicação de código e complexidade desnecessária.

![](https://refactoring.guru/images/patterns/content/prototype/prototype-comic-1-pt-br.png)

## Solução

O padrão Prototype resolve esses problemas permitindo que você crie novos objetos clonando um protótipo existente. O protótipo é uma instância já existente de um objeto complexo. Ao clonar o protótipo, você obtém uma cópia do objeto com todas as suas configurações e propriedades. Você pode então fazer pequenas modificações na cópia, se necessário.

![Prototype Pattern](https://refactoring.guru/images/patterns/content/prototype/prototype-comic-2-pt-br.png)

## Estrutura

![](https://refactoring.guru/images/patterns/diagrams/prototype/structure.png)

1. >A interface Protótipo declara os métodos de clonagem. Na maioria dos casos é apenas um método clonar.
   
2. >A classe Protótipo Concreta implementa o método de clonagem. Além de copiar os dados do objeto original para o clone, esse método também pode lidar com alguns casos específicos do processo de clonagem relacionados a clonar objetos ligados, desfazendo dependências recursivas, etc.
   
3. >O Cliente pode produzir uma cópia do objeto usando o método clonar da interface Protótipo.

A estrutura do padrão Prototype inclui os seguintes elementos:

- **Protótipo (Prototype)**: A interface ou classe abstrata que define os métodos de clonagem. Os objetos concretos implementam essa interface.

- **Objeto Concreto (Concrete Object)**: A classe que implementa a interface do protótipo e fornece a lógica real de clonagem.

- **Cliente (Client)**: A classe que cria novos objetos clonando protótipos existentes.

## Aplicabilidade

O padrão Prototype é útil quando:

- Você deseja evitar a criação de objetos complexos a partir do zero e prefere clonar protótipos.
- Precisa criar objetos que são semelhantes a objetos existentes, mas com pequenas variações.
- Deseja evitar a duplicação de código ao criar objetos semelhantes.
- Os objetos a serem criados são determinados em tempo de execução com base em algumas configurações.

![](https://refactoring.guru/images/patterns/diagrams/prototype/example.png)

## Conclusão

O padrão Prototype é uma abordagem eficaz para criar objetos complexos de maneira eficiente e evitar a duplicação de código. Ele permite que você crie novos objetos clonando protótipos existentes e faz pequenas modificações conforme necessário. Isso torna o código mais flexível, reutilizável e fácil de manter.
