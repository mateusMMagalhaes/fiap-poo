# Projeto FiapRide - [Mateus Francisco Comim Magalhaes]

## Informações do Aluno

- **Nome:** [Mateus Francisco Comim Magalhaes]
- **RM:** [562119]
- **Turma:** [CCPX]
- **Curso:** [Ciencia Da computacao]
- **GitHub:** [@mateusMMagalhaes]

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Progra
mação Orientada a Objetos, onde desenvolvemos o sistema **FiapRid
e** (aplicativo de mobilidade urbana).


 ---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe
`Passageiro`? Não seria mais fácil apenas criar variáveis soltas
no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0
`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Cla
sse ajuda a resolver isso?"


**Sua Resposta:**
[ECriar uma classe como Passageiro é essencial para organizar o código e permitir escalabilidade. Usar variáveis soltas funciona para poucos dados, mas em um sistema com milhares ou milhões de usuários isso se torna inviável. A classe permite agrupar informações e comportamentos, facilitando manutenção, reutilização e organização do sistema.]

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.sald
o = passageiro.saldo \+ 100` diretamente no código principal, por
que dá tanto trabalho criar um método específico chamado `adicion
arSaldo\(valor\)` para fazer isso? Quais seriam os riscos para a
nossa startup de mobilidade se deixássemos qualquer programador a
lterar o saldo diretamente?"


**Sua Resposta:**
[Criar um método como adicionarSaldo() garante que o saldo seja alterado de forma controlada e segura. Se qualquer parte do código pudesse modificar diretamente o saldo, poderiam ocorrer erros ou até fraudes, como valores negativos ou alterações indevidas. O método centraliza regras de negócio e protege o sistema.]

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas o
s métodos `getSaldo\(\)` e `getNome\(\)` são `public`. Por que é
seguro deixar o `get` público, mas perigoso deixar o atributo ori
ginal público?


Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um do
cumento seu, e entregar o documento ORIGINAL para a pessoa rasura
r? "


**Sua Resposta:**
[O encapsulamento protege os dados internos da classe. Deixar os atributos como private impede alterações diretas, enquanto os métodos get permitem acesso controlado apenas para leitura. Isso evita que o sistema seja modificado de forma incorreta e mantém a integridade dos dados.]

---

### Aula 4 - Construtores

**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas dec
isões arquitetônicas muito importantes:

>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um m
étodo público chamado `atualizarPlaca\(\)` para acessá-lo.

>
> Pensando no mundo real e no Clean Code: Por que é um erro graví
ssimo clicar em 'Gerar Getters e Setters para tudo' automaticamen
te na sua IDE? Como as nossas duas decisões acima protegem o sist
ema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carr
o, e a diferença entre "alterar um dado no banco" e "executar um
processo real no Detran"_"


**Sua Resposta:**
[Gerar getters e setters para tudo é perigoso porque expõe demais os dados e permite mudanças indevidas. No caso do veículo, o modelo não deve mudar e a placa precisa de um processo controlado. Criar métodos específicos garante que alterações sigam regras reais, evitando fraudes e inconsistências.]

---

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto
inteiro \(`Passageiro solicitante`\). Se o nosso resumo só precis
a imprimir o nome da pessoa, não seria mais fácil e mais leve ped
ir apenas a String do nome no construtor da Viagem \(`String nome
DoPassageiro`\) em vez do objeto todo?"


_Pense nas regras de negócio: O que acontece na hora que a Viagem
acaba e o sistema precisa descontar o saldo? Se a Viagem tiver ap
enas a String "Ana Silva", ela consegue mexer no dinheiro dela?
_"

8**Sua Resposta:**
[Usar o objeto completo Passageiro permite acessar todos os seus dados e comportamentos. Se fosse apenas uma String com o nome, não seria possível, por exemplo, descontar o saldo ao final da viagem. A associação entre objetos permite executar corretamente as regras de negócio.]

---

### Aula 6 - Herança
**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atribu
tos `placa` e `modelo` como `private`. Quando o `Carro` herda de
`Veiculo`, ele recebe esses atributos, mas o código dentro de `Ca
rro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a us
ar o `super\(\)` ou o `setPlaca\(\)`.


Por que o Java não deixa a filha alterar as variáveis privadas da
mãe diretamente? Qual o princípio das aulas passadas que isso est
á protegendo?""


**Sua Resposta:**
[O Java impede que a classe filha acesse diretamente atributos privados da mãe para proteger o encapsulamento. Isso garante que os dados só sejam modificados de forma segura, mantendo o controle e evitando alterações indevidas no sistema.]

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a
variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos
de criar o método `calcularAutonomia\(\)` lá na classe mãe `Veicu
lo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo qu
e ele existe dentro do `Carro` e da `Moto`? Por que o contrato pr
ecisa existir na base da hierarquia?"


**Sua Resposta:**
[Sem o método definido na classe base, não seria possível chamá-lo usando uma variável genérica. O contrato precisa existir na classe mãe para garantir que todas as subclasses implementem esse comportamento, permitindo o uso correto do polimorfismo.]

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto
que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou
em uma concessionária e comprou "um veículo" genérico, sem ser ca
rro, moto, caminhão ou nada disso?
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Jav
a que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?
Pense: Se esquecermos de colocar `abstract`, qual o risco que cor
remos? Alguém pode criar `new Veiculo\(\)` e quebrar a lógica do
nosso sistema?"


**Sua Resposta:**
[No mundo real não existe um “veículo genérico”, por isso a classe deve ser abstrata. Declarar como abstract impede a criação de objetos sem sentido. Se isso não for feito, alguém poderia instanciar a classe diretamente e quebrar a lógica do sistema.]

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples \(apenas uma
mãe\), mas múltipla implementação de interfaces \(vários contrato
s\)?
Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bater
ia` ao mesmo tempo \(herança múltipla\), o que aconteceria se AMB
AS as mães tivessem um método chamado `ligar\(\)`?


Como as interfaces resolvem esse problema? "

**Sua Resposta:**
[O Java permite apenas herança simples para evitar conflitos entre métodos. Se uma classe herdasse de duas ao mesmo tempo, poderia haver ambiguidade. As interfaces resolvem isso criando contratos sem implementação, permitindo múltiplas funcionalidades sem conflitos.]

---


## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?*
*
[Mochilas.]

**Quais classes você criou?**
[Mochilas, MochilasDeCostas, MochilaDeRodinha e Estojo]

**Qual foi o maior desafio técnico que você enfrentou?**
[Imaginar e desenhar oque cada classe e objeto iria ter, fazer, e implementar.]

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
[Eu aprendi a traduzir regras e entender como criar sistemas de maneira melhor, alem de conhecer mais profundamente o java]

**Qual conceito foi mais difícil de entender?**
[o Override me deu uma certa dificuldade no começo fora isso sem pensar um programaçao direta a minha maior dificuldade foi traduzir as regras conceitos e objetos para o digital]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Mudaria a escolha do primeiro obeto para algo que conecta melhor com o mundo online.]
