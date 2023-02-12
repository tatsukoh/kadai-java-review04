package animal;

public class Human extends Animal implements Thinkable {

    //趣味を保管するフィールド
    private String hobby;

    //コンストラクタで名前、年齢、趣味の情報を格納する引数を設定
    public Human( String name, int age, String hobby ) {
        //名前と年齢の初期化はスーパークラスのコンストラクタを利用
        super( name,age );
        this.hobby = hobby;
    }

    //thinkメソッドを実装
    @Override
    public void think() {
        System.out.println( "私は" + hobby + "について考えています。" );
    }


}
