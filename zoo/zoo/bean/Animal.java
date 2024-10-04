package zoo.bean;

public class Animal {
    // 変数: name, species, classification, foodCostを作成してください。
    public String name;
    public String species;
    public String classification;
    public int foodCost;
    
    // コンストラクタ: 各プロパティを初期化するコンストラクタを定義してください。
    public Animal(String name, String species, String classification, int foodCost) {
        this.name = name;
        this.species = species;
        this.classification = classification;
        this.foodCost = foodCost;
    }
    // Getter メソッド: name, species, classification, foodCost の Getter メソッドを定義してください。
    public String getName() {
        return this.name;
    }
    
    public String getSpecie() {
        return this.species;
    }
    
    public String getClassification() {
        return this.classification;
    }
    
    public int getFoodCost() {
        return this.foodCost;
    }
    // toString メソッド: 動物の情報を表示するための文字列を返すメソッドを定義してください。
    @Override
    public String toString() {
        return "名前" + name + "種" + species + "分類" + classification + "餌代" + foodCost;
    }
}
