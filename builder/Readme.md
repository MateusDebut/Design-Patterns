# Padrão Builder

![Builder Pattern](https://refactoring.guru/images/patterns/content/builder/builder-pt-br.png)

## Propósito

O padrão Builder é um padrão de projeto criacional que permite construir objetos complexos passo a passo. Ele separa a construção de um objeto de sua representação final, permitindo que o mesmo processo de construção possa criar diferentes representações.

## Problema

Imagine que você está criando uma aplicação para construir documentos. O documento pode conter textos, imagens, tabelas e outros elementos. Você pode representar um documento como uma estrutura de árvore de objetos. Um documento é um objeto complexo com muitos parâmetros opcionais. Você tem várias maneiras de configurar e montar um documento, resultando em várias subclasses possíveis de documento. No entanto, você deseja evitar uma explosão de subclasses de documento, já que cada combinação de elementos opcionais resultaria em uma nova classe de documento.



## Solução

O padrão Builder sugere que você extraia o código de construção do objeto e o coloque em uma série de classes Builder separadas. O padrão permite que você construa diferentes tipos de objetos usando os mesmos passos de construção.

![Builder Pattern](https://refactoring.guru/images/patterns/diagrams/builder/solution1.png)

A ideia principal por trás do padrão Builder é fornecer uma interface limpa e única para a construção de um objeto complexo, independentemente do tipo de objeto ou da representação final. O padrão Builder define um conjunto de etapas de construção e permite que você execute essas etapas para construir um objeto final.

## Estrutura

![Estrutura](https://refactoring.guru/images/patterns/diagrams/builder/structure.png)

A estrutura do padrão Builder inclui:

- **Diretor (Director)**: O Diretor é responsável por coordenar o processo de construção usando um objeto Builder. O Diretor não sabe qual tipo específico de objeto está sendo construído, ele apenas direciona o Builder com as etapas de construção.

- **Interface Builder (Builder Interface)**: Define os métodos necessários para construir as partes do objeto.

- **Builder Concreto (Concrete Builder)**: Implementa a interface Builder para construir e montar o produto. Cada Builder Concreto pode criar produtos diferentes, seguindo as mesmas etapas de construção definidas na interface Builder.

- **Produto (Product)**: O objeto complexo sendo construído. Pode ser uma classe final ou uma classe abstrata, dependendo das necessidades do projeto.

- **Cliente (Client)**: Cria um objeto Diretor e configura um Builder Concreto para a construção do produto. O Cliente inicia o processo de construção chamando as etapas do Builder e, finalmente, obtém o produto.

## Exemplo em Java

```java
// Classe Produto (Product)
class Document {
    // Representação do documento
}

// Interface Builder (Builder Interface)
interface Builder {
    void construirParteA();
    void construirParteB();
    Document getResult();
}

// Builder Concreto (Concrete Builder)
class ConcreteBuilder implements Builder {
    private Document document = new Document();

    @Override
    public void construirParteA() {
        // Implementação da construção da Parte A
    }

    @Override
    public void construirParteB() {
        // Implementação da construção da Parte B
    }

    @Override
    public Document getResult() {
        return document;
    }
}

// Diretor (Director)
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construir() {
        builder.construirParteA();
        builder.construirParteB();
    }
}

// Cliente (Client)
public class Cliente {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construir();
        Document document = builder.getResult();
    }
}
```

## Aplicabilidade

O padrão Builder é útil quando:

- Um objeto complexo deve ser construído passo a passo com muitas etapas configuráveis.
- O processo de construção de um objeto deve permitir diferentes representações finais.
- O código de construção precisa ser isolado do objeto principal e do cliente que o usa.

## Conclusão

O padrão Builder fornece uma maneira flexível de criar objetos complexos passo a passo. Ele ajuda a evitar uma explosão de subclasses de objetos e permite que diferentes representações de objetos sejam construídas usando o mesmo processo de construção. Isso torna o código de criação mais flexível, reutilizável e fácil de manter.