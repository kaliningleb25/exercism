import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> listResult = new ArrayList<>();
        String strBin = Integer.toBinaryString(number);
        int intBin = Integer.valueOf(strBin);
        List<Integer> listOfNum = new ArrayList<>();

        for(int a = intBin; a > 0; a /= 10) {
                listOfNum.add(a%10);
        }
        Collections.reverse(listOfNum);
        int size = listOfNum.size();
        
                    if(size == 1 && listOfNum.get(0) == 1)
                        listResult.add(Signal.WINK);
                    if(size == 2) {
                        listResult.add(Signal.DOUBLE_BLINK);
                        if (listOfNum.get(1) == 1)
                            listResult.add(Signal.WINK);
                        Collections.reverse(listResult);
                    }
                    if(size == 3) {
                        listResult.add(Signal.CLOSE_YOUR_EYES);
                        if (listOfNum.get(1) == 1)
                            listResult.add(Signal.DOUBLE_BLINK);
                        if (listOfNum.get(2) == 1)
                            listResult.add(Signal.WINK);
                        Collections.reverse(listResult);
                    }
                    if(size == 4) {
                        listResult.add(Signal.JUMP);
                        if (listOfNum.get(1) == 1)
                            listResult.add(Signal.CLOSE_YOUR_EYES);
                        if (listOfNum.get(2) == 1)
                            listResult.add(Signal.DOUBLE_BLINK);
                        if (listOfNum.get(3) == 1)
                            listResult.add(Signal.WINK);
                        Collections.reverse(listResult);
                    }
                    if(size == 5) {
                        if (listOfNum.get(1) == 1)
                            listResult.add(Signal.JUMP);
                        if (listOfNum.get(2) == 1)
                            listResult.add(Signal.CLOSE_YOUR_EYES);
                        if (listOfNum.get(3) == 1)
                            listResult.add(Signal.DOUBLE_BLINK);
                        if (listOfNum.get(4) == 1)
                            listResult.add(Signal.WINK);
                    }
        return listResult;

}
}
