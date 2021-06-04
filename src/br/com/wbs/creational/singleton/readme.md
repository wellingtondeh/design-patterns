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

<div class="tip"><span>Dica importante:</span>para execu��o do projeto do padr�o utilizado, inicie pela classe App.java</div>

<h2 class="h2SemFormatacao">Padr�o:<span class="pattern-name">Criacional</span></h2>
<h2>Fonte</h2>
<div class="content">
Este estudo foi feito atrav�s do site <a href="https://refactoring.guru/pt-br/design-patterns/singleton" target="_blank" class="link">Refactoring Guru</a>.
</div>
<h2>Prop�sito</h2>
<div class="content">
Garantir um �nico objeto da classe.
</div>
<h2>Proplema proposto</h2>
<div class="content">
Voc� tem um recurso compartilhado, exemplo: Acesso ao banco de dados ou a leitura de um arquivo, voc� conseguiria controlar a quantidade de objetos de uma classe ao inv�s de criar o tempo todo o acesso ao banco ou aquele arquivo?
</div>
<h2>Solu��o</h2>
<div class="content">
O Singleton resolve esse problema, fornecendo apenas um �nico ponto de acesso aquela inst�ncia e criando apenas um �nico objeto na mem�ria para a classe em quest�o.
</div>
<h2>Analogia com o mundo real</h2>
<div class="content">
H� v�rias analogias que podem ser citadas, sendo:
<ul>
	<li>O governo do pa�s, onde h� apenas um mandante oficial;</li>
	<li>A igni��o do carro, onde s� pode haver um lugar para ligar o carro.</li>
</ul>
</div>
<h2>Exemplos</h2>
<div class="content">
Algumas classes do pr�prio java s�o singleton, como:
<ul>
	<li>java.lang.Runtime#getRuntime()</li>
	<li>java.awt.Desktop#getDesktop()</li>
</ul>
</div>
<h2>Pr�s e contras</h2>
<div class="content">
A certeza que o objeto � unico no sistema, um acesso �nico para a inst�ncia e o objeto s� � inicializado quando acionado pela primeira vez s�o os pr�s 
deste pattern. Por outro lado, a viola��o do principio da responsabilidade �nica, � o principal contra deste pattern. Entrentando h� v�rios outros, como: 
mascarar um design ruim, tratamento diferenciado para o multithread e dificuldade em testes �nitarios s�o exemplos.
</div>
<h2>Rela��es com outros padr�es</h2>
<div class="content">
Facade, Flyweigth, Abstract Factory, Builder ou Prototype tamb�m s�o parecidos com o singleton, por�m cada um deles precisariam ser adaptados.
</div>
</body>