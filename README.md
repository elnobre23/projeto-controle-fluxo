# Funcionalidade do Código Java - Contador

O código Java fornecido, denominado "Contador," tem a finalidade de contar e imprimir uma sequência de números com base em dois parâmetros de entrada fornecidos pelo usuário. Abaixo, descrevemos em detalhes a funcionalidade do código:

## Entrada de Parâmetros

O programa começa solicitando ao usuário que insira dois valores inteiros:

1. O primeiro valor, armazenado na variável `parametroUm`, representa o ponto de partida para a contagem.
2. O segundo valor, armazenado na variável `parametroDois`, determina o ponto de término para a contagem.

## Validação de Parâmetros

Após a entrada dos parâmetros, o código realiza uma validação para garantir que o `parametroDois` seja maior ou igual ao `parametroUm`. Isso é feito na função `contar`:

```java
static String contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException();
    }
    return null; // Retorno não é relevante
}
```

Caso o `parametroUm` seja maior que o `parametroDois`, uma exceção personalizada, `ParametrosInvalidosException`, é lançada. Isso indica que os parâmetros fornecidos são inválidos.

## Contagem e Impressão

Se a validação de parâmetros for bem-sucedida, o código calcula o número de iterações com base na diferença entre `parametroDois` e `parametroUm` e, em seguida, inicia um loop `for` para imprimir uma sequência de números crescente:

```java
int indice = parametroDois - parametroUm;
for (int i = 0; i < indice; i++) {
    System.out.println("Imprimindo o número " + (i + 1));
}
```

O programa imprimirá números de `parametroUm + 1` até `parametroDois`, onde o número atual é exibido em cada iteração.

## Exceção para Parâmetros Inválidos

Se a validação dos parâmetros falhar e a exceção `ParametrosInvalidosException` for lançada, o código capturará essa exceção e exibirá uma mensagem de erro:

```java
catch (ParametrosInvalidosException exception) {
    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
}
```

Essa mensagem informa ao usuário que o segundo parâmetro deve ser maior que o primeiro para que a contagem seja realizada com sucesso.

O código, como escrito, fornece uma funcionalidade básica para contar e imprimir números dentro dos limites especificados pelos parâmetros fornecidos pelo usuário.
