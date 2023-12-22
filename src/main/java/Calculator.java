import com.parasoft.interfaces2.ICalculator;

public class Calculator implements ICalculator {

    private Screen screen = new Screen(Screen.Brightness.MIDDLE);
    public int add(int a, int b) {
        int result = a + b;
        screen.showResult(result);
        return result;
    }

    public static class Screen {
        private Brightness brightness;

        public Screen(Brightness brightness) {
            this.brightness = brightness;
          	System.out.println("This is for luffy ");
            System.out.println("This is for luffy ");
            System.out.println("This is for luffy ");
            System.out.println("This is for luffy ");
            System.out.println("This is for luffy ");
        }

        public void showResult(int result) {
            System.out.println("The result is: " + result);
        }

        public enum Brightness {
            HIGH, MIDDLE, LOW
        }
    }
}
