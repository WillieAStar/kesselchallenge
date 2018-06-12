### Apresentação do problema


Temos um grupo de rebeldes (Rogue One) prestes a se infiltrar na base de Scarif a nos enviar os planos da estrela da morte. Mas não temos um meio de comunicação pronto para receber essas informações.

Precisamos antes de mais nada, uma forma de que nosso grupo autentique-se ao realizar a transmissão de informações, isso vai garantir que caso o Império nos descubra, não envie informações falsas para nos despistar.

Com isso em mente, precisamos que você desenvolva uma aplicação no formato de API (mesmo em uma galaxia muito distante, ainda é usado REST) que permita a autenticação do grupo Rogue One e possa enviar as informações que julgamos necessárias.
 

Então a feature inicial de nossa aplicação é bastante simples: login e para isso você criará um recurso que deve autenticar em uma base de dados um *Post*:
``` 
{
	"login":"",
	"senha":""
}
```
Preocupe-se segurança, sessão e criptografia. Você precisa elaborar uma forma de garantir alguma facilidade quando os dados forem ser transmitidos e sempre ter que usar a senha para cada arquivo enviado mais pra frente, pode não ser uma boa.

Ao realizar o login com sucesso, nosso esquadrão terá um token autenticado para as próximas comunicações que ocorrerão logo em seguida.
```
{ 
	"result":{
		"status":authenticated"
		"token":"0x2883ab211a3b1...."
	}
	"error":null
	"date":"02-06-2018 12:13"
}
``` 
_(Lembre-se que o json acima é apenas uma referencia,você pode criar em cima algo bem legal)_


Em seguida, com seu token em mãos, você deve preparar o recebimento do modelo (`DeathPlans`) que está dentro dos projetos de referencia. Por fim, você deve receber esses dados, valida-los e garantir que a transmissão está completa e integra.

### O quê esperamos 

Essa solução para esse problema pode ser oferecida em algumas linguagens como:
* Java 
* Scala
* Groovy
* Kotlin
* Go
* Node.js

Estamos disponibilizando modelos em 2 linguagens (Java e Go), mas sinta-se a vontade para resolver nas outras da lista acima

Esse é um teste focado em design de código, conhecimento de orientação a objeto (ou funcional, caso assim você opte) e qualidade no geral da solução proposta. O objetivo é avaliar sua experiênica em escrever código de fácil manutenção, baixo acoplamento, e alta coesão.

Isoladamente são features simples de implementar, mas queremos que você leve em conta a evolução futura do software. Imagine que a solução irá crescer em  features, e ser adicionada no futuro, então escolha muito bem suas ferramentas. Você deve pensar num design de código que suporte esses casos de uso sem  grandes modificações.

Existem algumas pegadinhas, então tente corrigi-las ou simplesmente apaga-lás caso queira.

### Avaliação

Para nos enviar seu código, você pode:
* Fazer um fork desse repositório e nos mandar uma pull-request
* Dar acesso ao seu repositório *privado* no [Github](http://github.com) para `kesselchallenge`.
* Enviar um `git bundle` do seu repositório para o e-mail selecao@astarlabs.com.br e/ou jc@astarlabs.com