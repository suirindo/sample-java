class EnSample01{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        String strA = "テスト";
        String strB = "テスト";

        strA += "123";
        strB += "123";

        System.out.println("x = " + x );
        System.out.println("y = " + y );

        if( x == y) {
            System.out.println("xとyの値は一致します。");
        }else{
            System.out.println("xとyの値は一致しません。");
        }

        System.out.println("StrA = " + strA);
        System.out.println("StrB = " + strB);

        if(strA.equals(strB) == true) {
            System.out.println("strAとstrBの文字列は一致します。");
        }else{
            System.out.println("strAとstrBの文字列は一致しません。");

        }
    }
}