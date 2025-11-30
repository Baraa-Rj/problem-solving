import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CarFleetsWithStack {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));

        Deque<Double> stack = new ArrayDeque<>();
        for (Car car : cars) {
            double time = (double)(target - car.position) / car.speed;

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

        }
        return stack.size();
    }

    private static class Car {
        int position;
        int speed;
        Car(int p, int s) {
            position = p;
            speed = s;
        }
    }
}
