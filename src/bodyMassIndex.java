public class bodyMassIndex {
    public int calculation(int weight, double height) {
        int index = (int) (weight / (height * height));
        return index;
    }
}
