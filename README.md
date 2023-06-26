# Bem vindo ao jogo: Combate! :video_game:

Esse game foi desenvolvido com nosso querido java :coffee:.

### Instruções:

Cada player representará um campeão, que são os personagens do jogo.

Cade campeão possui os seguintes atributos que serão digitados por seus respectivos players: 

- **Nome**
- Quantidade de **ataques**
- Quantidade de **armadura**
- Quantidade de **vida**

A idéia é, baseada em uma quantidade de turnos informada pelo usuário, um campeão atacar o outro.

De acordo com sua quantidade de armaduras e vidas, cada campeão receberá retornara um status com a quantidade de vida, que será implementada para o proximo turno e assim sucessivamente...

Regras:

:pushpin: A quantidade de vida de um campeão (player_1) será descrecida da quantidade de vida do outro campeão (player_2), descontando a quantidade de armadura do player_1;

:pushpin:Independente da quantidade de armadura do player_1, pelo menos uma vida ele deverá perder;

:pushpin: Se algum dos campeões zerar a vida, independente da quantidade de tiurnos restantes, o jogo para e é transmitida a mensagem: "Fim de combate!".


 Cada campeão será instanciado a partir da classe abaixo: 

 ![Champion_class](https://github.com/Lucimararocha872/combat_game/assets/96544129/d82c00a2-0462-41b5-8219-e0c87ec3d314)


 O mecanismo de receber dano funcionará atraves do método takeDamage, o qual fará com que um campeão receba dando do outro conforme as regras citadas.

### OBS: 
 No desenvolvimento, utilizamos o encapsulamento dos atributos da classe de cada campeão. 

______________________________________________________________________________________________

  #### Demo1

Digite os dados do primeiro campeão:


Nome: **Ashe**

Vida inicial: **50**

Ataque: **8**

Armadura: **1**

Digite os dados do segundo campeão:


Nome: **Nekko**

Vida inicial: **40**

Ataque: **10**

Armadura: **2**

Quantos turnos você deseja executar? **2**


Resultado do turno 1:


Darius: 41 de vida.

Fiora: 34 de vida.


Resultado do turno 2:

Darius: 32 de vida.

Fiora: 28 de vida.

Fim de Combate!

______________________________________________________________________________________________

  #### Demo2

Digite os dados do primeiro campeão:

Nome: **Ashe**

Vida inicial: **50**

Ataque: **8**

Armadura: **1**

Digite os dados do segundo campeão:

Nome: **Nekko**

Vida inicial: **40**

Ataque: **30**

Armadura: **10*

Quantos turnos você deseja executar? **4**

Resultado do turno 1:

Darius: 21 de vida.

Fiora: 39 de vida.

Resultado do turno 2:

Darius: 0 de vida (morreu).

Fiora: 38 de vida.

Fim de combate!

Para testar o programa:

Clone o repositório ou extraia os arquivos e posteriormente abra o projeto em uma IDE (eu utilizei o eclipse para desenvolver), compile o projeto e chame um amigo (ou inimigo, rs) para o combate!  :muscle:
