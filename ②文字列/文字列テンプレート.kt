fun main(args: Array<String>) {
    
    //$をつけることで文字列中にテンプレートを埋め込むことができる
    //変数名だけなら展開される
    //式だったら実行結果に置き換わる
    val i = 10
    println("i = $i")

    //複雑な式なら｛｝でくくる
    //.lengthは文字数を返す
    val s = "kotlin"
    println("$s length is ${s.length}")

}