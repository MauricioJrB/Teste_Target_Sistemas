#include <stdio.h>

int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int pertence(int num) {
    int i = 0;
    for (i = 0; i < num; i++) {
        if (fibonacci(i) == num) {
            return 1;
        }
    }
    return 0;
}
int main() {
    int n, i;

    printf("Digite o numero de termos da sequencia de Fibonacci: ");
    scanf("%d", &n);

    printf("\nSequencia de Fibonacci com %d termos:\n", n);
    for (i = 0; i < n; i++) {
        printf("%d ", fibonacci(i));
    }

    printf("\n");

    if (pertence(n)) {
        printf("\nO numero %d e um elemento da sequencia de Fibonacci.", n);
    }
    else {
        printf("\nO numero %d nao e um elemento da sequencia de Fibonacci.", n);
    }

    printf("\n");

    return 0;
}
