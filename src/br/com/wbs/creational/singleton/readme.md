# SINGLETON

> DICA IMPORTANTE: Para execução do projeto do padrão utilizado, inicie pela classe App.java</div>

**Padrão**: *CRIACIONAL*

## Fonte de extração
Este estudo foi feito através do site <a href="https://refactoring.guru/pt-br/design-patterns/singleton" target="_blank" class="link">Refactoring Guru</a>.

## Propósito
Garantir um único objeto da classe.

## Problema proposto
Você tem um recurso compartilhado, exemplo: Acesso ao banco de dados ou a leitura de um arquivo, você conseguiria controlar a quantidade de objetos de uma classe ao invés de criar o tempo todo o acesso ao banco ou aquele arquivo?

## Solução
O Singleton resolve esse problema, fornecendo apenas um único ponto de acesso aquela instância e criando apenas um único objeto na memória para a classe em questão.

## Analogia com o mundo real
Há várias analogias que podem ser citadas, sendo:

- O governo do país, onde há apenas um mandante oficial;
- A ignição do carro, onde só pode haver um lugar para ligar o carro.


## Exemplos
Algumas classes do próprio java são singleton, como:
- java.lang.Runtime#getRuntime()
- java.awt.Desktop#getDesktop()

## Prós e contras

A certeza que o objeto é unico no sistema, um acesso único para a instância e o objeto só é inicializado quando acionado pela primeira vez são os prós 
deste pattern. Por outro lado, a violação do principio da responsabilidade única, é o principal contra deste pattern. Entrentando há vários outros, como: 
mascarar um design ruim, tratamento diferenciado para o multithread e dificuldade em testes únitarios são exemplos.

## Relações com outros padrões
Facade, Flyweigth, Abstract Factory, Builder ou Prototype também são parecidos com o singleton, porém cada um deles precisariam ser adaptados.
