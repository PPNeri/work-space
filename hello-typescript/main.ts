/*
Problema:Devolver os códigos com as devidas explicações, em comentários, sobre o funcionamento dos métodos, necessidade de imports, aplicações das funcionalidades, 
quando um arquivo componente se comunica com um template e vice-versa, etc.

Sol: Comentar principais metodos do codigo

Nome Pedro Neri e Vinicius Ramos

Data 16/12/2019
*/



//TypeScript é um super conjunto tipado do JavaScript que compila para JavaScript puro”. 

//Declaração de uma  variavel - TypeScript tipagem estática
// A tipagem do JavaScript é dinâmica e ocorre em tempo de execução.
const minhaVar = 'minha variavel';


//função que soma dois valores.Passando dois parametros.
function minhaFunc(x, y) {
    return x + y;
}

//es6 ou ecmascript
/*
 JavaScript (ECMAScript 2015 ou ES6), já é possível utilizar  objetos utilizando classes e extensões.
 Entretanto, esse recurso não é suportado em browsers mais antigos, sendo necessária a utilização de algum transpilador de Javascript para uma especificação mais antiga.
O TypeScript já faz essa tradução para uma versão que browsers mais antigos entendam de forma automática. Além do mais, é possível utilizar modificadores de acesso public, 
private e protected nos atributos e métodos da classe, conforme o exemplo a seguir:

*/

let num = 2;
const PI = 3.14;

var numeros = [1, 2, 3];

//javascript

/*Você precisa compilar da linguagem fonte para o JavaScript 
    que é a linguagem alvo, sem isso não há como executar.*/

numeros.map(function(valor){
    return valor * 2;
});

//arrow function minimiza a função acima:
numeros.map(valor => valor * 2); //es 2015

//teste da função matematica em ecmascript
class Matematica {
    soma(x, y){
        return x + y;
    }
}

/* exemplo de decorator que já pode ser carregado no babel
@frozen class Foo {
    @configurable(false) @enumerable(true) method() {}
  } */

//typescript é bom para definição do tipo de classe
//como tipar a variavel
//var n1: string = 'sjsjshd';
//n1 = 4; //tipando uma variavel como string, por exemplo, ela nào receberá valor de inteiro
//a não ser que a variavel tenha n
//var n1 = 'sjsjshd';
//n1 = 4; 

