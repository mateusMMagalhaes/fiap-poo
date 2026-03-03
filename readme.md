# 📚 Classe `Mochila`

A classe `Mochila` representa uma mochila simples, contendo características básicas como cor, capacidade em litros e o estado do zíper (aberta ou fechada).

Ela permite controlar a abertura e o fechamento da mochila, além de verificar se é possível guardar itens dentro dela.

---

## 📦 Atributos

### `cor : String`

Representa a cor da mochila.
É definida no momento da criação do objeto através do construtor.

Exemplo:

```java
Mochila mochila = new Mochila("Preta", 20);
```

---

### `tamanhoLitros : int`

Indica a capacidade da mochila em litros.
Também é definido no construtor e representa o volume máximo que a mochila pode comportar.

Exemplo:

```java
Mochila mochila = new Mochila("Azul", 30);
```

---

### `ziper : boolean`

Representa o estado da mochila:

* `true` → Mochila aberta
* `false` → Mochila fechada

Por padrão, toda mochila é criada com o zíper fechado (`false`).

---

## 🛠️ Construtor

### `Mochila(String cor, int tamanhoLitros)`

O construtor é responsável por inicializar os atributos principais da mochila:

* Define a **cor**
* Define o **tamanho em litros**
* Inicializa o **zíper como fechado**

Exemplo:

```java
Mochila mochila = new Mochila("Vermelha", 25);
```

---

## 🔓 Métodos

### `abrir() : void`

Responsável por abrir a mochila.

✔ Se a mochila já estiver aberta, exibe a mensagem:

```
A mochila ja esta aberta!
```

✔ Caso esteja fechada, altera o estado do zíper para `true` e exibe:

```
A mochila foi aberta!
```

---

### `fechar() : void`

Responsável por fechar a mochila.

✔ Se a mochila estiver aberta, altera o estado do zíper para `false` e exibe:

```
A mochila foi fechada!
```

✔ Caso já esteja fechada, exibe:

```
A mochila ja esta fechada!
```

⚠️ Observação: No código enviado há um pequeno erro de sintaxe:

```java
return:
```

O correto é:

```java
return;
```

---

### `podeGuardar() : void`

Verifica se é possível guardar algo dentro da mochila.

✔ Se a mochila estiver aberta (`ziper == true`), exibe:

```
Pode guardar mochila Aberta!
```

❌ Caso esteja fechada, exibe:

```
Por favor abra a mochila para guardar algo!
```

---

## 💡 Funcionamento Geral

1. Ao criar uma mochila, ela começa **fechada**.
2. Para guardar algo, é necessário **abrir primeiro**.
3. Após utilizar, recomenda-se **fechar a mochila**.

---

## 🚀 Exemplo de Uso

```java
Mochila mochila = new Mochila("Preta", 20);

mochila.podeGuardar(); // Precisa abrir
mochila.abrir();
mochila.podeGuardar(); // Agora pode guardar
mochila.fechar();
```