### Apresentação do problema


Temos um grupo de rebeldes (Rogue One) prestes a se infiltrar na base inimiga de Scarif para nos enviar os planos da estrela da morte.
O problema é que a nossa base responsável por receber tais informações foi destruída e precisamos urgentemente **desenvolver um novo meio de comunicação seguro**.

Nosso grupo de rebeldes, antes de nos transmitir as informações, deverá realizar alguma forma de **autenticação**. Isso vai garantir que caso o Império nos descubra, não seja possível o envio de informações falsas para nos despistar.

Com isso em mente, precisamos que você desenvolva uma **aplicação no formato de API** (mesmo em uma galaxia muito distante, ainda é usado **REST**) que permita a autenticação do grupo Rogue One para que possa nos enviar as informações que julgamos necessárias.
 
#### Feature I
Logo a feature inicial de nossa aplicação é bastante simples: **LOGIN**
Para isso você criará um recurso que deve autenticar em uma **base de dados** as informações recebidas de uma requisição HTTP:

``` 
{
	"login":"",
	"senha":""
}
```

Preocupe-se com segurança, sessão e criptografia. Entretanto, elabore uma forma eficiente que ofereça alguma facilidade de utilização para nosso grupo de rebeldes que podem estar correndo perigo. Pode não ser uma boa ideia exigir login e senha para cada arquivo a ser recebido deles, então ao realizar o login com sucesso, nosso esquadrão poderá receber um token autenticado para as próximas comunicações que ocorrerão em seguida.

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

#### Feature II
Em seguida, você deve preparar o recebimento do modelo (`DeathPlans`) que está dentro dos projetos de referência. 
Não se esqueça de validar o token que deve ser informado no recebimento das informações. Por fim, você deve receber esses dados, valida-los, persisti-los em nossa base de dados e garantir que a transmissão está completa e integra.

#### Feature III
Não é de extrema importância, e isso vai além de sua missão principal que ja foi descrita, mas caso queira ir além e demonstrar todo seu potencial Jedi, desenvolva também alguma forma de transmitir ordens para nosso esquadrão. Ou seja, será preciso disponibilizar algum recurso que ao ser acessado irá retornar informações em nossa base de dados para o esquadrão.

### O quê esperamos 

A solução para esse problema pode ser oferecida em algumas linguagens como:
* Java 
* Scala
* Groovy
* Kotlin
* Go
* Node.js

Estamos disponibilizando modelos em 2 linguagens (Java e Go), mas sinta-se a vontade para resolver nas outras da lista acima.

Esse é um teste focado em design de código, conhecimento de orientação a objeto (ou funcional, caso assim você opte) e qualidade no geral da solução proposta. O objetivo é avaliar sua experiênica em escrever código de fácil manutenção, baixo acoplamento, e alta coesão.

Isoladamente são features simples de implementar, mas queremos que você leve em conta a evolução futura do software. Imagine que a solução irá crescer em  features, e ser adicionada no futuro, então escolha muito bem suas ferramentas. Você deve pensar num design de código que suporte esses casos de uso sem  grandes modificações.

Existem algumas pegadinhas, então tente corrigi-las ou simplesmente apaga-lás caso queira.

### Avaliação

Para nos enviar seu código, você pode:
* Fazer um fork desse repositório e nos mandar uma pull-request
* Dar acesso ao seu repositório *privado* no [Github](http://github.com) para `kesselchallenge`.
* Enviar um `git bundle` do seu repositório para o e-mail selecao@astarlabs.com.br e/ou jc@astarlabs.com
