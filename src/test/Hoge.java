import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hoge {
    public static void main(String[] args) throws Exception
    {
        // 入力の読み取り
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 計算 & 表示
        System.out.println(rmOver(fact(n), 9));
    }

    // 階乗計算しながら不要な桁を削除していく
    private static long fact(int b)
    {
        long _ans = 1;
        for(int i = 1; i <= b; i++)
        {

            // 普通の階乗計算風の処理
            _ans = _ans * i;

            // 下の0を消す
            _ans = rmUnderZero(_ans);

            // 11桁以上を消す
            _ans = rmOver(_ans, 11);
        }
        return _ans;
    }

    // 下の桁のゼロは削除
    private static long rmUnderZero(long i)
    {
        while(true)
        {
            if(i % 10 == 0)
            {
                i = i / 10;
            }
            else
            {
                break;
            }
        }
        return i;
    }

    // 指定桁以上を削除
    private static long rmOver(long i, int k)
    {
        String str = Long.toString(i);
        int len = str.length();
        if(len < k)
        {
            return i;
        }
        return Long.parseLong(str.substring(len - k, len));
    }
}