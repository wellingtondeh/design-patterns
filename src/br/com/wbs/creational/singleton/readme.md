<head>
	<style>
		body {
			color: #292929;
			text-align: justify;
		  	text-justify: inter-word;
			font-family: monospace;
			font-size: 15px;
		} 
		h1 {
			color: #292929;
			text-transform: uppercase;
			text-align: center;
			border-bottom: 1px dotted;
		}
		h2 {
			color: #292929;
			background: #ebebeb;
			padding: 10px;
		}
		.h2SemFormatacao {
			color: inherit;
			background: transparent;
			padding: 10px;
		}
		.link {
			font-size: 100%; 
			color: #292929 !important
			font-family: monospace !important;
		}
		.tip {
			font-size: 80%; 
			font-style: italic; 
			color: red;
			text-align: right;
			width: 100%;
			border-top: 50px;
		}
		.tip span {
			font-weight: bold;
			text-transform: uppercase;
			margin-right: 10px;
		}
		.pattern-name {
			color: red; 
			font-weight: bold;
			margin-left: 10px;
			text-transform: uppercase;
		}
		.content {
			margin-left: 20px;
			margin-right: 10px;
		}
	</style>
</head>
<body>

<h1>singleton</h1>

<div class="tip"><span>Dica importante:</span>para execução do projeto do padrão utilizado, inicie pela classe App.java</div>

<h2 class="h2SemFormatacao">Padrão:<span class="pattern-name">Criacional</span></h2>
<h2>Fonte</h2>
<div class="content">
Este estudo foi feito através do site <a href="https://refactoring.guru/pt-br/design-patterns/singleton" target="_blank" class="link">Refactoring Guru</a>.
</div>
<h2>Propósito</h2>
<div class="content">
Garantir um único objeto da classe.
</div>
<h2>Proplema proposto</h2>
<div class="content">
Você tem um recurso compartilhado, exemplo: Acesso ao banco de dados ou a leitura de um arquivo, você conseguiria controlar a quantidade de objetos de uma classe ao invés de criar o tempo todo o acesso ao banco ou aquele arquivo?
</div>
<h2>Solução</h2>
<div class="content">
O Singleton resolve esse problema, fornecendo apenas um único ponto de acesso aquela instância e criando apenas um único objeto na memória para a classe em questão.
</div>
<h2>Analogia com o mundo real</h2>
<div class="content">
Há várias analogias que podem ser citadas, sendo:
<ul>
	<li>O governo do país, onde há apenas um mandante oficial;</li>
	<li>A ignição do carro, onde só pode haver um lugar para ligar o carro.</li>
</ul>
</div>
<h2>Exemplos</h2>
<div class="content">
Algumas classes do próprio java são singleton, como:
<ul>
	<li>java.lang.Runtime#getRuntime()</li>
	<li>java.awt.Desktop#getDesktop()</li>
</ul>
</div>
<h2>Prós e contras</h2>
<div class="content">
A certeza que o objeto é unico no sistema, um acesso único para a instância e o objeto só é inicializado quando acionado pela primeira vez são os prós 
deste pattern. Por outro lado, a violação do principio da responsabilidade única, é o principal contra deste pattern. Entrentando há vários outros, como: 
mascarar um design ruim, tratamento diferenciado para o multithread e dificuldade em testes únitarios são exemplos.
</div>
<h2>Relações com outros padrões</h2>
<div class="content">
Facade, Flyweigth, Abstract Factory, Builder ou Prototype também são parecidos com o singleton, porém cada um deles precisariam ser adaptados.
</div>
</body>