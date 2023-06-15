package OOP_GB_4335.Sem7.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] age) {
        Random rnd = ThreadLocalRandom.current();
        List<iItemGenerator> genList = new ArrayList<>();
        genList.add(new GoldGenerator());
        genList.add(new GemGenerator());

        for (int i = 0; i < 10; i++) {
            int indexFabtic = Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1);

            iItemGenerator item = genList.get(indexFabtic);
            item.openRerward();
        }
    }
}
