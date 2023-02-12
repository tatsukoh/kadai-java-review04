package animal;

public class Animal {
    //フィールド
    private String name;
    private int age;

    //コンストラクタに名前・年齢の引数を設定
    public Animal( String name, int age) {
        this.name = name;
        this.age = age;
    }

    //sayという名前のpublicなメソッドの定義
    public void say() {
        System.out.println( name + "です。" + age + "歳です。" );
    }

}
