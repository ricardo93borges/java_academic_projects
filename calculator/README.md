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
