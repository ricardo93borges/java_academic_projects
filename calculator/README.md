A solução desenvolvida consiste em ler o arquivo das expressões e processar cada linha contendo uma expressão, primeiro é verificado
a validade da mesma comparando a quantidade de parenteses abertos e fechados, se as quantidades são diferentes a expressão é definida
como inválida, caso contrário é realizada uma iteração a partir do início (esquerda) da expressão, cada caractere é avaliado inserindo
somente operadores e operandos em uma pilha, se o caratere for uma parenteses fechando (")") é retirado da pilha 3 elementos:
2 operandos e um operador e efetuado o calculo deles, o resultado é armazenado na pilha, quando a pilha é manipulada é atualizado uma
variável que armazena o tamanho máximo atingido da pilha. Este processo é repetido até não restar mais caracteres na expressão.O
resultado de cada expressão é exibido e armazenado em um arquivo.

Fluxo:

Na classe Main é definido o caminho dos arquivos de input e output; Instanciado a classe Calculator e chamado o método validateExpression().

No metodo validateExpression() da classe Calculator é lido o arquivo de expressões, verificada a validade delas se válida a expressão é
enviada com parametro para o metodo calculateExpression().

No metodo calculateExpression() é avalida cada caractere da expressão inserindo apenas operadores e operandos em um pilha, se o caractere
for um parenteses fechando (")") é retirado 3 elementos da pilha, 2 operandos e 1 operador, e efetuado o calculo deles no metodo
calculate() que verifica qual é o operador para efetuar o calculo adequado, o resultado é armazenado na pilha, quando não restar
mais caracteres é retornado o resultado final.

O tamanho máximo atingido pela pilha é controlado pelo metodo setStackSize() chamado sempre que a pilha é manipulada.

Recebendo o resultado final o metodo validateExpression() exibe e salva em um arquivo (resultados.txt).

Classes:

Main: Classe principal, o programa é executado a partir dela.

FileHandler: Manipula arquivos (ler e escrever).

LinkedListOfString: Represesnta a estrutura de dados lista encadeada de strings.

Stack: Represesnta a estrutura de dados pilha utilizando a LinkedListOfString.

Calculator: Valida e calcula as expressões.

Resultado:

( ( 5 + 12 ) + ( ( 10 - 8 ) + 2 ) )
Resultado: 21.0
Tamanho máximo da pilha:  5
( ( 2 + 3 ) * ( 3 / ( 1 - 3 ) ) )
Resultado: -7.5
Tamanho máximo da pilha:  8
( ( ( 5657 - 6739 ) + ( 3 ^ 5 ) ) + ( ( ( 78 - 43 ) + ( ( 34 * 4 ) + ( 180 - 94 ) ) + ( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( ( 3452 - 2133 ) + ( ( ( ( 67 * 89 ) - 5343 ) - ( 4 ^ 4 ) ) + ( ( 678 - 345 ) * ( 21 * 21 ) ) ) ) - ( ( ( 4545 - 2913 ) / ( 5 ^ 5 ) ) - ( ( 2 ^ 8 ) - ( 1234 - 9876 ) ) ) ) ) ) )
Resultado: Expressão inválida
Tamanho máximo da pilha:  8
( ( ( ( 58 + 33 ) - ( ( 108 - 79 ) + 2 ) ) * ( 9 ^ 3 ) ) + ( ( 5 + 12 ) + ( ( 10 - 8 ) + 2 ) ) )
Resultado: 43761.0
Tamanho máximo da pilha:  9
( ( ( ( 2345 + 5890 ) + ( ( 624 / 4 ) - 21 ) ) * ( 546 - 601 ) ) + ( ( 90 * 3 ) + ( 14 - 6 ) ) )
Resultado: -460072.0
Tamanho máximo da pilha:  10
( ( ( ( 87 * 32 ) / ( 3 ^ 4 ) ) - ( ( 700 - 699 ) + ( 4549 - 7958 ) ) ) + ( ( ( 320 * 67 ) / ( 2 ^ 6 ) ) + ( ( 55 + 67 ) - ( 103 - 94 ) ) ) )
Resultado: 3890.3703703703704
Tamanho máximo da pilha:  13
( ( ( 34 + 33 ) * ( 5 * 6 ) ) + ( ( ( 4545 + 2913 ) / ( 5 * 11 ) ) + ( ( 45 - 697 ) - ( 8292 - 3457 ) ) ) ) )
Resultado: Expressão inválida
Tamanho máximo da pilha:  13
( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( ( 3452 - 2133 ) + ( ( ( ( 67 * 89 ) - 5343 ) - ( 4 ^ 4 ) ) + ( ( 678 - 345 ) * ( 21 * 21 ) ) ) ) - ( ( ( 4545 - 2913 ) / ( 5 ^ 5 ) ) - ( ( ( 2 ^ 8 ) + ( 44 * 33 ) ) - ( 1234 - 9876 ) ) ) ) )
Resultado: 162946.47776
Tamanho máximo da pilha:  16
( ( ( 5657 - 6739 ) + ( 3 ^ 5 ) ) + ( ( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( 34 * 4 ) + ( 180 - 94 ) ) ) + ( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( ( 3452 - 2133 ) + ( ( ( ( 67 * 89 ) - 5343 ) - ( 4 ^ 4 ) ) + ( ( 678 - 345 ) * ( 21 * 21 ) ) ) ) - ( ( ( 4545 - 2913 ) / ( 5 ^ 5 ) ) - ( ( ( 2 ^ 8 ) + ( 44 * 33 ) ) - ( 1234 - 9876 ) ) ) ) ) ) )
Resultado: 166390.47776
Tamanho máximo da pilha:  21
( ( ( 4 + 5 ) / 3 ) + ( ( ( 5657 - 6739 ) + ( 3 ^ 5 ) ) + ( ( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( 34 * 4 ) + ( 180 - 94 ) ) ) + ( ( ( 8 ^ 4 ) - ( 78 - 43 ) ) + ( ( ( 3452 - 2133 ) + ( ( ( ( 67 * 89 ) - 5343 ) - ( 4 ^ 4 ) ) + ( ( 678 - 345 ) * ( 21 * 21 ) ) ) ) - ( ( ( 4545 - 2913 ) / ( 5 ^ 5 ) ) - ( ( ( 2 ^ 8 ) + ( 44 * 33 ) ) - ( 1234 - 9876 ) ) ) ) ) ) ) )
Resultado: 166393.47776
Tamanho máximo da pilha:  24

