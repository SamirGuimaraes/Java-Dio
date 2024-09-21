# Desafio Bootcamp DIO: Sistema de Processo Seletivo

## Descrição

Este projeto faz parte de um desafio do bootcamp da Digital Innovation One (DIO). O objetivo é implementar um sistema simples de processo seletivo, que insere candidatos e seus salários pretendidos, e os classifica em três categorias: **Selecionados**, **Nova Análise** e **Eliminados**.

O critério de classificação é baseado no salário pretendido em relação a um salário base fixo de R$ 2000,00.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Inserção de Candidatos**: O sistema solicita que o usuário insira o nome e o salário pretendido de cinco candidatos.
- **Classificação por Salário**: Baseado no salário pretendido, os candidatos são classificados em:
  - **Selecionados**: Candidatos que solicitaram menos que R$ 2000,00.
  - **Nova Análise**: Candidatos que solicitaram exatamente R$ 2000,00.
  - **Eliminados**: Candidatos que solicitaram mais que R$ 2000,00.
- **Exibição de Resultados**: Após a classificação, os resultados são exibidos, com a lista de candidatos classificados em cada categoria e seus respectivos salários.

## Entrada de Dados

O sistema solicita ao usuário a entrada de 5 candidatos, coletando as seguintes informações para cada um:

1. Nome do candidato
2. Salário pretendido

## Saída de Dados

O programa imprime três listas de candidatos com seus respectivos salários, conforme a classificação:

1. **Selecionados**: Candidatos que pediram menos que o salário base.
2. **Nova Análise**: Candidatos que pediram exatamente o salário base.
3. **Eliminados**: Candidatos que pediram mais que o salário base.

## Estrutura do Código

- **insercaoCandidatos()**: Coleta os dados dos candidatos (nome e salário pretendido) através da entrada do usuário.
- **classificarCandidatosPorSalario()**: Compara o salário pretendido dos candidatos com o salário base e os classifica em três categorias: Selecionados, Nova Análise, e Eliminados.
- **resultadoEntrevista()**: Exibe os resultados da classificação, imprimindo os candidatos e seus respectivos salários em cada categoria.

## Exemplo de Uso

### Entrada
#### Candidato 1º informe seu nome: Alice
#### Informe o salário pretendido: 1800.0

#### Candidato 2º informe seu nome: Bob
#### Informe o salário pretendido: 2000.0

#### Candidato 3º informe seu nome: Carol
#### Informe o salário pretendido: 2500.0

#### Candidato 4º informe seu nome: Dave
#### Informe o salário pretendido: 1500.0

#### Candidato 5º informe seu nome: Eve
#### Informe o salário pretendido: 3000.0

### Saída 

#### Candidatos selecionados

##### Candidato 1: Alice 
##### Salário: R$ 1800.0

##### Candidato 4: Dave 
##### Salário: R$ 1500.0


#### Candidatos destinados a nova análise
##### Candidato 2: Bob 
#####   Salário: R$ 2000.0

#### Candidatos eliminados
##### Candidato 3: Carol 
##### Salário: R$ 2500.0
##### Candidato 5: Eve 
##### Salário: R$ 3000.0
