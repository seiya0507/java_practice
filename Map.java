import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// HashMapを生成する場合
Map<Integer, String> map1 = new HashMap<Integer, String>();

// TreeMapを生成する場合
Map<String, String> map2 = new TreeMap<String, String>();

// 要素を追加する
map1.put(0, "ぶどう");
map1.put(3, "もも");

// 登録済みのキーで追加すると上書きされる
map1.put(0, "マスカット");

// 要素を取得する
map1.get(0); // マスカットを返す
map1.get(1); // nullを返す

// キーの存在チェック (trueを返す)
map1.containsKey(0);

// 値の存在チェック (falseを返す)
map1.containsValue("ぶどう");

map1.size(); // 2を返す

// キーを指定して要素を削除する
map1.remove(0);
map1.remove(1); // 何もしない

// キーと値を指定して要素を削除する
map1.remove(3, "もも");
map1.remove(3, "なし"); // 何もしない