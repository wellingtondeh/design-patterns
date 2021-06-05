# Prototype

> DICA IMPORTANTE: Para execução do projeto do padrão utilizado, inicie pela classe App.java

**Padrão**: *CRIACIONAL*

## Fonte de extração
Este estudo foi feito através do site <a href="https://refactoring.guru/pt-br/design-patterns/prototype" target="_blank" class="link">Refactoring Guru</a>.

## Propósito
Criar uma cópia de um objeto para outro de forma simplificada e sem dependências, ou seja, um protótipo de objeto.

## Problema proposto
Você finalmente conseguiu criar um carro (protótipo) e agora precisa criar cópias desses objetos, como seria realizado de uma maneira simples?

## Solução
Com o padrão *prototype* você consegue realizar essa cópia (clone) de uma maneira simples.

## Analogia com o mundo real
Pode se citar, conforme o artigo referente, a mitose celular (achei ótimo o exemplo).


## Exemplos
A interface **java.lang.Clonable** consegue realizar tal padrão de forma simples.
Lembrando que, é **obrigatório** a implementação do método clone de forma publica e com *casting*.

> Não realizarei a implementação do padrão sem a interface, pois é "inviável", uma vez que o próprio JAVA já aplica esse padrão dentro da SDK.

## Prós e contras
Não há acoplamento e é simples a implementação. Apesar da referência (o site) informar que para objetos complexos pode ficar complicado, com a interface não passarei por isso, conforme mostrado nos exemplos no qual faço algumas referências e apenas implementei o clonable na classe principal.

## Relações com outros padrões
N/A.
