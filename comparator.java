Collections.sort(
    animals,
    new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        // 数値が小さい順に並べる
        return x.compareTo(y);
      }
    });