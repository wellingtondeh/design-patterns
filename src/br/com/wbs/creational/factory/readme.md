# Factory Method

> DICA IMPORTANTE: Para execução do projeto do padrão utilizado, inicie pela classe App.java

**Padrão**: *CRIACIONAL*

## Fonte de extração
Este estudo foi feito através do site <a href="https://refactoring.guru/pt-br/design-patterns/factory-method" target="_blank" class="link">Refactoring Guru</a> e do <a href="https://mhd-durrah.medium.com/factory-pattern-the-dynamic-way-with-java-8-3ca5ab48a9cf" target="_blank" class="link">mhd-durrah</a>.

## Propósito
Criação de objetos em uma "superclasse".


## Problema proposto
Imagine que você está criando um sistema de pontuação onde temos apenas o membro e bronze. Você consegue criar sem um padrão, mas e se quisermos adicionar outros modelos de pontuação, como: prata, ouro e platino? Como faria? 
Imagine que o prata entrará em "Produção" na data X, ouro na Y e Platino na data Z, como faria isso?

## Solução
Neste caso, utilizar o padrão Factory Method é uma ótima solução. Criaremos através do Java 8 com referências.

## Analogia com o mundo real
Imagina o uber que iniciou apenas com carros e hoje possui o uber eats e entrega colocando todas a informações dentro de uma única classe. Isso seria inviável, então, a melhor maneira é a separação para escalar a criação.


## Exemplos
Na SDK podemos encontrar as classes abaixo como exemplos:

- java.util.Calendar#getInstance()
- java.util.ResourceBundle#getBundle()
- java.nio.charset.Charset#forName()

## Prós e contras
Sem acoplamento firmes, SRP (Principio da responsabilidae única) e OCP (Principio do aberto/fechado) do SOLID são os prós deste padrão, entretando algumas vezes o código pode ficar complexo.

## Relações com outros padrões
Abstract Factory e template method.