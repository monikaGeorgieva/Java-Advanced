import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> symbolCount = new TreeMap<>();
        String line = scanner.nextLine();
        for (char symbol: line.toCharArray()) {
            //1.Имам ли запис който пази бройката за тази буква
            //ако имам:
            if (symbolCount.containsKey(symbol)){
                //-> увеличавам броя с 1 (+1)
                int count = symbolCount.get(symbol) + 1;
                symbolCount.put(symbol, count);
            }else{
                //ако нямам:
                //--> нов запис с брой 1
                symbolCount.put(symbol,1);
            }

        }
        //: 1 time/s
        //entrySet() ->  съвкупност от записи
        //entry -> един запис
        symbolCount.entrySet().forEach(entry -> System.out.printf("%c: %d time/s\n",entry.getKey(),entry.getValue()));
    }
}
//SoftUni rocks
//output:
// : 1 time/s
//S: 1 time/s
//U: 1 time/s
//c: 1 time/s
//f: 1 time/s
//i: 1 time/s
//k: 1 time/s
//n: 1 time/s
//o: 2 time/s
//r: 1 time/s
//s: 1 time/s
//t: 1 time/s
