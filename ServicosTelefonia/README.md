Aqui está a explicação e o texto formatado em Markdown para o desafio "VerificacaoServicoEncontrado":

---

# Desafio 1: VerificacaoServicoContratado

Este desafio envolve verificar se um cliente específico contratou um serviço de telecomunicações, como telefonia móvel, fixa, banda larga ou TV por assinatura. Abaixo estão os detalhes do problema, formatados em Markdown.

---

## Descrição

Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel, telefonia fixa, banda larga e TV por assinatura. Para facilitar o atendimento ao cliente, é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço. Por exemplo, quando um cliente liga para a central de atendimento e menciona um serviço, o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.

## Entrada

A entrada deve receber duas linhas:

- A primeira linha contém o nome do serviço a ser verificado (por exemplo, `"movel"`, `"fixa"`, `"banda larga"`, `"tv"`).
- A segunda linha contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, `"Alice,movel,fixa"`).

## Saída

O programa deverá retornar:

- `"Sim"` se o cliente contratou o serviço.
- `"Nao"` caso contrário.

## Exemplos

| Entrada               | Saída |
|-----------------------|-------|
| movel                 | Sim   |
| Alice,movel,fixa      |       |
| fixa                  | Nao   |
| Bob,movel,tv          |       |
| tv                    | Sim   |
| Carol,movel,fixa,tv   |       |

---

# Desafio 2: VerificacaoServicoContratadoCombo

## Descrição
Implemente um sistema que verifique se um cliente de uma empresa de telecomunicações contratou um **combo completo de serviços**. Um combo completo inclui os três serviços principais oferecidos pela empresa: telefonia móvel, banda larga e TV por assinatura. O sistema deve ler uma lista de serviços contratados pelo cliente e determinar se todos os serviços necessários estão incluídos. Caso todos os três serviços estejam presentes, o sistema deve retornar `"Combo Completo"`. Se faltar qualquer um dos serviços, o sistema deve retornar `"Combo Incompleto"`.

## Entrada
A entrada consiste em uma string contendo uma lista de serviços contratados pelo cliente, separados por vírgula. Os serviços possíveis são:
- `"movel"` para telefonia móvel,
- `"banda larga"` para serviços de internet,
- `"tv"` para TV por assinatura.

## Saída
A saída do programa deve ser uma única linha contendo:
- `"Combo Completo"` se o cliente contratou todos os três serviços.
- `"Combo Incompleto"` caso contrário.

## Exemplos

| Entrada                    | Saída             |
|----------------------------|-------------------|
| movel,banda larga,tv        | Combo Completo    |
| movel,tv                    | Combo Incompleto  |
| banda larga,tv,movel        | Combo Completo    |

Certifique-se de testar seu programa com esses exemplos e outros casos possíveis.
