# Debugging em Java: Entendendo Chamadas de Métodos

Este projeto tem como objetivo demonstrar o funcionamento do processo de depuração (debugging) em Java, utilizando um exemplo simples de chamadas de métodos. Durante o debug, você pode visualizar o fluxo de execução do código e entender como os métodos são chamados em sequência. Vamos analisar o código presente no arquivo `debbugin.java`.

## Estrutura do Código

O código define uma classe `debbugin` com quatro métodos:

- **main**: O ponto de entrada da aplicação, que inicia o programa e faz chamadas para os métodos subsequentes.
- **a**: Método chamado pelo `main`, que chama o método `b`.
- **b**: Método chamado pelo método `a`, que por sua vez chama o método `c`.
- **c**: O método final na cadeia de chamadas, executa uma ação e finaliza.

## Explicação das Chamadas de Métodos

No contexto de programação orientada a objetos em Java, utilizamos o termo **método** (e não função) para designar uma operação associada a uma classe ou objeto. No código acima, todos os métodos (`a()`, `b()`, `c()`) são chamados de maneira recursiva, mas sem loops ou chamadas infinitas.

- **Tipo de chamada**: Todas as chamadas feitas no código são chamadas síncronas. Isso significa que, ao chamar um método, o controle do fluxo de execução é passado para esse método e ele é executado completamente antes que o programa retorne ao ponto onde a chamada foi feita. Por exemplo, ao chamar `a()` no método `main()`, o fluxo de execução passa para `a()`, e só retorna ao `main()` após `a()` ter terminado sua execução.

## Fluxo de Execução

Ao iniciar o programa no método `main`, a execução segue a seguinte ordem:

1. O programa imprime a mensagem: **"Iniciando programa no método main"**.
2. O método `a()` é chamado.
3. O programa imprime: **"Entrou no método a"**.
4. Dentro de `a()`, o método `b()` é chamado.
5. O programa imprime: **"Entrou no método b"**.
6. Dentro de `b()`, o método `c()` é chamado.
7. O programa imprime: **"Entrou no método c"**.
8. O método `c()` finaliza, e o programa imprime: **"Finalizou o método c"**.
9. Após a execução de `c()`, o método `b()` finaliza, e o programa imprime: **"Finalizou o método b"**.
10. Após a execução de `b()`, o método `a()` finaliza, e o programa imprime: **"Finalizou o método a"**.
11. O programa retorna ao método `main`, onde é impresso: **"Final do programa no método main"**.

## Debugging em Java

O debugging é o processo de execução do programa linha por linha, permitindo que você visualize o comportamento do código em tempo real. Ao utilizar um depurador em uma IDE (como Eclipse, IntelliJ ou VS Code), você pode:

- **Colocar pontos de interrupção (breakpoints)**: Esses são marcadores que você define em linhas específicas de código. Quando o programa é executado no modo debug, ele pausa a execução ao atingir esses pontos, permitindo que você inspecione o estado das variáveis e o fluxo de execução.

### Passo a Passo (Step Over, Step Into, Step Out):

- **Step Over**: Executa a próxima linha de código, mas, se houver uma chamada de método, não entra no método. Ele "passa por cima" da chamada e vai para a próxima linha.
- **Step Into**: Entra no método chamado, permitindo que você acompanhe a execução dentro dele.
- **Step Out**: Sai do método atual e volta para o ponto onde o método foi chamado.

## Ferramenta `Thread.dumpStack()`

No seu código, a linha `Thread.dumpStack();` está comentada. Caso ativada, essa função imprime o rastreamento da pilha de execução (*stack trace*), mostrando todas as chamadas de métodos que estão sendo empilhadas. Isso é útil para visualizar a sequência de chamadas de métodos em qualquer ponto do programa.

## Utilizando o Debugger

- **Definindo Breakpoints**: Coloque um breakpoint no método `a()` e execute o código em modo debug. Quando a execução parar no breakpoint, você poderá ver o fluxo do programa e examinar as variáveis locais.
- **Visualizando o Fluxo**: Use as opções de "Step Into" para acompanhar a chamada de `b()` e depois `c()`, entendendo como o fluxo de controle se move de um método para outro.
- **Inspecionando a Pilha de Execução**: Em cada breakpoint, você pode visualizar a pilha de execução na IDE, que mostra quais métodos foram chamados até aquele ponto.
