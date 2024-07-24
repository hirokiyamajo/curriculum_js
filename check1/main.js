//問１
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓

function isEven() {
    for(let num = 0 ; num < numbers.length ; num++){
        if(num % 2 === 0){
            console.log(num + 'は偶数です');
        }
    }
}

isEven();

//問２
class Car{

    constructor(gas, number){
        this.gas = gas;
        this.number = number;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.number}です。`);
    }

}

let car = new Car('レギュラー', 1111);
car.getNumGas();