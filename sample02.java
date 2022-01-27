import java.io.*;

public class sample02{
    public static void main(String[] args) {
        int o;
        byte r[] = new byte[100];
        System.out.println("あなたのテトリス最高得点は？");

        try{
            System.in.read(r);
            o = Integer.parseInt ((new String(r)).trim());
        }catch(IOException e){
            o = 0;
        }

        if(o >= 10000){
            System.out.println("プロ級の実力者です!");
        }else if(5000 <= o && o < 10000) {
            System.out.println("なかなかの実力者です!");
        }else{
            System.out.println("ノーコメント!");
        }
    }
}