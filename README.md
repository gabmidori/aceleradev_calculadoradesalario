# Desafio Aceleradev - módulo 1
## Calculadora de Salário Líquido

No Brasil, as pessoas que trabalham "com carteira assinada" (CLT) têm uma parte do seu *salário bruto (isto é, o salário integral, sem descontos)* retida pela empresa empregadora para o pagamento de alguns tributos, como, por exemplo, a Previdência Social (INSS) e o Imposto de Renda Retido na Fonte (IRRF). Após esse desconto, o valor que a pessoa contratada recebe é denominado **salário líquido**.

Neste desafio foi implementado um algoritmo que deve receber como parâmetro o salário bruto e retornar o salário líquido, já com todos os descontos de INSS e IRRF. Como requisito do desafio o valor foi arredondado.

## INSS 
Calculado o valor do desconto do INSS conforme a tabela abaixo:

| Faixa salarial                  |  Percentual de desconto  |
|  Até R$ 1.500,00                | 8%                       |
|  De R$ 1.500,01 até R$ 4.000,00 | 9%                       |
|  Acima de R$ 4.000,00           | 11%                      |

### IRRF

Utilizado o valor obtido de **salário bruto - INSS**, após do desconto do INSS para o cálculo do imposto de renda. Foram usados os valores da tabela apresentada.

| Faixa salarial                  |  Percentual de desconto  |
|  Até R$ 3.000,00                | ISENTO                   |
|  De R$ 3.000,01 até R$ 6.000,00 | 7.5%                     |
|  Acima de R$ 6.000,00           |  15%                     |

**Observações**
- Caso o valor do salário base recebido seja abaixo do salário mínimo **(R$ 1.039,00)**, o algoritmo deve retornar **0.0**.
- Os valores apresentados nas tabelas são fictícios.

## Tópicos
- Variáveis e métodos;
- Operadores aritméticos;
- Operadores lógicos;
- Controle de fluxo (estrutura condicional).
