package zoo;

import java.util.ArrayList;
import java.util.List;
import zoo.bean.Animal;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    // 動物を登録するメソッド
    public void registerAnimal(String species, String name) {
        Animal animal = null;

        // species に応じた Animal のサブクラスのインスタンスを生成するコードを記述してください。
        // 例えば、species が "ライオン" であれば、Lion クラスのインスタンスを生成します。

        // animalが作成できた場合、動物をリストに追加して、登録メッセージを表示します。
        // animal が null の場合は、未知の種類であることを表示します。

    }

    // 動物一覧を表示するメソッド
    public void displayAnimals() {

    }

    // 餌代の合計を計算するメソッド
    public void calculateTotalCost() {

    }
}
