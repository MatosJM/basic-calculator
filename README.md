# Basic-calculator
Basic-calculator é um projeto implementado na disciplina Sistemas Distribuídos.
Trata-se de uma calculadora que utiliza Socket, onde é possível realizar as quatro operações básicas: soma, subtração, multiplicação e divisão. 

##  Instruções de Uso
1. Baixar o projeto
2. Abrir o projeto em uma IDE
3. Acessar os arquivos \*.java do diretório *./src*
4. Execultar o servidor **CalculatorBasicServer.java** e em seguida o cliente **CalculatorClient.java**.

## Layout
A calculadora oferece um layout basico via terminal para execução das expressões.

~~~
==========CALCULADORA==============
Expressão: 
~~~

Após a expressão ser digitada e a tecla ENTER ser precionada, o resultado  é disponibilizado na tela.
~~~
==========CALCULADORA==============
Expressão: 10+20
Resultado: 30
~~~

O campo *Expressão* permite qualquer operação dentre as quatro básicas (soma, subtração, multiplicação, divisão).

## Entradas permitidas

| Tipo | Descrição |Restrição |
| :---         |     :---:    | :---: |
| Números      |  Integer, Float ou Double.   | Para Floats e Double, o separador decimal deve ser o ponto. Ex.: 20.5, 10.87, 10587.12    |
| Operadores   |  + - * /     |     |
| Palavra      |  *sair*      |       |


O campo *Expressão* permite operações simples e compostas:
* Operações simples. Exemplos:
  * Soma
    ~~~
    Ex.: 10 + 20
    ~~~
  * Subtração
    ~~~
    Ex.: 10 - 20
    ~~~
  * Multiplicação
    ~~~
    Ex.: 10 * 20
    ~~~
  * Divisão
    ~~~
    Ex.: 10 / 20
    ~~~
  
* Operações compostas. Exemplos:
    ~~~
    Ex.: 10+20*(2-5)/(4*8+2)
    ~~~
