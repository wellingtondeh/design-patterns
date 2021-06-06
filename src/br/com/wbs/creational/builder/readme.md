# Builder

> DICA IMPORTANTE: Para execução do projeto do padrão utilizado, inicie pela classe App.java

**Padrão**: *CRIACIONAL*

## Fonte de extração
Este estudo foi feito através do site <a href="https://refactoring.guru/pt-br/design-patterns/factory-method" target="_blank" class="link">Refactoring Guru</a> e do <a href="https://stackoverflow.com/questions/31754786/how-to-implement-the-builder-pattern-in-java-8" target="_blank" class="link">Stack Overflow - GenericBuilder</a>.

## Propósito
Criar objetos complexos de forma mais simplificada.

## Problema proposto
Imagine você ter que criar um carro. Agora imagine isso em linha de produção. Ok? Agora imagina se alguém esquecer de colocar uma parte do carro, por exemplo, o motor. Isso pode aconter? Não, mas pode acontecer de alguém esquecer de colocar o manual. Por falar em manual, cada carro tem o seu. Agora imagina uma fábrica que monta vários marcas de carro, então o funcionário sem querer coloca o manual do Cruze da GM no Arbo da Fiat. Como fazer para resolver esse problema?

## Solução
O padrão builder consegue resolver, fazendo com que um "diretor" possa "fiscalizar" o que está ocorrendo e informando o que deve ser colocado o tempo todo.

## Analogia com o mundo real
O próprio problema com a solução já está bem próximo do mundo real.


## Exemplos
- java.lang.StringBuilder#append() (unsynchronized)
- java.lang.StringBuffer#append() (synchronized)
- java.nio.ByteBuffer#put() (também em CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer e DoubleBuffer)
- javax.swing.GroupLayout.Group#addComponent()

## Prós e contras
Construção de objetos passo a passo com retorno do objeto já pronto para uso, reutilização do mesmo codigo para construção e principio da responsabilidade única são prós desse padrão, porém a complexidade, muitas das vezes, é o contra.

## Relações com outros padrões
AbstractFactory, Composite, Brigde.