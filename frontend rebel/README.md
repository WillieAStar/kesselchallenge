### Apresentação do problema



O arquivo `index.html` contém o gostariamos que fosse uma pagina de login totalmente incrivel e
que deixasse nosso usuario confortavel com um processo sempre tão repetitivo que é colocar senha 
para entrar em qualquer sistema.
Mas vamos concordar que ele é bem feio e precisa de uma boa *tunada*. 

Então a feature inicial de nossa aplicação é bastante simples: login e para isso você acessará nossa
api já prontinha para consumo. Atrávés de um *Post* em _https://astar-frontend-service.herokuapp.com/login_
``` 
{
	"login":"",
	"senha":""
}
```
`Não se preocupe com segurança, cache, sessão ou criptografia (ainda), é apenas um teste ensaiado.`
Ah!, antes que eu me esqueça, as credenciais corretas são login:hansolo e password:millenium

Ao realizar o login com sucesso, você deverá redirecionar a pagina para a `dashboard.html` que deverá conter
na `<div id="graficoEmBarras">` um grafico de barras com todo o histórico de logins divididos por data. 
Tá, e como você acessa isso ? Faça um *Get* em _https://astar-frontend-service.herokuapp.com/log_

Agora, na `<div id="listaLog">` você devera nos mostrar um grid contendo as informações mais relevantes 
dos usuarios que entraram no sistema, com um mecanismo de busca por texto (se for aqueles que sugerem 
resposta, vai ser mais legal ainda).


### O quê esperamo 

Esse é um teste focado em design de código, em design de UI, e conhecimento de orientação a 
objeto. O objetivo é avaliar sua experiênica em escrever código de fácil 
manutenção, baixo acoplamento, e alta coesão.

Isoladamente são features simples de implementar, mas queremos que você 
leve em conta a evolução futura do software. Imagine que o app irá crescer em 
features, e adicionar no futuro, então escolha muito bem suas ferramentas

Você deve pensar num design de código que suporte esses casos de uso sem 
grandes modificações.

Existem algumas pegadinhas, então tente corrigi-las ou simplesmente apaga-lás caso queira.

### Avaliação

Para nos enviar seu código, você pode:
* Fazer um fork desse repositório e nos mandar uma pull-request
* Dar acesso ao seu repositório *privado* no [Github](http://github.com) para `kesselchallenge`.
* Enviar um `git bundle` do seu repositório para o e-mail selecao@astarlabs.com.br e/ou jc@astarlabs.com